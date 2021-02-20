package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbuseReport extends StObject {
  
  var abuseTypes: js.UndefOr[js.Array[AbuseType]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var relatedEntities: js.UndefOr[js.Array[RelatedEntity]] = js.native
  
  var subject: js.UndefOr[Entity] = js.native
}
object AbuseReport {
  
  @scala.inline
  def apply(): AbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbuseReport]
  }
  
  @scala.inline
  implicit class AbuseReportMutableBuilder[Self <: AbuseReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbuseTypes(value: js.Array[AbuseType]): Self = StObject.set(x, "abuseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbuseTypesUndefined: Self = StObject.set(x, "abuseTypes", js.undefined)
    
    @scala.inline
    def setAbuseTypesVarargs(value: AbuseType*): Self = StObject.set(x, "abuseTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRelatedEntities(value: js.Array[RelatedEntity]): Self = StObject.set(x, "relatedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedEntitiesUndefined: Self = StObject.set(x, "relatedEntities", js.undefined)
    
    @scala.inline
    def setRelatedEntitiesVarargs(value: RelatedEntity*): Self = StObject.set(x, "relatedEntities", js.Array(value :_*))
    
    @scala.inline
    def setSubject(value: Entity): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
