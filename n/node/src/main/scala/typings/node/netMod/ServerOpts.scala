package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOpts extends StObject {
  
  /**
    * Indicates whether half-opened TCP connections are allowed.
    * @default false
    */
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true`, it enables keep-alive functionality on the socket immediately after a new incoming connection is received,
    * similarly on what is done in `socket.setKeepAlive([enable][, initialDelay])`.
    * @default false
    * @since v16.5.0
    */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to a positive number, it sets the initial delay before the first keepalive probe is sent on an idle socket.
    * @default 0
    * @since v16.5.0
    */
  var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to `true`, it disables the use of Nagle's algorithm immediately after a new incoming connection is received.
    * @default false
    * @since v16.5.0
    */
  var noDelay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the socket should be paused on incoming connections.
    * @default false
    */
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}
object ServerOpts {
  
  inline def apply(): ServerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOpts] (val x: Self) extends AnyVal {
    
    inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    inline def setPauseOnConnect(value: Boolean): Self = StObject.set(x, "pauseOnConnect", value.asInstanceOf[js.Any])
    
    inline def setPauseOnConnectUndefined: Self = StObject.set(x, "pauseOnConnect", js.undefined)
  }
}
