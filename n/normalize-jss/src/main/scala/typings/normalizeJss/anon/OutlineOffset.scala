package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutlineOffset extends js.Object {
  var appearance: String
  var outlineOffset: String
}

object OutlineOffset {
  @scala.inline
  def apply(appearance: String, outlineOffset: String): OutlineOffset = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineOffset]
  }
}

