package typings.physijs.mod

import typings.three.mod.Object3D
import typings.three.mod.Vector3
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConeTwistConstraintDefinition extends StObject {
  
  var axisa: Vector3
  
  var axisb: Vector3
  
  var id: Double
  
  var objecta: Object3D[Event]
  
  var objectb: Object3D[Event]
  
  var positiona: Vector3
  
  var positionb: Vector3
  
  var `type`: String
}
object ConeTwistConstraintDefinition {
  
  inline def apply(
    axisa: Vector3,
    axisb: Vector3,
    id: Double,
    objecta: Object3D[Event],
    objectb: Object3D[Event],
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): ConeTwistConstraintDefinition = {
    val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeTwistConstraintDefinition]
  }
  
  extension [Self <: ConeTwistConstraintDefinition](x: Self) {
    
    inline def setAxisa(value: Vector3): Self = StObject.set(x, "axisa", value.asInstanceOf[js.Any])
    
    inline def setAxisb(value: Vector3): Self = StObject.set(x, "axisb", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObjecta(value: Object3D[Event]): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
    
    inline def setObjectb(value: Object3D[Event]): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
    
    inline def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
    
    inline def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
