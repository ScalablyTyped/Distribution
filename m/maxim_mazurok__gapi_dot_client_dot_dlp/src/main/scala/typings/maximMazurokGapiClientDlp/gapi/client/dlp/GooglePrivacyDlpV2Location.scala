package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Location extends js.Object {
  
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the finding's containing element. Note that when the content is not textual, this references the UTF-8 encoded
    * textual representation of the content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.native
  
  /** Unicode character offsets delimiting the finding. These are relative to the finding's containing element. Provided when the content is text. */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.native
  
  /** Information about the container where this finding occurred, if available. */
  var container: js.UndefOr[GooglePrivacyDlpV2Container] = js.native
  
  /** List of nested objects pointing to the precise location of the finding within the file or record. */
  var contentLocations: js.UndefOr[js.Array[GooglePrivacyDlpV2ContentLocation]] = js.native
}
object GooglePrivacyDlpV2Location {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Location]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LocationOps[Self <: GooglePrivacyDlpV2Location] (val x: Self) extends AnyVal {
    
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
    def setByteRange(value: GooglePrivacyDlpV2Range): Self = this.set("byteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteRange: Self = this.set("byteRange", js.undefined)
    
    @scala.inline
    def setCodepointRange(value: GooglePrivacyDlpV2Range): Self = this.set("codepointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodepointRange: Self = this.set("codepointRange", js.undefined)
    
    @scala.inline
    def setContainer(value: GooglePrivacyDlpV2Container): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContentLocationsVarargs(value: GooglePrivacyDlpV2ContentLocation*): Self = this.set("contentLocations", js.Array(value :_*))
    
    @scala.inline
    def setContentLocations(value: js.Array[GooglePrivacyDlpV2ContentLocation]): Self = this.set("contentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLocations: Self = this.set("contentLocations", js.undefined)
  }
}
