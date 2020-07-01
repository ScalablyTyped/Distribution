package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFactory[TChart /* <: Nvd3Element */] extends js.Object {
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.undefined
  def generate(): TChart
}

object ChartFactory {
  @scala.inline
  def apply[/* <: typings.nvd3.mod.Nvd3Element */ TChart](generate: () => TChart, callback: /* chart */ TChart => Unit = null): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
}

