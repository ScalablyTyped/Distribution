package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryZypperPatch extends js.Object {
  
  /** The category of the patch. */
  var category: js.UndefOr[String] = js.native
  
  /** The name of the patch. */
  var patchName: js.UndefOr[String] = js.native
  
  /** The severity specified for this patch */
  var severity: js.UndefOr[String] = js.native
  
  /** Any summary information provided about this patch. */
  var summary: js.UndefOr[String] = js.native
}
object InventoryZypperPatch {
  
  @scala.inline
  def apply(): InventoryZypperPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryZypperPatch]
  }
  
  @scala.inline
  implicit class InventoryZypperPatchOps[Self <: InventoryZypperPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setPatchName(value: String): Self = this.set("patchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchName: Self = this.set("patchName", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
