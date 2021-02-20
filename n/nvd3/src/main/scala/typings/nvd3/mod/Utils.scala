package typings.nvd3.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String] = js.native
  
  def getColor(arg: js.Any): js.Array[String] = js.native
  
  def state(): State = js.native
  
  var symbolMap: SymbolMap = js.native
  
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  
  /* Gets the browser window size */
  def windowSize(): Size = js.native
}
object Utils {
  
  @scala.inline
  def apply(
    defaultColor: () => js.Array[String],
    getColor: js.Any => js.Array[String],
    state: () => State,
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ Event, _] => Unit,
    windowSize: () => Size
  ): Utils = {
    val __obj = js.Dynamic.literal(defaultColor = js.Any.fromFunction0(defaultColor), getColor = js.Any.fromFunction1(getColor), state = js.Any.fromFunction0(state), symbolMap = symbolMap.asInstanceOf[js.Any], windowResize = js.Any.fromFunction1(windowResize), windowSize = js.Any.fromFunction0(windowSize))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit class UtilsMutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultColor(value: () => js.Array[String]): Self = StObject.set(x, "defaultColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColor(value: js.Any => js.Array[String]): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: () => State): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSymbolMap(value: SymbolMap): Self = StObject.set(x, "symbolMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowResize(value: js.Function1[/* ev */ Event, _] => Unit): Self = StObject.set(x, "windowResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowSize(value: () => Size): Self = StObject.set(x, "windowSize", js.Any.fromFunction0(value))
  }
}
