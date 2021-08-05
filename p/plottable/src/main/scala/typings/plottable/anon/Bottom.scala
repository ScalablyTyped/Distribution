package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import typings.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: typings.plottable.plottableStrings.bottom
  
  var left: typings.plottable.plottableStrings.left
  
  var right: typings.plottable.plottableStrings.right
  
  var top: typings.plottable.plottableStrings.top
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal(bottom = "bottom", left = "left", right = "right", top = "top")
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
