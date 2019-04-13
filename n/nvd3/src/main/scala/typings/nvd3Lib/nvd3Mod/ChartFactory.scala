package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFactory[TChart /* <: Nvd3Element */] extends js.Object {
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, scala.Unit]] = js.undefined
  def generate(): TChart
}

object ChartFactory {
  @scala.inline
  def apply[TChart /* <: Nvd3Element */](generate: () => TChart, callback: /* chart */ TChart => scala.Unit = null): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
}

