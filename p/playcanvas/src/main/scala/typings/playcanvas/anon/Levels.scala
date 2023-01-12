package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels extends StObject {
  
  var height: Double
  
  var levels: js.Array[js.typedarray.Uint8Array]
  
  var width: Double
}
object Levels {
  
  inline def apply(height: Double, levels: js.Array[js.typedarray.Uint8Array], width: Double): Levels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Levels] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
