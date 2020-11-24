package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeverBounce extends js.Object {
  
  var account: Account = js.native
  
  var errors: Errors = js.native
  
  def getConfig(): Config = js.native
  
  def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
  
  var jobs: Jobs = js.native
  
  var poe: Poe = js.native
  
  def setApiKey(key: String): Unit = js.native
  
  def setHost(host: String): Unit = js.native
  
  var single: Single = js.native
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
  
  @scala.inline
  implicit class NeverBounceOps[Self <: NeverBounce] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConfig(value: () => Config): Self = this.set("getConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestOpts(value: ConfigOptions => ConfigOptions): Self = this.set("getRequestOpts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJobs(value: Jobs): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoe(value: Poe): Self = this.set("poe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetApiKey(value: String => Unit): Self = this.set("setApiKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHost(value: String => Unit): Self = this.set("setHost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingle(value: Single): Self = this.set("single", value.asInstanceOf[js.Any])
  }
}
