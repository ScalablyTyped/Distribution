package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectDescription extends js.Object {
  
  /** The "common name" of the distinguished name. */
  var commonName: js.UndefOr[String] = js.native
  
  /** The serial number encoded in lowercase hexadecimal. */
  var hexSerialNumber: js.UndefOr[String] = js.native
  
  /** For convenience, the actual lifetime of an issued certificate. Corresponds to 'not_after_time' - 'not_before_time'. */
  var lifetime: js.UndefOr[String] = js.native
  
  /** The time at which the certificate expires. */
  var notAfterTime: js.UndefOr[String] = js.native
  
  /** The time at which the certificate becomes valid. */
  var notBeforeTime: js.UndefOr[String] = js.native
  
  /** Contains distinguished name fields such as the location and organization. */
  var subject: js.UndefOr[Subject] = js.native
  
  /** The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.native
}
object SubjectDescription {
  
  @scala.inline
  def apply(): SubjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDescription]
  }
  
  @scala.inline
  implicit class SubjectDescriptionOps[Self <: SubjectDescription] (val x: Self) extends AnyVal {
    
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
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonName: Self = this.set("commonName", js.undefined)
    
    @scala.inline
    def setHexSerialNumber(value: String): Self = this.set("hexSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexSerialNumber: Self = this.set("hexSerialNumber", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    
    @scala.inline
    def setNotAfterTime(value: String): Self = this.set("notAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfterTime: Self = this.set("notAfterTime", js.undefined)
    
    @scala.inline
    def setNotBeforeTime(value: String): Self = this.set("notBeforeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBeforeTime: Self = this.set("notBeforeTime", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectAltName(value: SubjectAltNames): Self = this.set("subjectAltName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAltName: Self = this.set("subjectAltName", js.undefined)
  }
}
