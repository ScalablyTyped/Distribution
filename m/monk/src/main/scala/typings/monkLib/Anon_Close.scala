package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  def close(): scala.Unit
  def pause(): scala.Unit
  def resume(): scala.Unit
}

object Anon_Close {
  @scala.inline
  def apply(close: () => scala.Unit, pause: () => scala.Unit, resume: () => scala.Unit): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[Anon_Close]
  }
}

