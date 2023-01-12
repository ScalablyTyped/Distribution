package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityMentionRelationship extends StObject {
  
  /** The model's confidence in this annotation. A number between 0 and 1. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** object_id is the id of the object entity mention. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** subject_id is the id of the subject entity mention. */
  var subjectId: js.UndefOr[String] = js.undefined
}
object EntityMentionRelationship {
  
  inline def apply(): EntityMentionRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMentionRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityMentionRelationship] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSubjectId(value: String): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
