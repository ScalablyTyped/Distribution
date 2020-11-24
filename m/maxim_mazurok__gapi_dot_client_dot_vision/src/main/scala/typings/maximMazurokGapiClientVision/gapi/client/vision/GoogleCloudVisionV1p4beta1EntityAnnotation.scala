package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1EntityAnnotation extends js.Object {
  
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
  implicit class GoogleCloudVisionV1p4beta1EntityAnnotationOps[Self <: GoogleCloudVisionV1p4beta1EntityAnnotation] (val x: Self) extends AnyVal {
    
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
    def setBoundingPoly(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleCloudVisionV1p4beta1LocationInfo*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[GoogleCloudVisionV1p4beta1LocationInfo]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMid: Self = this.set("mid", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: GoogleCloudVisionV1p4beta1Property*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[GoogleCloudVisionV1p4beta1Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setTopicality(value: Double): Self = this.set("topicality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicality: Self = this.set("topicality", js.undefined)
  }
}
