package typings.novncCore

import org.scalablytyped.runtime.StringDictionary
import typings.novncCore.devicesMod.Keyboard
import typings.novncCore.devicesMod.Mouse
import typings.novncCore.novncCoreNumbers.`0`
import typings.novncCore.novncCoreNumbers.`1`
import typings.novncCore.novncCoreNumbers.`2`
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.normal
import typings.novncCore.novncCoreStrings.warn
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("novnc-core", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RFB {
    def this(defaults: NvRFBDefaults) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.novncCore.novncCoreStrings.connecting
    - typings.novncCore.novncCoreStrings.connected
    - typings.novncCore.novncCoreStrings.disconnecting
    - typings.novncCore.novncCoreStrings.disconnected
  */
  trait NvConnectionState extends StObject
  object NvConnectionState {
    
    @scala.inline
    def connected: typings.novncCore.novncCoreStrings.connected = "connected".asInstanceOf[typings.novncCore.novncCoreStrings.connected]
    
    @scala.inline
    def connecting: typings.novncCore.novncCoreStrings.connecting = "connecting".asInstanceOf[typings.novncCore.novncCoreStrings.connecting]
    
    @scala.inline
    def disconnected: typings.novncCore.novncCoreStrings.disconnected = "disconnected".asInstanceOf[typings.novncCore.novncCoreStrings.disconnected]
    
    @scala.inline
    def disconnecting: typings.novncCore.novncCoreStrings.disconnecting = "disconnecting".asInstanceOf[typings.novncCore.novncCoreStrings.disconnecting]
  }
  
  trait NvFBU extends StObject {
    
    var encoding: Double
    
    var encodingName: String
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object NvFBU {
    
    @scala.inline
    def apply(encoding: Double, encodingName: String, height: Double, width: Double, x: Double, y: Double): NvFBU = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], encodingName = encodingName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[NvFBU]
    }
    
    @scala.inline
    implicit class NvFBUMutableBuilder[Self <: NvFBU] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingName(value: String): Self = StObject.set(x, "encodingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait NvRFBDefaults extends StObject {
    
    var disconnectTimeout: js.UndefOr[Double] = js.undefined
    
    var encrypt: js.UndefOr[Boolean] = js.undefined
    
    var focusContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var local_cursor: js.UndefOr[Boolean] = js.undefined
    
    var onBell: js.UndefOr[js.Function1[/* rfb */ RFB, Unit]] = js.undefined
    
    var onClipboard: js.UndefOr[js.Function2[/* rfb */ RFB, /* text */ String, Unit]] = js.undefined
    
    var onDesktopName: js.UndefOr[js.Function2[/* rfb */ RFB, /* name */ String, Unit]] = js.undefined
    
    var onDisconnected: js.UndefOr[js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[String], Unit]] = js.undefined
    
    var onFBResize: js.UndefOr[js.Function3[/* rfb */ RFB, /* width */ Double, /* height */ Double, Unit]] = js.undefined
    
    var onFBUComplete: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.undefined
    
    var onFBUReceive: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, Unit]] = js.undefined
    
    var onNotification: js.UndefOr[
        js.Function4[
          /* rfb */ RFB, 
          /* msg */ String, 
          /* level */ normal | warn | error, 
          /* options */ js.UndefOr[StringDictionary[js.Any]], 
          Unit
        ]
      ] = js.undefined
    
    var onPasswordRequired: js.UndefOr[js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[String], Unit]] = js.undefined
    
    var onUpdateState: js.UndefOr[
        js.Function3[/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState, Unit]
      ] = js.undefined
    
    var onXvpInit: js.UndefOr[js.Function1[/* version */ Double, Unit]] = js.undefined
    
    var repeaterID: js.UndefOr[String] = js.undefined
    
    var shared: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var view_only: js.UndefOr[Boolean] = js.undefined
    
    var viewportDrag: js.UndefOr[Boolean] = js.undefined
    
    var wsProtocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var xvp_password_sep: js.UndefOr[String] = js.undefined
  }
  object NvRFBDefaults {
    
    @scala.inline
    def apply(): NvRFBDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NvRFBDefaults]
    }
    
    @scala.inline
    implicit class NvRFBDefaultsMutableBuilder[Self <: NvRFBDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnectTimeout(value: Double): Self = StObject.set(x, "disconnectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnectTimeoutUndefined: Self = StObject.set(x, "disconnectTimeout", js.undefined)
      
      @scala.inline
      def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      @scala.inline
      def setFocusContainer(value: HTMLElement): Self = StObject.set(x, "focusContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusContainerUndefined: Self = StObject.set(x, "focusContainer", js.undefined)
      
      @scala.inline
      def setLocal_cursor(value: Boolean): Self = StObject.set(x, "local_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal_cursorUndefined: Self = StObject.set(x, "local_cursor", js.undefined)
      
      @scala.inline
      def setOnBell(value: /* rfb */ RFB => Unit): Self = StObject.set(x, "onBell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBellUndefined: Self = StObject.set(x, "onBell", js.undefined)
      
      @scala.inline
      def setOnClipboard(value: (/* rfb */ RFB, /* text */ String) => Unit): Self = StObject.set(x, "onClipboard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClipboardUndefined: Self = StObject.set(x, "onClipboard", js.undefined)
      
      @scala.inline
      def setOnDesktopName(value: (/* rfb */ RFB, /* name */ String) => Unit): Self = StObject.set(x, "onDesktopName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDesktopNameUndefined: Self = StObject.set(x, "onDesktopName", js.undefined)
      
      @scala.inline
      def setOnDisconnected(value: (/* rfb */ RFB, /* reason */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onDisconnected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDisconnectedUndefined: Self = StObject.set(x, "onDisconnected", js.undefined)
      
      @scala.inline
      def setOnFBResize(value: (/* rfb */ RFB, /* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "onFBResize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnFBResizeUndefined: Self = StObject.set(x, "onFBResize", js.undefined)
      
      @scala.inline
      def setOnFBUComplete(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = StObject.set(x, "onFBUComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFBUCompleteUndefined: Self = StObject.set(x, "onFBUComplete", js.undefined)
      
      @scala.inline
      def setOnFBUReceive(value: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit): Self = StObject.set(x, "onFBUReceive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFBUReceiveUndefined: Self = StObject.set(x, "onFBUReceive", js.undefined)
      
      @scala.inline
      def setOnNotification(
        value: (/* rfb */ RFB, /* msg */ String, /* level */ normal | warn | error, /* options */ js.UndefOr[StringDictionary[js.Any]]) => Unit
      ): Self = StObject.set(x, "onNotification", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnNotificationUndefined: Self = StObject.set(x, "onNotification", js.undefined)
      
      @scala.inline
      def setOnPasswordRequired(value: (/* rfb */ RFB, /* msg */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onPasswordRequired", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPasswordRequiredUndefined: Self = StObject.set(x, "onPasswordRequired", js.undefined)
      
      @scala.inline
      def setOnUpdateState(value: (/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState) => Unit): Self = StObject.set(x, "onUpdateState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnUpdateStateUndefined: Self = StObject.set(x, "onUpdateState", js.undefined)
      
      @scala.inline
      def setOnXvpInit(value: /* version */ Double => Unit): Self = StObject.set(x, "onXvpInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnXvpInitUndefined: Self = StObject.set(x, "onXvpInit", js.undefined)
      
      @scala.inline
      def setRepeaterID(value: String): Self = StObject.set(x, "repeaterID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeaterIDUndefined: Self = StObject.set(x, "repeaterID", js.undefined)
      
      @scala.inline
      def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setView_only(value: Boolean): Self = StObject.set(x, "view_only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_onlyUndefined: Self = StObject.set(x, "view_only", js.undefined)
      
      @scala.inline
      def setViewportDrag(value: Boolean): Self = StObject.set(x, "viewportDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportDragUndefined: Self = StObject.set(x, "viewportDrag", js.undefined)
      
      @scala.inline
      def setWsProtocols(value: js.Array[String]): Self = StObject.set(x, "wsProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsProtocolsUndefined: Self = StObject.set(x, "wsProtocols", js.undefined)
      
      @scala.inline
      def setWsProtocolsVarargs(value: String*): Self = StObject.set(x, "wsProtocols", js.Array(value :_*))
      
      @scala.inline
      def setXvp_password_sep(value: String): Self = StObject.set(x, "xvp_password_sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXvp_password_sepUndefined: Self = StObject.set(x, "xvp_password_sep", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.novncCore.novncCoreNumbers.`2`
    - typings.novncCore.novncCoreNumbers.`0`
    - typings.novncCore.novncCoreNumbers.`1`
  */
  trait NvXvpOperation extends StObject
  object NvXvpOperation {
    
    @scala.inline
    def reboot: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def reset: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def shutdown: `2` = 2.asInstanceOf[`2`]
  }
  
  @js.native
  trait RFB extends StObject {
    
    def clipboardPasteFrom(text: String): Unit = js.native
    
    def connect(host: String, port: Double): Boolean = js.native
    def connect(host: String, port: Double, password: String): Boolean = js.native
    def connect(host: String, port: Double, password: String, path: String): Boolean = js.native
    def connect(host: String, port: Double, password: Unit, path: String): Boolean = js.native
    
    def disconnect(): Unit = js.native
    
    def get_disconnectTimeout(): Double = js.native
    
    def get_display(): typings.novncCore.displayMod.default = js.native
    
    def get_encrypt(): Boolean = js.native
    
    def get_focusContainer(): HTMLElement = js.native
    
    def get_keyboard(): Keyboard = js.native
    
    def get_local_cursor(): Boolean = js.native
    
    def get_mouse(): Mouse = js.native
    
    def get_onBell(): js.Function1[/* rfb */ this.type, Unit] = js.native
    
    def get_onClipboard(): js.Function2[/* rfb */ this.type, /* text */ String, Unit] = js.native
    
    def get_onDesktopName(): js.Function2[/* rfb */ this.type, /* name */ String, Unit] = js.native
    
    def get_onDisconnected(): js.Function2[/* rfb */ this.type, /* reason */ js.UndefOr[String], Unit] = js.native
    
    def get_onFBResize(): js.Function3[/* rfb */ this.type, /* width */ Double, /* height */ Double, Unit] = js.native
    
    def get_onFBUComplete(): js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, Unit] = js.native
    
    def get_onFBUReceive(): js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, Unit] = js.native
    
    def get_onNotification(): js.Function4[
        /* rfb */ this.type, 
        /* msg */ String, 
        /* level */ normal | warn | error, 
        /* options */ js.UndefOr[StringDictionary[js.Any]], 
        Unit
      ] = js.native
    
    def get_onPasswordRequired(): js.Function2[/* rfb */ this.type, /* msg */ js.UndefOr[String], Unit] = js.native
    
    def get_onUpdateState(): js.Function3[
        /* rfb */ this.type, 
        /* state */ NvConnectionState, 
        /* oldstate */ NvConnectionState, 
        Unit
      ] = js.native
    
    def get_onXvpInit(): js.Function1[/* version */ Double, Unit] = js.native
    
    def get_repeaterID(): String = js.native
    
    def get_shared(): Boolean = js.native
    
    def get_target(): HTMLCanvasElement = js.native
    
    def get_view_only(): Boolean = js.native
    
    def get_viewportDrag(): Boolean = js.native
    
    def get_wsProtocols(): js.Array[String] = js.native
    
    def get_xvp_password_sep(): String = js.native
    
    def requestDesktopSize(width: Double, height: Double): Boolean = js.native
    
    def sendCtrlAltDel(): Boolean = js.native
    
    def sendKey(keysym: Double, code: String): Boolean = js.native
    def sendKey(keysym: Double, code: String, down: Boolean): Boolean = js.native
    
    def sendPassword(passwd: String): Unit = js.native
    
    def set_disconnectTimeout(disconnectTimeout: Double): Unit = js.native
    
    def set_encrypt(encrypt: Boolean): Unit = js.native
    
    def set_focusContainer(container: HTMLElement): Unit = js.native
    
    def set_local_cursor(localCursor: Boolean): Unit = js.native
    
    def set_onBell(handler: js.Function1[/* rfb */ this.type, Unit]): Unit = js.native
    
    def set_onClipboard(handler: js.Function2[/* rfb */ this.type, /* text */ String, Unit]): Unit = js.native
    
    def set_onDesktopName(handler: js.Function2[/* rfb */ this.type, /* name */ String, Unit]): Unit = js.native
    
    def set_onDisconnected(handler: js.Function2[/* rfb */ this.type, /* reason */ js.UndefOr[String], Unit]): Unit = js.native
    
    def set_onFBResize(handler: js.Function3[/* rfb */ this.type, /* width */ Double, /* height */ Double, Unit]): Unit = js.native
    
    def set_onFBUComplete(handler: js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, Unit]): Unit = js.native
    
    def set_onFBUReceive(handler: js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, Unit]): Unit = js.native
    
    def set_onNotification(
      handler: js.Function4[
          /* rfb */ this.type, 
          /* msg */ String, 
          /* level */ normal | warn | error, 
          /* options */ js.UndefOr[StringDictionary[js.Any]], 
          Unit
        ]
    ): Unit = js.native
    
    def set_onPasswordRequired(handler: js.Function2[/* rfb */ this.type, /* msg */ js.UndefOr[String], Unit]): Unit = js.native
    
    def set_onUpdateState(
      handler: js.Function3[
          /* rfb */ this.type, 
          /* state */ NvConnectionState, 
          /* oldstate */ NvConnectionState, 
          Unit
        ]
    ): Unit = js.native
    
    def set_onXvpInit(handler: js.Function2[/* rfb */ this.type, /* name */ String, Unit]): Unit = js.native
    
    def set_repeaterID(repeaterID: String): Unit = js.native
    
    def set_shared(shared: Boolean): Unit = js.native
    
    def set_target(target: HTMLCanvasElement): Unit = js.native
    
    def set_view_only(viewOnly: Boolean): Unit = js.native
    
    def set_viewportDrag(viewportDrag: Boolean): Unit = js.native
    
    def set_wsProtocols(wsProtocols: js.Array[String]): Unit = js.native
    
    def set_xvp_password_sep(xvpPasswordSep: String): Unit = js.native
    
    def xvpOp(version: Double, op: NvXvpOperation): Boolean = js.native
    
    def xvpReboot(): Boolean = js.native
    
    def xvpReset(): Boolean = js.native
    
    def xvpShutdown(): Boolean = js.native
  }
}
