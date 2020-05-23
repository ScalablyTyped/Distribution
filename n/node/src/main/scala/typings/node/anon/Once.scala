package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Once extends js.Object {
  var once: Boolean
}

object Once {
  @scala.inline
  def apply(once: Boolean): Once = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Once]
  }
}

