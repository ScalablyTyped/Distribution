package typings.openfin.shapesPlatformMod

import typings.openfin.entityTypeMod.EntityType
import typings.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWindowContextPayload extends StObject {
  
  var entityType: EntityType
  
  var target: Identity
}
object GetWindowContextPayload {
  
  inline def apply(entityType: EntityType, target: Identity): GetWindowContextPayload = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowContextPayload]
  }
  
  extension [Self <: GetWindowContextPayload](x: Self) {
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
