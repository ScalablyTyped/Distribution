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
  def apply(current: () => scala.Double, next: () => scala.Double, reset: () => scala.Double): SequenceSqlFunction = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[SequenceSqlFunction]
  }
}

