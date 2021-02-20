package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayHeight extends StObject {
  
  var display: String = js.native
  
  var height: Double = js.native
}
object DisplayHeight {
  
  @scala.inline
  def apply(display: String, height: Double): DisplayHeight = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayHeight]
  }
  
  @scala.inline
  implicit class DisplayHeightMutableBuilder[Self <: DisplayHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
