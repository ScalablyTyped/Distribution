package typings
package pauseLib.pauseMod.pauseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  def end(): scala.Unit
  def resume(): scala.Unit
}

object Handle {
  @scala.inline
  def apply(end: js.Function0[scala.Unit], resume: js.Function0[scala.Unit]): Handle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("resume")(resume)
    __obj.asInstanceOf[Handle]
  }
}

