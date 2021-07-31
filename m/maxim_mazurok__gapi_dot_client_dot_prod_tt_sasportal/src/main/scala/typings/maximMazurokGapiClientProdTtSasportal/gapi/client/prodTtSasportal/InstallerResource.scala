package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientProdTtSasportal.anon.AltCallback
import typings.maximMazurokGapiClientProdTtSasportal.anon.CallbackFields
import typings.maximMazurokGapiClientProdTtSasportal.anon.FieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallerResource extends StObject {
  
  /** Generates a secret to be used with the ValidateInstaller method */
  def generateSecret(request: AltCallback): Request[SasPortalGenerateSecretResponse] = js.native
  def generateSecret(request: CallbackFields, body: SasPortalGenerateSecretRequest): Request[SasPortalGenerateSecretResponse] = js.native
  
  def validate(request: CallbackFields, body: SasPortalValidateInstallerRequest): Request[js.Object] = js.native
  /** Validates the identity of a Certified Professional Installer (CPI). */
  def validate(request: FieldsKey): Request[js.Object] = js.native
}
