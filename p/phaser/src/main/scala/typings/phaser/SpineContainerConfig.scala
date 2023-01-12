package typings.phaser

import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpineContainerConfig
  extends StObject
     with GameObjectConfig {
  
  var children: js.UndefOr[SpineGameObject | js.Array[SpineGameObject]] = js.undefined
  
  @JSName("x")
  var x_SpineContainerConfig: js.UndefOr[Double] = js.undefined
  
  @JSName("y")
  var y_SpineContainerConfig: js.UndefOr[Double] = js.undefined
}
object SpineContainerConfig {
  
  inline def apply(): SpineContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpineContainerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpineContainerConfig] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: SpineGameObject | js.Array[SpineGameObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SpineGameObject*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
