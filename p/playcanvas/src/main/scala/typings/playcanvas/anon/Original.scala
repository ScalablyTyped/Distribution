package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Original extends js.Object {
  var load: String
  var original: String
}

object Original {
  @scala.inline
  def apply(load: String, original: String): Original = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[Original]
  }
}

