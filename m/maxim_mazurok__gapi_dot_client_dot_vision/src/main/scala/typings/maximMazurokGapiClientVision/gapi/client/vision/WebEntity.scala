package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebEntity extends StObject {
  
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Opaque entity ID. */
  var entityId: js.UndefOr[String] = js.undefined
  
  /** Overall relevancy score for the entity. Not normalized and not comparable across different image queries. */
  var score: js.UndefOr[Double] = js.undefined
}
object WebEntity {
  
  @scala.inline
  def apply(): WebEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebEntity]
  }
  
  @scala.inline
  implicit class WebEntityMutableBuilder[Self <: WebEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
