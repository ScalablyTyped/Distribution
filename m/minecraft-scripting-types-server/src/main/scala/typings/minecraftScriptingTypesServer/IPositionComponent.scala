package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
  */
trait IPositionComponent extends StObject {
  
  /**
    * Position along the X-Axis (east-west) of the entity
    * @default 0.0
    */
  var x: Double
  
  /**
    * Position along the Y-Axis (height) of the entity
    * @default 0.0
    */
  var y: Double
  
  /**
    * Position along the Z-Axis (north-south) of the entity
    * @default 0.0
    */
  var z: Double
}
object IPositionComponent {
  
  inline def apply(x: Double, y: Double, z: Double): IPositionComponent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPositionComponent] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
