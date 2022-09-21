package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbuseReport extends StObject {
  
  var abuseTypes: js.UndefOr[js.Array[AbuseType]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var relatedEntities: js.UndefOr[js.Array[RelatedEntity]] = js.undefined
  
  var subject: js.UndefOr[Entity] = js.undefined
}
object AbuseReport {
  
  inline def apply(): AbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbuseReport]
  }
  
  extension [Self <: AbuseReport](x: Self) {
    
    inline def setAbuseTypes(value: js.Array[AbuseType]): Self = StObject.set(x, "abuseTypes", value.asInstanceOf[js.Any])
    
    inline def setAbuseTypesUndefined: Self = StObject.set(x, "abuseTypes", js.undefined)
    
    inline def setAbuseTypesVarargs(value: AbuseType*): Self = StObject.set(x, "abuseTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRelatedEntities(value: js.Array[RelatedEntity]): Self = StObject.set(x, "relatedEntities", value.asInstanceOf[js.Any])
    
    inline def setRelatedEntitiesUndefined: Self = StObject.set(x, "relatedEntities", js.undefined)
    
    inline def setRelatedEntitiesVarargs(value: RelatedEntity*): Self = StObject.set(x, "relatedEntities", js.Array(value*))
    
    inline def setSubject(value: Entity): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
