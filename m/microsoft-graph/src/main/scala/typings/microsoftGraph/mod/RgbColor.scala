package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RgbColor extends StObject {
  
  // Blue value
  var b: js.UndefOr[Double] = js.native
  
  // Green value
  var g: js.UndefOr[Double] = js.native
  
  // Red value
  var r: js.UndefOr[Double] = js.native
}
object RgbColor {
  
  @scala.inline
  def apply(): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbColor]
  }
  
  @scala.inline
  implicit class RgbColorMutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    @scala.inline
    def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
