package typings.ot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  var anchor: Double
  var head: Double
}

object Anchor {
  @scala.inline
  def apply(anchor: Double, head: Double): Anchor = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
}

