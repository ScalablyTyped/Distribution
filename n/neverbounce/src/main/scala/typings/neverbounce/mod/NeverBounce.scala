package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeverBounce extends js.Object {
  var account: Account
  var errors: Errors
  var jobs: Jobs
  var poe: Poe
  var single: Single
  def getConfig(): Config
  def getRequestOpts(opts: ConfigOptions): ConfigOptions
  def setApiKey(key: String): Unit
  def setHost(host: String): Unit
}

object NeverBounce {
  @scala.inline
  def apply(
    account: Account,
    errors: Errors,
    getConfig: () => Config,
    getRequestOpts: ConfigOptions => ConfigOptions,
    jobs: Jobs,
    poe: Poe,
    setApiKey: String => Unit,
    setHost: String => Unit,
    single: Single
  ): NeverBounce = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getRequestOpts = js.Any.fromFunction1(getRequestOpts), jobs = jobs.asInstanceOf[js.Any], poe = poe.asInstanceOf[js.Any], setApiKey = js.Any.fromFunction1(setApiKey), setHost = js.Any.fromFunction1(setHost), single = single.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NeverBounce]
  }
}

