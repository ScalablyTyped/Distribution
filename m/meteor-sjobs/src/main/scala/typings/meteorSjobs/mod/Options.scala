package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Specify if the package should automatically delete internal data (not job related). */
  var autoPurge: js.UndefOr[Boolean] = js.native
  
  /** Specify if the package should retry failed jobs whenever a new server takes control. */
  var autoRetry: js.UndefOr[Boolean] = js.native
  
  /** Specify if the package should start automatically on Meteor.startup. */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**  development mode assumes that only one server is running, and that it is the active one. */
  var disableDevelopmentMode: js.UndefOr[Boolean] = js.native
  
  /** Determine how to get the current date, if for whatever reason, new Date() is not suitable */
  var getDate: js.UndefOr[js.Function0[Date]] = js.native
  
  var gracePeriod: js.UndefOr[Double] = js.native
  
  /**  Specify how often the package should check for due jobs. */
  var interval: js.UndefOr[Double] = js.native
  
  /** Determine how to log the package outputs */
  var log: js.UndefOr[js.Function1[/* messages */ String | js.Object, Unit]] = js.native
  
  /** Specify how long the server could be inactive before another server takes on the master role. */
  var maxWait: js.UndefOr[Double] = js.native
  
  /** Store jobs data in a remote collection. */
  var remoteCollection: js.UndefOr[String] = js.native
  
  /** Determine how to set the serverId - for example, you can have the package use your hosts deployment id */
  var setServerId: js.UndefOr[js.Function0[String]] = js.native
  
  /** Specify how long after server startup the package should start running. */
  var startupDelay: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoPurge(value: Boolean): Self = this.set("autoPurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPurge: Self = this.set("autoPurge", js.undefined)
    
    @scala.inline
    def setAutoRetry(value: Boolean): Self = this.set("autoRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRetry: Self = this.set("autoRetry", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setDisableDevelopmentMode(value: Boolean): Self = this.set("disableDevelopmentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDevelopmentMode: Self = this.set("disableDevelopmentMode", js.undefined)
    
    @scala.inline
    def setGetDate(value: () => Date): Self = this.set("getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDate: Self = this.set("getDate", js.undefined)
    
    @scala.inline
    def setGracePeriod(value: Double): Self = this.set("gracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracePeriod: Self = this.set("gracePeriod", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLog(value: /* messages */ String | js.Object => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
    
    @scala.inline
    def setRemoteCollection(value: String): Self = this.set("remoteCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteCollection: Self = this.set("remoteCollection", js.undefined)
    
    @scala.inline
    def setSetServerId(value: () => String): Self = this.set("setServerId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetServerId: Self = this.set("setServerId", js.undefined)
    
    @scala.inline
    def setStartupDelay(value: Double): Self = this.set("startupDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupDelay: Self = this.set("startupDelay", js.undefined)
  }
}
