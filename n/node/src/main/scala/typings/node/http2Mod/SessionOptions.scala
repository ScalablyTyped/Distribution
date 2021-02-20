package typings.node.http2Mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends StObject {
  
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ this.type, Duplex]] = js.native
  
  var maxDeflateDynamicTableSize: js.UndefOr[Double] = js.native
  
  var maxHeaderListPairs: js.UndefOr[Double] = js.native
  
  var maxOutstandingPings: js.UndefOr[Double] = js.native
  
  var maxSendHeaderBlockLength: js.UndefOr[Double] = js.native
  
  var maxSessionMemory: js.UndefOr[Double] = js.native
  
  var paddingStrategy: js.UndefOr[Double] = js.native
  
  var peerMaxConcurrentStreams: js.UndefOr[Double] = js.native
  
  var selectPadding: js.UndefOr[js.Function2[/* frameLen */ Double, /* maxFrameLen */ Double, Double]] = js.native
  
  var settings: js.UndefOr[Settings] = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateConnection(value: (/* authority */ URL_, SessionOptions) => Duplex): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    @scala.inline
    def setMaxDeflateDynamicTableSize(value: Double): Self = StObject.set(x, "maxDeflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeflateDynamicTableSizeUndefined: Self = StObject.set(x, "maxDeflateDynamicTableSize", js.undefined)
    
    @scala.inline
    def setMaxHeaderListPairs(value: Double): Self = StObject.set(x, "maxHeaderListPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeaderListPairsUndefined: Self = StObject.set(x, "maxHeaderListPairs", js.undefined)
    
    @scala.inline
    def setMaxOutstandingPings(value: Double): Self = StObject.set(x, "maxOutstandingPings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutstandingPingsUndefined: Self = StObject.set(x, "maxOutstandingPings", js.undefined)
    
    @scala.inline
    def setMaxSendHeaderBlockLength(value: Double): Self = StObject.set(x, "maxSendHeaderBlockLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSendHeaderBlockLengthUndefined: Self = StObject.set(x, "maxSendHeaderBlockLength", js.undefined)
    
    @scala.inline
    def setMaxSessionMemory(value: Double): Self = StObject.set(x, "maxSessionMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSessionMemoryUndefined: Self = StObject.set(x, "maxSessionMemory", js.undefined)
    
    @scala.inline
    def setPaddingStrategy(value: Double): Self = StObject.set(x, "paddingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingStrategyUndefined: Self = StObject.set(x, "paddingStrategy", js.undefined)
    
    @scala.inline
    def setPeerMaxConcurrentStreams(value: Double): Self = StObject.set(x, "peerMaxConcurrentStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerMaxConcurrentStreamsUndefined: Self = StObject.set(x, "peerMaxConcurrentStreams", js.undefined)
    
    @scala.inline
    def setSelectPadding(value: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double): Self = StObject.set(x, "selectPadding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectPaddingUndefined: Self = StObject.set(x, "selectPadding", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
