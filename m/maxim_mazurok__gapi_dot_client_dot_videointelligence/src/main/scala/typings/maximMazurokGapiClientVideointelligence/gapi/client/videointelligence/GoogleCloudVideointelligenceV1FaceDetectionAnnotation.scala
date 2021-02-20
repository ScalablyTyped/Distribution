package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1FaceDetectionAnnotation extends StObject {
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1FaceDetectionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1FaceDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1FaceDetectionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1FaceDetectionAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1FaceDetectionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
