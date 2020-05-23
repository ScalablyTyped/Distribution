package typings.osrsJsonApi.mod.ge

import typings.osrsJsonApi.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var item: Current
}

object Item {
  @scala.inline
  def apply(item: Current): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

