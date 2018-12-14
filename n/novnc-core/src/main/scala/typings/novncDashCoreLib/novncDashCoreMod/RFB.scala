package typings
package novncDashCoreLib.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RFB extends js.Object {
  def clipboardPasteFrom(text: java.lang.String): scala.Unit = js.native
  def connect(host: java.lang.String, port: scala.Double): scala.Boolean = js.native
  def connect(host: java.lang.String, port: scala.Double, password: java.lang.String): scala.Boolean = js.native
  def connect(host: java.lang.String, port: scala.Double, password: java.lang.String, path: java.lang.String): scala.Boolean = js.native
  def disconnect(): scala.Unit = js.native
  def get_disconnectTimeout(): scala.Double = js.native
  def get_display(): novncDashCoreLib.libDisplayMod.default = js.native
  def get_encrypt(): scala.Boolean = js.native
  def get_focusContainer(): stdLib.HTMLElement = js.native
  def get_keyboard(): novncDashCoreLib.libInputDevicesMod.Keyboard = js.native
  def get_local_cursor(): scala.Boolean = js.native
  def get_mouse(): novncDashCoreLib.libInputDevicesMod.Mouse = js.native
  def get_onBell(): js.Function1[/* rfb */ this.type, scala.Unit] = js.native
  def get_onClipboard(): js.Function2[/* rfb */ this.type, /* text */ java.lang.String, scala.Unit] = js.native
  def get_onDesktopName(): js.Function2[/* rfb */ this.type, /* name */ java.lang.String, scala.Unit] = js.native
  def get_onDisconnected(): js.Function2[/* rfb */ this.type, /* reason */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  def get_onFBResize(): js.Function3[/* rfb */ this.type, /* width */ scala.Double, /* height */ scala.Double, scala.Unit] = js.native
  def get_onFBUComplete(): js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, scala.Unit] = js.native
  def get_onFBUReceive(): js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, scala.Unit] = js.native
  def get_onNotification(): js.Function4[
    /* rfb */ this.type, 
    /* msg */ java.lang.String, 
    /* level */ novncDashCoreLib.novncDashCoreLibStrings.normal | novncDashCoreLib.novncDashCoreLibStrings.warn | novncDashCoreLib.novncDashCoreLibStrings.error, 
    /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    scala.Unit
  ] = js.native
  def get_onPasswordRequired(): js.Function2[/* rfb */ this.type, /* msg */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  def get_onUpdateState(): js.Function3[
    /* rfb */ this.type, 
    /* state */ NvConnectionState, 
    /* oldstate */ NvConnectionState, 
    scala.Unit
  ] = js.native
  def get_onXvpInit(): js.Function1[/* version */ scala.Double, scala.Unit] = js.native
  def get_repeaterID(): java.lang.String = js.native
  def get_shared(): scala.Boolean = js.native
  def get_target(): stdLib.HTMLCanvasElement = js.native
  def get_view_only(): scala.Boolean = js.native
  def get_viewportDrag(): scala.Boolean = js.native
  def get_wsProtocols(): js.Array[java.lang.String] = js.native
  def get_xvp_password_sep(): java.lang.String = js.native
  def requestDesktopSize(width: scala.Double, height: scala.Double): scala.Boolean = js.native
  def sendCtrlAltDel(): scala.Boolean = js.native
  def sendKey(keysym: scala.Double, code: java.lang.String): scala.Boolean = js.native
  def sendKey(keysym: scala.Double, code: java.lang.String, down: scala.Boolean): scala.Boolean = js.native
  def sendPassword(passwd: java.lang.String): scala.Unit = js.native
  def set_disconnectTimeout(disconnectTimeout: scala.Double): scala.Unit = js.native
  def set_encrypt(encrypt: scala.Boolean): scala.Unit = js.native
  def set_focusContainer(container: stdLib.HTMLElement): scala.Unit = js.native
  def set_local_cursor(localCursor: scala.Boolean): scala.Unit = js.native
  def set_onBell(handler: js.Function1[/* rfb */ this.type, scala.Unit]): scala.Unit = js.native
  def set_onClipboard(handler: js.Function2[/* rfb */ this.type, /* text */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def set_onDesktopName(handler: js.Function2[/* rfb */ this.type, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def set_onDisconnected(handler: js.Function2[/* rfb */ this.type, /* reason */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  def set_onFBResize(
    handler: js.Function3[/* rfb */ this.type, /* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def set_onFBUComplete(handler: js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, scala.Unit]): scala.Unit = js.native
  def set_onFBUReceive(handler: js.Function2[/* rfb */ this.type, /* fbu */ NvFBU, scala.Unit]): scala.Unit = js.native
  def set_onNotification(
    handler: js.Function4[
      /* rfb */ this.type, 
      /* msg */ java.lang.String, 
      /* level */ novncDashCoreLib.novncDashCoreLibStrings.normal | novncDashCoreLib.novncDashCoreLibStrings.warn | novncDashCoreLib.novncDashCoreLibStrings.error, 
      /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set_onPasswordRequired(handler: js.Function2[/* rfb */ this.type, /* msg */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  def set_onUpdateState(
    handler: js.Function3[
      /* rfb */ this.type, 
      /* state */ NvConnectionState, 
      /* oldstate */ NvConnectionState, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set_onXvpInit(handler: js.Function2[/* rfb */ this.type, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def set_repeaterID(repeaterID: java.lang.String): scala.Unit = js.native
  def set_shared(shared: scala.Boolean): scala.Unit = js.native
  def set_target(target: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def set_view_only(viewOnly: scala.Boolean): scala.Unit = js.native
  def set_viewportDrag(viewportDrag: scala.Boolean): scala.Unit = js.native
  def set_wsProtocols(wsProtocols: js.Array[java.lang.String]): scala.Unit = js.native
  def set_xvp_password_sep(xvpPasswordSep: java.lang.String): scala.Unit = js.native
  def xvpOp(version: scala.Double, op: NvXvpOperation): scala.Boolean = js.native
  def xvpReboot(): scala.Boolean = js.native
  def xvpReset(): scala.Boolean = js.native
  def xvpShutdown(): scala.Boolean = js.native
}

