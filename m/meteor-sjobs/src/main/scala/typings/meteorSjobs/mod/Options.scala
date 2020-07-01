package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Specify if the package should automatically delete internal data (not job related). */
  var autoPurge: js.UndefOr[Boolean] = js.undefined
  /** Specify if the package should retry failed jobs whenever a new server takes control. */
  var autoRetry: js.UndefOr[Boolean] = js.undefined
  /** Specify if the package should start automatically on Meteor.startup. */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**  development mode assumes that only one server is running, and that it is the active one. */
  var disableDevelopmentMode: js.UndefOr[Boolean] = js.undefined
  /** Determine how to get the current date, if for whatever reason, new Date() is not suitable */
  var getDate: js.UndefOr[js.Function0[Date]] = js.undefined
  var gracePeriod: js.UndefOr[Double] = js.undefined
  /**  Specify how often the package should check for due jobs. */
  var interval: js.UndefOr[Double] = js.undefined
  /** Determine how to log the package outputs */
  var log: js.UndefOr[js.Function1[/* messages */ String | js.Object, Unit]] = js.undefined
  /** Specify how long the server could be inactive before another server takes on the master role. */
  var maxWait: js.UndefOr[Double] = js.undefined
  /** Store jobs data in a remote collection. */
  var remoteCollection: js.UndefOr[String] = js.undefined
  /** Determine how to set the serverId - for example, you can have the package use your hosts deployment id */
  var setServerId: js.UndefOr[js.Function0[String]] = js.undefined
  /** Specify how long after server startup the package should start running. */
  var startupDelay: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoPurge: js.UndefOr[Boolean] = js.undefined,
    autoRetry: js.UndefOr[Boolean] = js.undefined,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    disableDevelopmentMode: js.UndefOr[Boolean] = js.undefined,
    getDate: () => Date = null,
    gracePeriod: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    log: /* messages */ String | js.Object => Unit = null,
    maxWait: js.UndefOr[Double] = js.undefined,
    remoteCollection: String = null,
    setServerId: () => String = null,
    startupDelay: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPurge)) __obj.updateDynamic("autoPurge")(autoPurge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRetry)) __obj.updateDynamic("autoRetry")(autoRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDevelopmentMode)) __obj.updateDynamic("disableDevelopmentMode")(disableDevelopmentMode.get.asInstanceOf[js.Any])
    if (getDate != null) __obj.updateDynamic("getDate")(js.Any.fromFunction0(getDate))
    if (!js.isUndefined(gracePeriod)) __obj.updateDynamic("gracePeriod")(gracePeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (!js.isUndefined(maxWait)) __obj.updateDynamic("maxWait")(maxWait.get.asInstanceOf[js.Any])
    if (remoteCollection != null) __obj.updateDynamic("remoteCollection")(remoteCollection.asInstanceOf[js.Any])
    if (setServerId != null) __obj.updateDynamic("setServerId")(js.Any.fromFunction0(setServerId))
    if (!js.isUndefined(startupDelay)) __obj.updateDynamic("startupDelay")(startupDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

