package typings
package pauseLib.pauseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  def end(): scala.Unit
  def resume(): scala.Unit
}

object Handle {
  @scala.inline
  def apply(end: () => scala.Unit, resume: () => scala.Unit): Handle = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[Handle]
  }
}

