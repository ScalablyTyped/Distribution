package typings.plottable.anon

import typings.plottable.plottableStrings.horizontal
import typings.plottable.plottableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Horizontal extends StObject {
  
  var horizontal: typings.plottable.plottableStrings.horizontal
  
  var vertical: typings.plottable.plottableStrings.vertical
}
object Horizontal {
  
  inline def apply(): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = "horizontal", vertical = "vertical")
    __obj.asInstanceOf[Horizontal]
  }
  
  extension [Self <: Horizontal](x: Self) {
    
    inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
