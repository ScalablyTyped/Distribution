package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var enableConnectProtocol: js.UndefOr[Boolean] = js.undefined
  
  var enablePush: js.UndefOr[Boolean] = js.undefined
  
  var headerTableSize: js.UndefOr[Double] = js.undefined
  
  var initialWindowSize: js.UndefOr[Double] = js.undefined
  
  var maxConcurrentStreams: js.UndefOr[Double] = js.undefined
  
  var maxFrameSize: js.UndefOr[Double] = js.undefined
  
  var maxHeaderListSize: js.UndefOr[Double] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setEnableConnectProtocol(value: Boolean): Self = StObject.set(x, "enableConnectProtocol", value.asInstanceOf[js.Any])
    
    inline def setEnableConnectProtocolUndefined: Self = StObject.set(x, "enableConnectProtocol", js.undefined)
    
    inline def setEnablePush(value: Boolean): Self = StObject.set(x, "enablePush", value.asInstanceOf[js.Any])
    
    inline def setEnablePushUndefined: Self = StObject.set(x, "enablePush", js.undefined)
    
    inline def setHeaderTableSize(value: Double): Self = StObject.set(x, "headerTableSize", value.asInstanceOf[js.Any])
    
    inline def setHeaderTableSizeUndefined: Self = StObject.set(x, "headerTableSize", js.undefined)
    
    inline def setInitialWindowSize(value: Double): Self = StObject.set(x, "initialWindowSize", value.asInstanceOf[js.Any])
    
    inline def setInitialWindowSizeUndefined: Self = StObject.set(x, "initialWindowSize", js.undefined)
    
    inline def setMaxConcurrentStreams(value: Double): Self = StObject.set(x, "maxConcurrentStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentStreamsUndefined: Self = StObject.set(x, "maxConcurrentStreams", js.undefined)
    
    inline def setMaxFrameSize(value: Double): Self = StObject.set(x, "maxFrameSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFrameSizeUndefined: Self = StObject.set(x, "maxFrameSize", js.undefined)
    
    inline def setMaxHeaderListSize(value: Double): Self = StObject.set(x, "maxHeaderListSize", value.asInstanceOf[js.Any])
    
    inline def setMaxHeaderListSizeUndefined: Self = StObject.set(x, "maxHeaderListSize", js.undefined)
  }
}
