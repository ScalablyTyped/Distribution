package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSasportal.anon.CallbackFields
import typings.maximMazurokGapiClientSasportal.anon.FieldsKey
import typings.maximMazurokGapiClientSasportal.anon.KeyOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallerResource extends StObject {
  
  /** Generates a secret to be used with the ValidateInstaller. */
  def generateSecret(request: CallbackFields): Request[SasPortalGenerateSecretResponse] = js.native
  def generateSecret(request: FieldsKey, body: SasPortalGenerateSecretRequest): Request[SasPortalGenerateSecretResponse] = js.native
  
  def validate(request: FieldsKey, body: SasPortalValidateInstallerRequest): Request[js.Object] = js.native
  /** Validates the identity of a Certified Professional Installer (CPI). */
  def validate(request: KeyOauthtoken): Request[js.Object] = js.native
}
