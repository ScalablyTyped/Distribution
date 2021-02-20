package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
  */
@js.native
trait IRotationComponent extends StObject {
  
  /**
    * Controls the head rotation looking up and down
    * @default 0.0
    */
  var x: Double = js.native
  
  /**
    * Controls the body rotation parallel to the floor
    * @default 0.0
    */
  var y: Double = js.native
}
object IRotationComponent {
  
  @scala.inline
  def apply(x: Double, y: Double): IRotationComponent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRotationComponent]
  }
  
  @scala.inline
  implicit class IRotationComponentMutableBuilder[Self <: IRotationComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
