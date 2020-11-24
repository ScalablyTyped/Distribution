package typings.pkijs.otherRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherRecipientInfo extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var oriType: String = js.native
  
  var oriValue: js.Any = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object OtherRecipientInfo {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    oriType: String,
    oriValue: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), oriType = oriType.asInstanceOf[js.Any], oriValue = oriValue.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherRecipientInfo]
  }
  
  @scala.inline
  implicit class OtherRecipientInfoOps[Self <: OtherRecipientInfo] (val x: Self) extends AnyVal {
    
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriType(value: String): Self = this.set("oriType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriValue(value: js.Any): Self = this.set("oriValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
