package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1CelebrityTrack extends js.Object {
  
  /** Top N match of the celebrities for the face in this track. */
  var celebrities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]] = js.native
  
  /** A track of a person's face. */
  var faceTrack: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Track] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1CelebrityTrack {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1CelebrityTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1CelebrityTrackOps[Self <: GoogleCloudVideointelligenceV1p3beta1CelebrityTrack] (val x: Self) extends AnyVal {
    
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
    def setCelebritiesVarargs(value: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity*): Self = this.set("celebrities", js.Array(value :_*))
    
    @scala.inline
    def setCelebrities(value: js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]): Self = this.set("celebrities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCelebrities: Self = this.set("celebrities", js.undefined)
    
    @scala.inline
    def setFaceTrack(value: GoogleCloudVideointelligenceV1p3beta1Track): Self = this.set("faceTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceTrack: Self = this.set("faceTrack", js.undefined)
  }
}
