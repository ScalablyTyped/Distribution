package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityType extends StObject {
  
  var entityType: String
  
  var name: String
  
  var parentFrame: String
  
  var uuid: String
}
object EntityType {
  
  @scala.inline
  def apply(entityType: String, name: String, parentFrame: String, uuid: String): EntityType = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentFrame = parentFrame.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityType]
  }
  
  @scala.inline
  implicit class EntityTypeMutableBuilder[Self <: EntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrame(value: String): Self = StObject.set(x, "parentFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
