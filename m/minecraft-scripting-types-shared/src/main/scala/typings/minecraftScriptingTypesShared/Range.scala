package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var range_max: Double
  
  var range_min: Double
}
object Range {
  
  inline def apply(range_max: Double, range_min: Double): Range = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setRange_max(value: Double): Self = StObject.set(x, "range_max", value.asInstanceOf[js.Any])
    
    inline def setRange_min(value: Double): Self = StObject.set(x, "range_min", value.asInstanceOf[js.Any])
  }
}
