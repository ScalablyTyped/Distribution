package typings.nvd3.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  var symbolMap: SymbolMap
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String]
  def getColor(arg: js.Any): js.Array[String]
  def state(): State
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event, _]): Unit
  /* Gets the browser window size */
  def windowSize(): Size
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
}

