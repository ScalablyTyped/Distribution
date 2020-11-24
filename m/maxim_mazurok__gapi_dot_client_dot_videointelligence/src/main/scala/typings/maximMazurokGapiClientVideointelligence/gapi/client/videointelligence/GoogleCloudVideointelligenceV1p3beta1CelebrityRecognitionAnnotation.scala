package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation extends js.Object {
  
  /** The tracks detected from the input video, including recognized celebrities and other detected faces in the video. */
  var celebrityTracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]] = js.native
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotationOps[Self <: GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation] (val x: Self) extends AnyVal {
    
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
    def setCelebrityTracksVarargs(value: GoogleCloudVideointelligenceV1p3beta1CelebrityTrack*): Self = this.set("celebrityTracks", js.Array(value :_*))
    
    @scala.inline
    def setCelebrityTracks(value: js.Array[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]): Self = this.set("celebrityTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCelebrityTracks: Self = this.set("celebrityTracks", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
