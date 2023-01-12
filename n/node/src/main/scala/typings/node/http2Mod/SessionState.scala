package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionState extends StObject {
  
  var deflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  
  var effectiveLocalWindowSize: js.UndefOr[Double] = js.undefined
  
  var effectiveRecvDataLength: js.UndefOr[Double] = js.undefined
  
  var inflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  
  var lastProcStreamID: js.UndefOr[Double] = js.undefined
  
  var localWindowSize: js.UndefOr[Double] = js.undefined
  
  var nextStreamID: js.UndefOr[Double] = js.undefined
  
  var outboundQueueSize: js.UndefOr[Double] = js.undefined
  
  var remoteWindowSize: js.UndefOr[Double] = js.undefined
}
object SessionState {
  
  inline def apply(): SessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionState] (val x: Self) extends AnyVal {
    
    inline def setDeflateDynamicTableSize(value: Double): Self = StObject.set(x, "deflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    inline def setDeflateDynamicTableSizeUndefined: Self = StObject.set(x, "deflateDynamicTableSize", js.undefined)
    
    inline def setEffectiveLocalWindowSize(value: Double): Self = StObject.set(x, "effectiveLocalWindowSize", value.asInstanceOf[js.Any])
    
    inline def setEffectiveLocalWindowSizeUndefined: Self = StObject.set(x, "effectiveLocalWindowSize", js.undefined)
    
    inline def setEffectiveRecvDataLength(value: Double): Self = StObject.set(x, "effectiveRecvDataLength", value.asInstanceOf[js.Any])
    
    inline def setEffectiveRecvDataLengthUndefined: Self = StObject.set(x, "effectiveRecvDataLength", js.undefined)
    
    inline def setInflateDynamicTableSize(value: Double): Self = StObject.set(x, "inflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    inline def setInflateDynamicTableSizeUndefined: Self = StObject.set(x, "inflateDynamicTableSize", js.undefined)
    
    inline def setLastProcStreamID(value: Double): Self = StObject.set(x, "lastProcStreamID", value.asInstanceOf[js.Any])
    
    inline def setLastProcStreamIDUndefined: Self = StObject.set(x, "lastProcStreamID", js.undefined)
    
    inline def setLocalWindowSize(value: Double): Self = StObject.set(x, "localWindowSize", value.asInstanceOf[js.Any])
    
    inline def setLocalWindowSizeUndefined: Self = StObject.set(x, "localWindowSize", js.undefined)
    
    inline def setNextStreamID(value: Double): Self = StObject.set(x, "nextStreamID", value.asInstanceOf[js.Any])
    
    inline def setNextStreamIDUndefined: Self = StObject.set(x, "nextStreamID", js.undefined)
    
    inline def setOutboundQueueSize(value: Double): Self = StObject.set(x, "outboundQueueSize", value.asInstanceOf[js.Any])
    
    inline def setOutboundQueueSizeUndefined: Self = StObject.set(x, "outboundQueueSize", js.undefined)
    
    inline def setRemoteWindowSize(value: Double): Self = StObject.set(x, "remoteWindowSize", value.asInstanceOf[js.Any])
    
    inline def setRemoteWindowSizeUndefined: Self = StObject.set(x, "remoteWindowSize", js.undefined)
  }
}
