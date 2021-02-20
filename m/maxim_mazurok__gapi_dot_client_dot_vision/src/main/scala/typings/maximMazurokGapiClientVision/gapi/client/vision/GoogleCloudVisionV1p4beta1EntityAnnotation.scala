package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1EntityAnnotation extends StObject {
  
  /** Image region to which this entity belongs. Not produced for `LABEL_DETECTION` features. */
  var boundingPoly: js.UndefOr[GoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /**
    * **Deprecated. Use `score` instead.** The accuracy of the entity detection in an image. For example, for an image in which the "Eiffel Tower" entity is detected, this field
    * represents the confidence that there is a tower in the query image. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Entity textual description, expressed in its `locale` language. */
  var description: js.UndefOr[String] = js.native
  
  /** The language code for the locale in which the entity textual `description` is expressed. */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The location information for the detected entity. Multiple `LocationInfo` elements can be present because one location may indicate the location of the scene in the image, and
    * another location may indicate the location of the place where the image was taken. Location information is usually present for landmarks.
    */
  var locations: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1LocationInfo]] = js.native
  
  /** Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/). */
  var mid: js.UndefOr[String] = js.native
  
  /** Some entities may have optional user-supplied `Property` (name/value) fields, such a score or string that qualifies the entity. */
  var properties: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1Property]] = js.native
  
  /** Overall score of the result. Range [0, 1]. */
  var score: js.UndefOr[Double] = js.native
  
  /**
    * The relevancy of the ICA (Image Content Annotation) label to the image. For example, the relevancy of "tower" is likely higher to an image containing the detected "Eiffel Tower"
    * than to an image containing a detected distant towering building, even though the confidence that there is a tower in each image may be the same. Range [0, 1].
    */
  var topicality: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p4beta1EntityAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1EntityAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1EntityAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1EntityAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p4beta1EntityAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[GoogleCloudVisionV1p4beta1LocationInfo]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleCloudVisionV1p4beta1LocationInfo*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[GoogleCloudVisionV1p4beta1Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: GoogleCloudVisionV1p4beta1Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setTopicality(value: Double): Self = StObject.set(x, "topicality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicalityUndefined: Self = StObject.set(x, "topicality", js.undefined)
  }
}
