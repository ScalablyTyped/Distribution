package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolSpecificConfig extends js.Object {
  
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[Double] = js.native
  
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[Boolean] = js.native
}
object PoolSpecificConfig {
  
  @scala.inline
  def apply(): PoolSpecificConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolSpecificConfig]
  }
  
  @scala.inline
  implicit class PoolSpecificConfigOps[Self <: PoolSpecificConfig] (val x: Self) extends AnyVal {
    
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
    def setAcquireTimeout(value: Double): Self = this.set("acquireTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireTimeout: Self = this.set("acquireTimeout", js.undefined)
    
    @scala.inline
    def setConnectionLimit(value: Double): Self = this.set("connectionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionLimit: Self = this.set("connectionLimit", js.undefined)
    
    @scala.inline
    def setQueueLimit(value: Double): Self = this.set("queueLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueLimit: Self = this.set("queueLimit", js.undefined)
    
    @scala.inline
    def setWaitForConnections(value: Boolean): Self = this.set("waitForConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForConnections: Self = this.set("waitForConnections", js.undefined)
  }
}
