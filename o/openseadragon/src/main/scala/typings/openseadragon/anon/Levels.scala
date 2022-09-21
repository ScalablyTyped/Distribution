package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Levels extends StObject {
  
  var levels: js.UndefOr[js.Array[Url]] = js.undefined
  
  var `type`: String
}
object Levels {
  
  inline def apply(`type`: String): Levels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  
  extension [Self <: Levels](x: Self) {
    
    inline def setLevels(value: js.Array[Url]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: Url*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
