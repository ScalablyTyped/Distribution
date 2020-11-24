package typings.pkijs.issuerAndSerialNumberMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuerAndSerialNumber extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var issuer: typings.pkijs.relativeDistinguishedNamesMod.default = js.native
  
  var serialNumber: Integer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object IssuerAndSerialNumber {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    issuer: typings.pkijs.relativeDistinguishedNamesMod.default,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
  
  @scala.inline
  implicit class IssuerAndSerialNumberOps[Self <: IssuerAndSerialNumber] (val x: Self) extends AnyVal {
    
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
    def setIssuer(value: typings.pkijs.relativeDistinguishedNamesMod.default): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: Integer): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
