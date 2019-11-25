package typings.mssql.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPool extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  var fifo: js.UndefOr[Boolean] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxWaitingClients: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var numTestsPerRun: js.UndefOr[Double] = js.undefined
  var priorityRange: js.UndefOr[Double] = js.undefined
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var testOnBorrow: js.UndefOr[Boolean] = js.undefined
}

object IPool {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: scala.Int | Double = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: scala.Int | Double = null,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: scala.Int | Double = null,
    max: scala.Int | Double = null,
    maxWaitingClients: scala.Int | Double = null,
    min: scala.Int | Double = null,
    numTestsPerRun: scala.Int | Double = null,
    priorityRange: scala.Int | Double = null,
    softIdleTimeoutMillis: scala.Int | Double = null,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): IPool = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (acquireTimeoutMillis != null) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (evictionRunIntervalMillis != null) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.asInstanceOf[js.Any])
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaitingClients != null) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numTestsPerRun != null) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.asInstanceOf[js.Any])
    if (priorityRange != null) __obj.updateDynamic("priorityRange")(priorityRange.asInstanceOf[js.Any])
    if (softIdleTimeoutMillis != null) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPool]
  }
}

