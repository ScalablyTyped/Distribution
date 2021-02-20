package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  var enableConnectProtocol: js.UndefOr[Boolean] = js.native
  
  var enablePush: js.UndefOr[Boolean] = js.native
  
  var headerTableSize: js.UndefOr[Double] = js.native
  
  var initialWindowSize: js.UndefOr[Double] = js.native
  
  var maxConcurrentStreams: js.UndefOr[Double] = js.native
  
  var maxFrameSize: js.UndefOr[Double] = js.native
  
  var maxHeaderListSize: js.UndefOr[Double] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableConnectProtocol(value: Boolean): Self = StObject.set(x, "enableConnectProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableConnectProtocolUndefined: Self = StObject.set(x, "enableConnectProtocol", js.undefined)
    
    @scala.inline
    def setEnablePush(value: Boolean): Self = StObject.set(x, "enablePush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePushUndefined: Self = StObject.set(x, "enablePush", js.undefined)
    
    @scala.inline
    def setHeaderTableSize(value: Double): Self = StObject.set(x, "headerTableSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTableSizeUndefined: Self = StObject.set(x, "headerTableSize", js.undefined)
    
    @scala.inline
    def setInitialWindowSize(value: Double): Self = StObject.set(x, "initialWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialWindowSizeUndefined: Self = StObject.set(x, "initialWindowSize", js.undefined)
    
    @scala.inline
    def setMaxConcurrentStreams(value: Double): Self = StObject.set(x, "maxConcurrentStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentStreamsUndefined: Self = StObject.set(x, "maxConcurrentStreams", js.undefined)
    
    @scala.inline
    def setMaxFrameSize(value: Double): Self = StObject.set(x, "maxFrameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrameSizeUndefined: Self = StObject.set(x, "maxFrameSize", js.undefined)
    
    @scala.inline
    def setMaxHeaderListSize(value: Double): Self = StObject.set(x, "maxHeaderListSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeaderListSizeUndefined: Self = StObject.set(x, "maxHeaderListSize", js.undefined)
  }
}
