package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardMultiValuePart extends js.Object {
  
  val ID: js.Any = js.native
  
  val Value: js.Any = js.native
}
object IMetadataCardMultiValuePart {
  
  @scala.inline
  def apply(ID: js.Any, Value: js.Any): IMetadataCardMultiValuePart = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValuePart]
  }
  
  @scala.inline
  implicit class IMetadataCardMultiValuePartOps[Self <: IMetadataCardMultiValuePart] (val x: Self) extends AnyVal {
    
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
    def setID(value: js.Any): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
