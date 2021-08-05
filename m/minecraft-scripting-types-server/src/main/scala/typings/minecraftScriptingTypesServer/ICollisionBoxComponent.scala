package typings.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
  */
trait ICollisionBoxComponent extends StObject {
  
  /**
    * Height of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var height: Double
  
  /**
    * Width and Depth of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var width: Double
}
object ICollisionBoxComponent {
  
  inline def apply(height: Double, width: Double): ICollisionBoxComponent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionBoxComponent]
  }
  
  extension [Self <: ICollisionBoxComponent](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
