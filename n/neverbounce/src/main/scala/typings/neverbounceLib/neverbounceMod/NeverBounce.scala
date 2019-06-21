package typings
package neverbounceLib.neverbounceMod

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
  def setApiKey(key: java.lang.String): scala.Unit
  def setHost(host: java.lang.String): scala.Unit
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
    setApiKey: java.lang.String => scala.Unit,
    setHost: java.lang.String => scala.Unit,
    single: Single
  ): NeverBounce = {
    val __obj = js.Dynamic.literal(account = account, errors = errors, getConfig = js.Any.fromFunction0(getConfig), getRequestOpts = js.Any.fromFunction1(getRequestOpts), jobs = jobs, poe = poe, setApiKey = js.Any.fromFunction1(setApiKey), setHost = js.Any.fromFunction1(setHost), single = single)
  
    __obj.asInstanceOf[NeverBounce]
  }
}

