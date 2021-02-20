package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaCertificate extends StObject {
  
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
  implicit class ShaCertificateMutableBuilder[Self <: ShaCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertType(value: String): Self = StObject.set(x, "certType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertTypeUndefined: Self = StObject.set(x, "certType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShaHash(value: String): Self = StObject.set(x, "shaHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaHashUndefined: Self = StObject.set(x, "shaHash", js.undefined)
  }
}
