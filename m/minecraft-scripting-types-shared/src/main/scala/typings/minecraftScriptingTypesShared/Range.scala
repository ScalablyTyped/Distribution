package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  var range_max: Double = js.native
  
  var range_min: Double = js.native
}
object Range {
  
  @scala.inline
  def apply(range_max: Double, range_min: Double): Range = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange_max(value: Double): Self = StObject.set(x, "range_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange_min(value: Double): Self = StObject.set(x, "range_min", value.asInstanceOf[js.Any])
  }
}
