package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InfoTypeTransformations extends js.Object {
  
  /** Required. Transformation for each infoType. Cannot specify more than one for a given infoType. */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeTransformation]] = js.native
}
object GooglePrivacyDlpV2InfoTypeTransformations {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeTransformations]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeTransformationsOps[Self <: GooglePrivacyDlpV2InfoTypeTransformations] (val x: Self) extends AnyVal {
    
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
    def setTransformationsVarargs(value: GooglePrivacyDlpV2InfoTypeTransformation*): Self = this.set("transformations", js.Array(value :_*))
    
    @scala.inline
    def setTransformations(value: js.Array[GooglePrivacyDlpV2InfoTypeTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
  }
}
