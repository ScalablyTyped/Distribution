package typings.pkijs.otherRevocationInfoFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherRevocationInfoFormat extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var otherRevInfo: js.Any = js.native
  
  var otherRevInfoFormat: String = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object OtherRevocationInfoFormat {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    otherRevInfo: js.Any,
    otherRevInfoFormat: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherRevocationInfoFormat = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), otherRevInfo = otherRevInfo.asInstanceOf[js.Any], otherRevInfoFormat = otherRevInfoFormat.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherRevocationInfoFormat]
  }
  
  @scala.inline
  implicit class OtherRevocationInfoFormatOps[Self <: OtherRevocationInfoFormat] (val x: Self) extends AnyVal {
    
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
    def setOtherRevInfo(value: js.Any): Self = this.set("otherRevInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherRevInfoFormat(value: String): Self = this.set("otherRevInfoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
