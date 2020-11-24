package typings.novncCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.novncCore.devicesMod.Keyboard
import typings.novncCore.devicesMod.Mouse
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.normal
import typings.novncCore.novncCoreStrings.warn
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RFB extends js.Object {
  
  def clipboardPasteFrom(text: String): Unit = js.native
  
  def connect(host: String, port: Double): Boolean = js.native
  def connect(host: String, port: Double, password: js.UndefOr[scala.Nothing], path: String): Boolean = js.native
  def connect(host: String, port: Double, password: String): Boolean = js.native
  def connect(host: String, port: Double, password: String, path: String): Boolean = js.native
  
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
