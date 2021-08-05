package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels extends StObject {
  
  var levels: js.Array[Height]
  
  var `type`: String
}
object Levels {
  
  inline def apply(levels: js.Array[Height], `type`: String): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  extension [Self <: Levels](x: Self) {
    
    inline def setLevels(value: js.Array[Height]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: Height*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
