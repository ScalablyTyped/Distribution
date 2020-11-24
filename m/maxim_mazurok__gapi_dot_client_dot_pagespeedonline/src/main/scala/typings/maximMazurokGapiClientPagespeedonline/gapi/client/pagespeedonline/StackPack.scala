package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackPack extends js.Object {
  
  /** The stack pack advice strings. */
  var descriptions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.StackPack with TopLevel[js.Any]
  ] = js.native
  
  /** The stack pack icon data uri. */
  var iconDataURL: js.UndefOr[String] = js.native
  
  /** The stack pack id. */
  var id: js.UndefOr[String] = js.native
  
  /** The stack pack title. */
  var title: js.UndefOr[String] = js.native
}
object StackPack {
  
  @scala.inline
  def apply(): StackPack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackPack]
  }
  
  @scala.inline
  implicit class StackPackOps[Self <: StackPack] (val x: Self) extends AnyVal {
    
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
    def setDescriptions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPagespeedonline.maximMazurokGapiClientPagespeedonlineStrings.StackPack with TopLevel[js.Any]
    ): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    
    @scala.inline
    def setIconDataURL(value: String): Self = this.set("iconDataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconDataURL: Self = this.set("iconDataURL", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
