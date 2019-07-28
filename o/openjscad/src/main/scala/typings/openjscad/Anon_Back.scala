package typings.openjscad

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
    val __obj = js.Dynamic.literal(back = back, front = front)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Back]
  }
}

