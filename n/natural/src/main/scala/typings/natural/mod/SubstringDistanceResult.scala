package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstringDistanceResult extends StObject {
  
  var distance: Double
  
  var substring: String
}
object SubstringDistanceResult {
  
  inline def apply(distance: Double, substring: String): SubstringDistanceResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], substring = substring.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstringDistanceResult]
  }
  
  extension [Self <: SubstringDistanceResult](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setSubstring(value: String): Self = StObject.set(x, "substring", value.asInstanceOf[js.Any])
  }
}
