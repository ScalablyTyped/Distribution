package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var bottom: typings.plottable.plottableStrings.bottom
  
  var top: typings.plottable.plottableStrings.top
}
object Top {
  
  inline def apply(): Top = {
    val __obj = js.Dynamic.literal(bottom = "bottom", top = "top")
    __obj.asInstanceOf[Top]
  }
  
  extension [Self <: Top](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
