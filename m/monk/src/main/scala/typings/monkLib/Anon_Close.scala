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
  def apply(close: js.Function0[scala.Unit], pause: js.Function0[scala.Unit], resume: js.Function0[scala.Unit]): Anon_Close = {
    val __obj = js.Dynamic.literal(close = close, pause = pause, resume = resume)
  
    __obj.asInstanceOf[Anon_Close]
  }
}

