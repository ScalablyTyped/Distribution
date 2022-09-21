package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cubemap extends StObject {
  
  var cubemap: Boolean
  
  var format: Any
  
  var height: Double
  
  var levels: js.Array[js.Array[Any]]
  
  var width: Double
}
object Cubemap {
  
  inline def apply(cubemap: Boolean, format: Any, height: Double, levels: js.Array[js.Array[Any]], width: Double): Cubemap = {
    val __obj = js.Dynamic.literal(cubemap = cubemap.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cubemap]
  }
  
  extension [Self <: Cubemap](x: Self) {
    
    inline def setCubemap(value: Boolean): Self = StObject.set(x, "cubemap", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
