package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait options extends js.Object {
  
  /**
    * md5, the hashing algorithm used to generate the hashRing values.
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * undefined, an array of server_locations to replace servers that fail and that are removed from the consistent hashing scheme.
    */
  var failOverServers: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * 5, the number of failed-attempts to a server before it is regarded as 'dead'.
    */
  var failures: js.UndefOr[Double] = js.native
  
  /**
    * 5000, the idle timeout for the connections.
    */
  var idle: js.UndefOr[Double] = js.native
  
  /**
    * true, whether to use md5 as hashing scheme when keys exceed maxKeySize.
    */
  var keyCompression: js.UndefOr[Boolean] = js.native
  
  /**
    * 2592000, the maximum expiration time of keys (in seconds).
    */
  var maxExpiration: js.UndefOr[Double] = js.native
  
  /**
    * 250, the maximum key size allowed.
    */
  var maxKeySize: js.UndefOr[Double] = js.native
  
  /**
    * 1048576, the maximum size of a value.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * '', sentinel to prepend to all memcache keys for namespacing the entries.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * 10, the maximum size of the connection pool.
    */
  var poolSize: js.UndefOr[Double] = js.native
  
  /**
    * 18000000, the time between reconnection attempts (in milliseconds).
    */
  var reconnect: js.UndefOr[Double] = js.native
  
  /**
    * false, if true, authorizes the automatic removal of dead servers from the pool.
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * 5, the number of socket allocation retries per request.
    */
  var retries: js.UndefOr[Double] = js.native
  
  /**
    * 30000, the time between a server failure and an attempt to set it up back in service.
    */
  var retry: js.UndefOr[Double] = js.native
  
  /**
    * 5000, the time after which Memcached sends a connection timeout (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.native
}
object options {
  
  @scala.inline
  def apply(): options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[options]
  }
  
  @scala.inline
  implicit class optionsOps[Self <: options] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setFailOverServersVarargs(value: String*): Self = this.set("failOverServers", js.Array(value :_*))
    
    @scala.inline
    def setFailOverServers(value: String | js.Array[String]): Self = this.set("failOverServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOverServers: Self = this.set("failOverServers", js.undefined)
    
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    
    @scala.inline
    def setKeyCompression(value: Boolean): Self = this.set("keyCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCompression: Self = this.set("keyCompression", js.undefined)
    
    @scala.inline
    def setMaxExpiration(value: Double): Self = this.set("maxExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExpiration: Self = this.set("maxExpiration", js.undefined)
    
    @scala.inline
    def setMaxKeySize(value: Double): Self = this.set("maxKeySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeySize: Self = this.set("maxKeySize", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setReconnect(value: Double): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
