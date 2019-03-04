package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intercept extends js.Object {
  def abort(): scala.Unit
  def passthrough(): scala.Unit
}

object Intercept {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit], passthrough: js.Function0[scala.Unit]): Intercept = {
    val __obj = js.Dynamic.literal(abort = abort, passthrough = passthrough)
  
    __obj.asInstanceOf[Intercept]
  }
}

