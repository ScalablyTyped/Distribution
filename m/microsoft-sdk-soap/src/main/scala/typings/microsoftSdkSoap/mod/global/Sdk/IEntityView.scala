package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntityView extends StObject {
  
  var attributes: AttributeCollection
  
  var entityState: EntityState
  
  var id: java.lang.String
  
  var logicalName: java.lang.String
  
  var relatedEntities: RelatedEntityCollection
}
object IEntityView {
  
  inline def apply(
    attributes: AttributeCollection,
    entityState: EntityState,
    id: java.lang.String,
    logicalName: java.lang.String,
    relatedEntities: RelatedEntityCollection
  ): IEntityView = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], entityState = entityState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], relatedEntities = relatedEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityView]
  }
  
  extension [Self <: IEntityView](x: Self) {
    
    inline def setAttributes(value: AttributeCollection): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setEntityState(value: EntityState): Self = StObject.set(x, "entityState", value.asInstanceOf[js.Any])
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogicalName(value: java.lang.String): Self = StObject.set(x, "logicalName", value.asInstanceOf[js.Any])
    
    inline def setRelatedEntities(value: RelatedEntityCollection): Self = StObject.set(x, "relatedEntities", value.asInstanceOf[js.Any])
  }
}
