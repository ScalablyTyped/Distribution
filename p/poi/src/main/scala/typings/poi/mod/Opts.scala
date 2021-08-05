package typings.poi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts
  extends StObject
     with /* k */ StringDictionary[js.Any] {
  
  var mode: Mode
  
  var `type`: String
}
object Opts {
  
  inline def apply(mode: Mode, `type`: String): Opts = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  extension [Self <: Opts](x: Self) {
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
