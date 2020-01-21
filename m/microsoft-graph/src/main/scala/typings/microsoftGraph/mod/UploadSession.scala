package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSession extends js.Object {
  /**
    * The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration
    * time is reached.
    */
  var expirationDateTime: js.UndefOr[String] = js.undefined
  /**
    * A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format
    * 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file).
    */
  var nextExpectedRanges: js.UndefOr[js.Array[String]] = js.undefined
  // The URL endpoint that accepts PUT requests for byte ranges of the file.
  var uploadUrl: js.UndefOr[String] = js.undefined
}

object UploadSession {
  @scala.inline
  def apply(
    expirationDateTime: String = null,
    nextExpectedRanges: js.Array[String] = null,
    uploadUrl: String = null
  ): UploadSession = {
    val __obj = js.Dynamic.literal()
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime.asInstanceOf[js.Any])
    if (nextExpectedRanges != null) __obj.updateDynamic("nextExpectedRanges")(nextExpectedRanges.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSession]
  }
}

