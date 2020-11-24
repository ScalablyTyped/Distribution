package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity extends js.Object {
  
  /** The recognized celebrity. */
  var celebrity: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Celebrity] = js.native
  
  /** Recognition confidence. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrityOps[Self <: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity] (val x: Self) extends AnyVal {
    
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
    def setCelebrity(value: GoogleCloudVideointelligenceV1p3beta1Celebrity): Self = this.set("celebrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCelebrity: Self = this.set("celebrity", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
  }
}
