package typings.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsert extends js.Object {
  var insert: Boolean
  var remove: Boolean
  var update: Boolean
}

object AnonInsert {
  @scala.inline
  def apply(insert: Boolean, remove: Boolean, update: Boolean): AnonInsert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsert]
  }
}

