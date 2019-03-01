package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceSqlFunction extends js.Object {
  def current(): scala.Double
  def next(): scala.Double
  def reset(): scala.Double
}

object SequenceSqlFunction {
  @scala.inline
  def apply(
    current: js.Function0[scala.Double],
    next: js.Function0[scala.Double],
    reset: js.Function0[scala.Double]
  ): SequenceSqlFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[SequenceSqlFunction]
  }
}

