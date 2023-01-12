package typings.nouislider.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range
  extends StObject
     with /* key */ StringDictionary[SubRange] {
  
  var max: SubRange
  
  var min: SubRange
}
object Range {
  
  inline def apply(max: SubRange, min: SubRange): Range = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setMax(value: SubRange): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMin(value: SubRange): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value*))
  }
}
