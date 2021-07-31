package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomCenter extends StObject {
  
  var bottom: typings.plottable.plottableStrings.bottom
  
  var center: typings.plottable.plottableStrings.center
  
  var top: typings.plottable.plottableStrings.top
}
object BottomCenter {
  
  @scala.inline
  def apply(): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = "bottom", center = "center", top = "top")
    __obj.asInstanceOf[BottomCenter]
  }
  
  @scala.inline
  implicit class BottomCenterMutableBuilder[Self <: BottomCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
