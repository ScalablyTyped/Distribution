package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1TextAnnotation extends StObject {
  
  /** All video segments where OCR detected text appears. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1TextSegment]] = js.undefined
  
  /** The detected text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1TextAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1TextAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1TextAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1TextAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1p3beta1TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1p3beta1TextSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
