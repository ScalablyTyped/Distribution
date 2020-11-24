package typings.pkijs.revokedCertificateMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokedCertificate extends js.Object {
  
  var crlEntryExtensions: typings.pkijs.extensionsMod.default = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var revocationDate: typings.pkijs.timeMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var userCertificate: Integer = js.native
}
object RevokedCertificate {
  
  @scala.inline
  def apply(
    crlEntryExtensions: typings.pkijs.extensionsMod.default,
    fromSchema: js.Any => Unit,
    revocationDate: typings.pkijs.timeMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    userCertificate: Integer
  ): RevokedCertificate = {
    val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), revocationDate = revocationDate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), userCertificate = userCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokedCertificate]
  }
  
  @scala.inline
  implicit class RevokedCertificateOps[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
    
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
    def setCrlEntryExtensions(value: typings.pkijs.extensionsMod.default): Self = this.set("crlEntryExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevocationDate(value: typings.pkijs.timeMod.default): Self = this.set("revocationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserCertificate(value: Integer): Self = this.set("userCertificate", value.asInstanceOf[js.Any])
  }
}
