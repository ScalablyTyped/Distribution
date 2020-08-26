package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var accounts: js.Array[Account] = js.native
  var name: js.UndefOr[String] = js.native
  var nameEscaped: String = js.native
  var nameEscapedUrl: String = js.native
}

object Player {
  @scala.inline
  def apply(accounts: js.Array[Account], nameEscaped: String, nameEscapedUrl: String): Player = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], nameEscaped = nameEscaped.asInstanceOf[js.Any], nameEscapedUrl = nameEscapedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = this.set("accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: js.Array[Account]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameEscaped(value: String): Self = this.set("nameEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameEscapedUrl(value: String): Self = this.set("nameEscapedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

