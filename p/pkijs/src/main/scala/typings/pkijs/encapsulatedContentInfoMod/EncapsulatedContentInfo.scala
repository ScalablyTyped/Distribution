package typings.pkijs.encapsulatedContentInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncapsulatedContentInfo extends js.Object {
  
  var eContent: OctetString = js.native
  
  var eContentType: String = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object EncapsulatedContentInfo {
  
  @scala.inline
  def apply(
    eContent: OctetString,
    eContentType: String,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContent = eContent.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[EncapsulatedContentInfo]
  }
  
  @scala.inline
  implicit class EncapsulatedContentInfoOps[Self <: EncapsulatedContentInfo] (val x: Self) extends AnyVal {
    
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
    def setEContent(value: OctetString): Self = this.set("eContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEContentType(value: String): Self = this.set("eContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
