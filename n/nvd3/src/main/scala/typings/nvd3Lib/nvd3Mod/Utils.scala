package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  var symbolMap: SymbolMap
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[java.lang.String]
  def getColor(arg: js.Any): js.Array[java.lang.String]
  def state(): State
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ stdLib.Event, _]): scala.Unit
  /* Gets the browser window size */
  def windowSize(): Size
}

object Utils {
  @scala.inline
  def apply(
    defaultColor: () => js.Array[java.lang.String],
    getColor: js.Any => js.Array[java.lang.String],
    state: () => State,
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ stdLib.Event, _] => scala.Unit,
    windowSize: () => Size
  ): Utils = {
    val __obj = js.Dynamic.literal(defaultColor = js.Any.fromFunction0(defaultColor), getColor = js.Any.fromFunction1(getColor), state = js.Any.fromFunction0(state), symbolMap = symbolMap, windowResize = js.Any.fromFunction1(windowResize), windowSize = js.Any.fromFunction0(windowSize))
  
    __obj.asInstanceOf[Utils]
  }
}

