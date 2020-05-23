package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var accounts: js.Array[Account]
  var name: js.UndefOr[String] = js.undefined
  var nameEscaped: String
  var nameEscapedUrl: String
}

object Player {
  @scala.inline
  def apply(accounts: js.Array[Account], nameEscaped: String, nameEscapedUrl: String, name: String = null): Player = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], nameEscaped = nameEscaped.asInstanceOf[js.Any], nameEscapedUrl = nameEscapedUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

