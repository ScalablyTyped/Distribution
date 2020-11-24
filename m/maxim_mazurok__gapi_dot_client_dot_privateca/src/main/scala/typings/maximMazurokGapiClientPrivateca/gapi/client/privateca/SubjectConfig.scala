package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectConfig extends js.Object {
  
  /** Optional. The "common name" of the distinguished name. */
  var commonName: js.UndefOr[String] = js.native
  
  /** Required. Contains distinguished name fields such as the location and organization. */
  var subject: js.UndefOr[Subject] = js.native
  
  /** Optional. The subject alternative name fields. */
  var subjectAltName: js.UndefOr[SubjectAltNames] = js.native
}
object SubjectConfig {
  
  @scala.inline
  def apply(): SubjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectConfig]
  }
  
  @scala.inline
  implicit class SubjectConfigOps[Self <: SubjectConfig] (val x: Self) extends AnyVal {
    
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
    def setSubject(value: Subject): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectAltName(value: SubjectAltNames): Self = this.set("subjectAltName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectAltName: Self = this.set("subjectAltName", js.undefined)
  }
}
