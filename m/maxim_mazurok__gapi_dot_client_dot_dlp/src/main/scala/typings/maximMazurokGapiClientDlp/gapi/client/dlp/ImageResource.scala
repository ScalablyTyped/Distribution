package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDlp.anon.Fields
import typings.maximMazurokGapiClientDlp.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResource extends js.Object {
  
  /**
    * Redacts potentially sensitive info from an image. This method has limits on input size, processing time, and output size. See
    * https://cloud.google.com/dlp/docs/redacting-sensitive-data-images to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically
    * choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
    */
  def redact(request: FieldsKey): Request[GooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(request: Fields, body: GooglePrivacyDlpV2RedactImageRequest): Request[GooglePrivacyDlpV2RedactImageResponse] = js.native
}
