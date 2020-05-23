package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolClusterConfig extends js.Object {
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  var canRetry: js.UndefOr[Boolean] = js.undefined
  /**
    * The default selector. (Default: RR)
    * RR: Select one alternately. (Round-Robin)
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  var defaultSelector: js.UndefOr[String] = js.undefined
  /**
    * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
    * remove a node in the PoolCluster. (Default: 5)
    */
  var removeNodeErrorCount: js.UndefOr[Double] = js.undefined
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  var restoreNodeTimeout: js.UndefOr[Double] = js.undefined
}

object PoolClusterConfig {
  @scala.inline
  def apply(
    canRetry: js.UndefOr[Boolean] = js.undefined,
    defaultSelector: String = null,
    removeNodeErrorCount: js.UndefOr[Double] = js.undefined,
    restoreNodeTimeout: js.UndefOr[Double] = js.undefined
  ): PoolClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canRetry)) __obj.updateDynamic("canRetry")(canRetry.get.asInstanceOf[js.Any])
    if (defaultSelector != null) __obj.updateDynamic("defaultSelector")(defaultSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(removeNodeErrorCount)) __obj.updateDynamic("removeNodeErrorCount")(removeNodeErrorCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restoreNodeTimeout)) __obj.updateDynamic("restoreNodeTimeout")(restoreNodeTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolClusterConfig]
  }
}

