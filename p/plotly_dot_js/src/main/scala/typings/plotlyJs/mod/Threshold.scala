package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialGaugeLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  var line: PartialGaugeLine
  
  var thickness: Double
  
  var value: Double
}
object Threshold {
  
  @scala.inline
  def apply(line: PartialGaugeLine, thickness: Double, value: Double): Threshold = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: PartialGaugeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
