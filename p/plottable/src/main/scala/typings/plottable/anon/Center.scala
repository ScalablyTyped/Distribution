package typings.plottable.anon

import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: typings.plottable.plottableStrings.center
  
  var left: typings.plottable.plottableStrings.left
  
  var right: typings.plottable.plottableStrings.right
}
object Center {
  
  @scala.inline
  def apply(): Center = {
    val __obj = js.Dynamic.literal(center = "center", left = "left", right = "right")
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
