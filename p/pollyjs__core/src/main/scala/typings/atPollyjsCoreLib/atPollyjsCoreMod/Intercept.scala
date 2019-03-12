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
  def apply(abort: () => scala.Unit, passthrough: () => scala.Unit): Intercept = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), passthrough = js.Any.fromFunction0(passthrough))
  
    __obj.asInstanceOf[Intercept]
  }
}

