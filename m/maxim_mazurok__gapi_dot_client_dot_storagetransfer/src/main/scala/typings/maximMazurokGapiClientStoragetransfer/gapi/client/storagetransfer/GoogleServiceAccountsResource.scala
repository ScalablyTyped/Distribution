package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStoragetransfer.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleServiceAccountsResource extends StObject {
  
  /**
    * Returns the Google service account that is used by Storage Transfer Service to access buckets in the project where transfers run or in other projects. Each Google service account is
    * associated with one Google Cloud Platform Console project. Users should add this service account to the Google Cloud Storage bucket ACLs to grant access to Storage Transfer Service.
    * This service account is created and owned by Storage Transfer Service and can only be used by Storage Transfer Service.
    */
  def get(): Request[GoogleServiceAccount] = js.native
  def get(request: Accesstoken): Request[GoogleServiceAccount] = js.native
}
