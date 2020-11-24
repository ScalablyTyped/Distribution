package typings.mysql2.poolClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolClusterOptions extends js.Object {
  
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  var canRetry: js.UndefOr[Boolean] = js.native
  
  /**
    * The default selector. (Default: RR)
    * RR: Select one alternately. (Round-Robin)
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  var defaultSelector: js.UndefOr[String] = js.native
  
  /**
    * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
    * remove a node in the PoolCluster. (Default: 5)
    */
  var removeNodeErrorCount: js.UndefOr[Double] = js.native
  
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  var restoreNodeTimeout: js.UndefOr[Double] = js.native
}
object PoolClusterOptions {
  
  @scala.inline
  def apply(): PoolClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolClusterOptions]
  }
  
  @scala.inline
  implicit class PoolClusterOptionsOps[Self <: PoolClusterOptions] (val x: Self) extends AnyVal {
    
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
    def setCanRetry(value: Boolean): Self = this.set("canRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRetry: Self = this.set("canRetry", js.undefined)
    
    @scala.inline
    def setDefaultSelector(value: String): Self = this.set("defaultSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelector: Self = this.set("defaultSelector", js.undefined)
    
    @scala.inline
    def setRemoveNodeErrorCount(value: Double): Self = this.set("removeNodeErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveNodeErrorCount: Self = this.set("removeNodeErrorCount", js.undefined)
    
    @scala.inline
    def setRestoreNodeTimeout(value: Double): Self = this.set("restoreNodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreNodeTimeout: Self = this.set("restoreNodeTimeout", js.undefined)
  }
}
