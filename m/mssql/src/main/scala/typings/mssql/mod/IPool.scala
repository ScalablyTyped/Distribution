package typings.mssql.mod

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
    acquireTimeoutMillis: js.UndefOr[Double] = js.undefined,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    maxWaitingClients: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    numTestsPerRun: js.UndefOr[Double] = js.undefined,
    priorityRange: js.UndefOr[Double] = js.undefined,
    softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): IPool = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(acquireTimeoutMillis)) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evictionRunIntervalMillis)) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWaitingClients)) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numTestsPerRun)) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priorityRange)) __obj.updateDynamic("priorityRange")(priorityRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(softIdleTimeoutMillis)) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPool]
  }
}

