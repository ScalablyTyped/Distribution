package typings.oracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsert extends js.Object {
  var insert: Element | String
}

object AnonInsert {
  @scala.inline
  def apply(insert: Element | String): AnonInsert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsert]
  }
}

