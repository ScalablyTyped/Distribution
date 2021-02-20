package typings.mongodb.mod

import typings.mongodb.mongodbNumbers.`4`
import typings.mongodb.mongodbNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends StObject {
  
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
  implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    @scala.inline
    def setConnectTimeoutMS(value: scala.Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNull: Self = StObject.set(x, "family", null)
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveInitialDelay(value: scala.Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    @scala.inline
    def setSocketTimeoutMS(value: scala.Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
  }
}
