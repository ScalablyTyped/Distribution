package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var environment: js.UndefOr[js.Array[String]] = js.native
  var excludeOldTransactions: js.UndefOr[Boolean] = js.native
  var extended: js.UndefOr[Boolean] = js.native
  var ignoreExpired: js.UndefOr[Boolean] = js.native
  var ignoreExpiredError: js.UndefOr[Boolean] = js.native
  var secret: String = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(secret: String): ConfigOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentVarargs(value: String*): Self = this.set("environment", js.Array(value :_*))
    @scala.inline
    def setEnvironment(value: js.Array[String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setExcludeOldTransactions(value: Boolean): Self = this.set("excludeOldTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeOldTransactions: Self = this.set("excludeOldTransactions", js.undefined)
    @scala.inline
    def setExtended(value: Boolean): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtended: Self = this.set("extended", js.undefined)
    @scala.inline
    def setIgnoreExpired(value: Boolean): Self = this.set("ignoreExpired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreExpired: Self = this.set("ignoreExpired", js.undefined)
    @scala.inline
    def setIgnoreExpiredError(value: Boolean): Self = this.set("ignoreExpiredError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreExpiredError: Self = this.set("ignoreExpiredError", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

