package typings.novncCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.normal
import typings.novncCore.novncCoreStrings.warn
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NvRFBDefaults extends js.Object {
  
  var disconnectTimeout: js.UndefOr[Double] = js.native
  
  var encrypt: js.UndefOr[Boolean] = js.native
  
  var focusContainer: js.UndefOr[HTMLElement] = js.native
  
  var local_cursor: js.UndefOr[Boolean] = js.native
  
  var onBell: js.UndefOr[js.Function1[/* rfb */ RFB, Unit]] = js.native
  
  var onClipboard: js.UndefOr[js.Function2[/* rfb */ RFB, /* text */ String, Unit]] = js.native
  
  var onDesktopName: js.UndefOr[js.Function2[/* rfb */ RFB, /* name */ String, Unit]] = js.native
  
  var onDisconnected: js.UndefOr[js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[String], Unit]] = js.native
  
  var onFBResize: js.UndefOr[js.Function3[/* rfb */ RFB, /* width */ Double, /* height */ Double, Unit]] = js.native
  
  var onFBUComplete: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.native
  
  var onFBUReceive: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.native
  
  var onNotification: js.UndefOr[
    js.Function4[
      /* rfb */ RFB, 
      /* msg */ String, 
      /* level */ normal | warn | error, 
      /* options */ js.UndefOr[StringDictionary[js.Any]], 
      Unit
    ]
  ] = js.native
  
  var onPasswordRequired: js.UndefOr[js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[String], Unit]] = js.native
  
  var onUpdateState: js.UndefOr[
    js.Function3[/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState, Unit]
  ] = js.native
  
  var onXvpInit: js.UndefOr[js.Function1[/* version */ Double, Unit]] = js.native
  
  var repeaterID: js.UndefOr[String] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[HTMLCanvasElement] = js.native
  
  var view_only: js.UndefOr[Boolean] = js.native
  
  var viewportDrag: js.UndefOr[Boolean] = js.native
  
  var wsProtocols: js.UndefOr[js.Array[String]] = js.native
  
  var xvp_password_sep: js.UndefOr[String] = js.native
}
object NvRFBDefaults {
  
  @scala.inline
  def apply(): NvRFBDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvRFBDefaults]
  }
  
  @scala.inline
  implicit class NvRFBDefaultsOps[Self <: NvRFBDefaults] (val x: Self) extends AnyVal {
    
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
    def setDisconnectTimeout(value: Double): Self = this.set("disconnectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnectTimeout: Self = this.set("disconnectTimeout", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setFocusContainer(value: HTMLElement): Self = this.set("focusContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusContainer: Self = this.set("focusContainer", js.undefined)
    
    @scala.inline
    def setLocal_cursor(value: Boolean): Self = this.set("local_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_cursor: Self = this.set("local_cursor", js.undefined)
    
    @scala.inline
    def setOnBell(value: /* rfb */ RFB => Unit): Self = this.set("onBell", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBell: Self = this.set("onBell", js.undefined)
    
    @scala.inline
    def setOnClipboard(value: (/* rfb */ RFB, /* text */ String) => Unit): Self = this.set("onClipboard", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClipboard: Self = this.set("onClipboard", js.undefined)
    
    @scala.inline
    def setOnDesktopName(value: (/* rfb */ RFB, /* name */ String) => Unit): Self = this.set("onDesktopName", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDesktopName: Self = this.set("onDesktopName", js.undefined)
    
    @scala.inline
    def setOnDisconnected(value: (/* rfb */ RFB, /* reason */ js.UndefOr[String]) => Unit): Self = this.set("onDisconnected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDisconnected: Self = this.set("onDisconnected", js.undefined)
    
    @scala.inline
    def setOnFBResize(value: (/* rfb */ RFB, /* width */ Double, /* height */ Double) => Unit): Self = this.set("onFBResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFBResize: Self = this.set("onFBResize", js.undefined)
    
    @scala.inline
    def setOnFBUComplete(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = this.set("onFBUComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFBUComplete: Self = this.set("onFBUComplete", js.undefined)
    
    @scala.inline
    def setOnFBUReceive(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = this.set("onFBUReceive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFBUReceive: Self = this.set("onFBUReceive", js.undefined)
    
    @scala.inline
    def setOnNotification(
      value: (/* rfb */ RFB, /* msg */ String, /* level */ normal | warn | error, /* options */ js.UndefOr[StringDictionary[js.Any]]) => Unit
    ): Self = this.set("onNotification", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnNotification: Self = this.set("onNotification", js.undefined)
    
    @scala.inline
    def setOnPasswordRequired(value: (/* rfb */ RFB, /* msg */ js.UndefOr[String]) => Unit): Self = this.set("onPasswordRequired", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPasswordRequired: Self = this.set("onPasswordRequired", js.undefined)
    
    @scala.inline
    def setOnUpdateState(value: (/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState) => Unit): Self = this.set("onUpdateState", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnUpdateState: Self = this.set("onUpdateState", js.undefined)
    
    @scala.inline
    def setOnXvpInit(value: /* version */ Double => Unit): Self = this.set("onXvpInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnXvpInit: Self = this.set("onXvpInit", js.undefined)
    
    @scala.inline
    def setRepeaterID(value: String): Self = this.set("repeaterID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeaterID: Self = this.set("repeaterID", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setView_only(value: Boolean): Self = this.set("view_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_only: Self = this.set("view_only", js.undefined)
    
    @scala.inline
    def setViewportDrag(value: Boolean): Self = this.set("viewportDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportDrag: Self = this.set("viewportDrag", js.undefined)
    
    @scala.inline
    def setWsProtocolsVarargs(value: String*): Self = this.set("wsProtocols", js.Array(value :_*))
    
    @scala.inline
    def setWsProtocols(value: js.Array[String]): Self = this.set("wsProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsProtocols: Self = this.set("wsProtocols", js.undefined)
    
    @scala.inline
    def setXvp_password_sep(value: String): Self = this.set("xvp_password_sep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXvp_password_sep: Self = this.set("xvp_password_sep", js.undefined)
  }
}
