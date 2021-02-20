package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityView extends StObject {
  
  var attributes: AttributeCollection = js.native
  
  var entityState: EntityState = js.native
  
  var id: java.lang.String = js.native
  
  var logicalName: java.lang.String = js.native
  
  var relatedEntities: RelatedEntityCollection = js.native
}
object IEntityView {
  
  @scala.inline
  def apply(
    attributes: AttributeCollection,
    entityState: EntityState,
    id: java.lang.String,
    logicalName: java.lang.String,
    relatedEntities: RelatedEntityCollection
  ): IEntityView = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], entityState = entityState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], relatedEntities = relatedEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityView]
  }
  
  @scala.inline
  implicit class IEntityViewMutableBuilder[Self <: IEntityView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeCollection): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityState(value: EntityState): Self = StObject.set(x, "entityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: java.lang.String): Self = StObject.set(x, "logicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedEntities(value: RelatedEntityCollection): Self = StObject.set(x, "relatedEntities", value.asInstanceOf[js.Any])
  }
}
