package typings.plottable.anon

import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.outside
import typings.plottable.plottableStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: typings.plottable.plottableStrings.end
  
  var middle: typings.plottable.plottableStrings.middle
  
  var outside: typings.plottable.plottableStrings.outside
  
  var start: typings.plottable.plottableStrings.start
}
object End {
  
  @scala.inline
  def apply(): End = {
    val __obj = js.Dynamic.literal(end = "end", middle = "middle", outside = "outside", start = "start")
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: middle): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
