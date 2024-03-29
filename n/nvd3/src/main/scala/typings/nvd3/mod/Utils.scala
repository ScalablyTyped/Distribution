package typings.nvd3.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utils extends StObject {
  
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String]
  
  def getColor(arg: Any): js.Array[String]
  
  def state(): State
  
  var symbolMap: SymbolMap
  
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event, Any]): Unit
  
  /* Gets the browser window size */
  def windowSize(): Size
}
object Utils {
  
  inline def apply(
    defaultColor: () => js.Array[String],
    getColor: Any => js.Array[String],
    state: () => State,
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ Event, Any] => Unit,
    windowSize: () => Size
  ): Utils = {
    val __obj = js.Dynamic.literal(defaultColor = js.Any.fromFunction0(defaultColor), getColor = js.Any.fromFunction1(getColor), state = js.Any.fromFunction0(state), symbolMap = symbolMap.asInstanceOf[js.Any], windowResize = js.Any.fromFunction1(windowResize), windowSize = js.Any.fromFunction0(windowSize))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    inline def setDefaultColor(value: () => js.Array[String]): Self = StObject.set(x, "defaultColor", js.Any.fromFunction0(value))
    
    inline def setGetColor(value: Any => js.Array[String]): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setState(value: () => State): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    inline def setSymbolMap(value: SymbolMap): Self = StObject.set(x, "symbolMap", value.asInstanceOf[js.Any])
    
    inline def setWindowResize(value: js.Function1[/* ev */ Event, Any] => Unit): Self = StObject.set(x, "windowResize", js.Any.fromFunction1(value))
    
    inline def setWindowSize(value: () => Size): Self = StObject.set(x, "windowSize", js.Any.fromFunction0(value))
  }
}
