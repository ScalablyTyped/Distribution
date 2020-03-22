package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceAround extends js.Object {
  var after: String
  var before: String
}

object SpaceAround {
  @scala.inline
  def apply(after: String, before: String): SpaceAround = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpaceAround]
  }
}

