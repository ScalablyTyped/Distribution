package typings.plottable.anon

import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: typings.plottable.plottableStrings.end
  
  var middle: typings.plottable.plottableStrings.middle
  
  var start: typings.plottable.plottableStrings.start
}
object End {
  
  inline def apply(): End = {
    val __obj = js.Dynamic.literal(end = "end", middle = "middle", start = "start")
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: middle): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
