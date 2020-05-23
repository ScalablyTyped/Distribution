package typings.openjscad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Back extends js.Object {
  var back: js.Any
  var front: js.Any
  var `type`: js.Any
}

object Back {
  @scala.inline
  def apply(back: js.Any, front: js.Any, `type`: js.Any): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
}

