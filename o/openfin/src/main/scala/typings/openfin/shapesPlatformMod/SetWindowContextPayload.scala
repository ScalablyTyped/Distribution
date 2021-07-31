package typings.openfin.shapesPlatformMod

import typings.openfin.entityTypeMod.EntityType
import typings.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWindowContextPayload extends StObject {
  
  var context: js.Any
  
  var entityType: EntityType
  
  var target: Identity
}
object SetWindowContextPayload {
  
  @scala.inline
  def apply(context: js.Any, entityType: EntityType, target: Identity): SetWindowContextPayload = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWindowContextPayload]
  }
  
  @scala.inline
  implicit class SetWindowContextPayloadMutableBuilder[Self <: SetWindowContextPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
