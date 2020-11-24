package typings.mongodb.mod

import typings.mongodb.mongodbNumbers.`4`
import typings.mongodb.mongodbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  /**
    * Reconnect on error.
    * @default true
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Connection timeout setting.
    * @default 10000
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * Version of IP stack. Can be 4, 6 or null.
    * @default null
    *
    * If null, will attempt to connect with IPv6, and will fall back to IPv4 on failure
    * refer to http://mongodb.github.io/node-mongodb-native/3.6/api/MongoClient.html
    */
  var family: js.UndefOr[`4` | `6` | Null] = js.native
  
  /**
    * TCP KeepAlive enabled on the socket.
    * @default true
    */
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP KeepAlive initial delay before sending first keep-alive packet when idle.
    * @default 30000
    */
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.native
  
  /**
    * TCP Socket NoDelay option.
    * @default true
    */
  var noDelay: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Socket timeout setting.
    * @default 360000
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    
    @scala.inline
    def setConnectTimeoutMS(value: scala.Double): Self = this.set("connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeoutMS: Self = this.set("connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setFamily(value: `4` | `6`): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setFamilyNull: Self = this.set("family", null)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveInitialDelay(value: scala.Double): Self = this.set("keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveInitialDelay: Self = this.set("keepAliveInitialDelay", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    
    @scala.inline
    def setSocketTimeoutMS(value: scala.Double): Self = this.set("socketTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeoutMS: Self = this.set("socketTimeoutMS", js.undefined)
  }
}
