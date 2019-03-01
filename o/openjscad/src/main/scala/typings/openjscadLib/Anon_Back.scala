package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  var back: js.Any
  var front: js.Any
  var `type`: js.Any
}

object Anon_Back {
  @scala.inline
  def apply(back: js.Any, front: js.Any, `type`: js.Any): Anon_Back = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("back")(back)
    __obj.updateDynamic("front")(front)
    __obj.asInstanceOf[Anon_Back]
  }
}

