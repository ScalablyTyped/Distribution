package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryWindowsUpdatePackageWindowsUpdateCategory extends js.Object {
  
  /** The identifier of the windows update category. */
  var id: js.UndefOr[String] = js.native
  
  /** The name of the windows update category. */
  var name: js.UndefOr[String] = js.native
}
object InventoryWindowsUpdatePackageWindowsUpdateCategory {
  
  @scala.inline
  def apply(): InventoryWindowsUpdatePackageWindowsUpdateCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryWindowsUpdatePackageWindowsUpdateCategory]
  }
  
  @scala.inline
  implicit class InventoryWindowsUpdatePackageWindowsUpdateCategoryOps[Self <: InventoryWindowsUpdatePackageWindowsUpdateCategory] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
