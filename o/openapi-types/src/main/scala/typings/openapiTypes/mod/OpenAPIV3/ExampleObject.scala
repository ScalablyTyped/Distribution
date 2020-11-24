package typings.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExampleObject extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var externalValue: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ExampleObject {
  
  @scala.inline
  def apply(): ExampleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExampleObject]
  }
  
  @scala.inline
  implicit class ExampleObjectOps[Self <: ExampleObject] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExternalValue(value: String): Self = this.set("externalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalValue: Self = this.set("externalValue", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
