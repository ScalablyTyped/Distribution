package typings.pkijs.kekidentifierMod

import typings.asn1js.mod.GeneralizedTime
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KEKIdentifier extends js.Object {
  
  var date: js.UndefOr[GeneralizedTime] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var keyIdentifier: OctetString = js.native
  
  var other: js.UndefOr[typings.pkijs.otherKeyAttributeMod.default] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object KEKIdentifier {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): KEKIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[KEKIdentifier]
  }
  
  @scala.inline
  implicit class KEKIdentifierOps[Self <: KEKIdentifier] (val x: Self) extends AnyVal {
    
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
    def setKeyIdentifier(value: OctetString): Self = this.set("keyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDate(value: GeneralizedTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setOther(value: typings.pkijs.otherKeyAttributeMod.default): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
}
