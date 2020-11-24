package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaCertificate extends js.Object {
  
  /** The type of SHA certificate encoded in the hash. */
  var certType: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the ShaCertificate for the AndroidApp, in the format: projects/PROJECT_IDENTIFIER/androidApps/APP_ID/sha/SHA_HASH * PROJECT_IDENTIFIER: the parent Project's
    * [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using
    * project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. *
    * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)). * SHA_HASH: the certificate hash for the App
    * (see [`shaHash`](../projects.androidApps.sha#ShaCertificate.FIELDS.sha_hash)).
    */
  var name: js.UndefOr[String] = js.native
  
  /** The certificate hash for the `AndroidApp`. */
  var shaHash: js.UndefOr[String] = js.native
}
object ShaCertificate {
  
  @scala.inline
  def apply(): ShaCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaCertificate]
  }
  
  @scala.inline
  implicit class ShaCertificateOps[Self <: ShaCertificate] (val x: Self) extends AnyVal {
    
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
    def setCertType(value: String): Self = this.set("certType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertType: Self = this.set("certType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShaHash(value: String): Self = this.set("shaHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShaHash: Self = this.set("shaHash", js.undefined)
  }
}
