package typings
package novncDashCoreLib.novncDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvRFBDefaults extends js.Object {
  var disconnectTimeout: js.UndefOr[scala.Double] = js.undefined
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  var focusContainer: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var local_cursor: js.UndefOr[scala.Boolean] = js.undefined
  var onBell: js.UndefOr[js.Function1[/* rfb */ RFB, scala.Unit]] = js.undefined
  var onClipboard: js.UndefOr[js.Function2[/* rfb */ RFB, /* text */ java.lang.String, scala.Unit]] = js.undefined
  var onDesktopName: js.UndefOr[js.Function2[/* rfb */ RFB, /* name */ java.lang.String, scala.Unit]] = js.undefined
  var onDisconnected: js.UndefOr[
    js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  var onFBResize: js.UndefOr[
    js.Function3[/* rfb */ RFB, /* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  ] = js.undefined
  var onFBUComplete: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, scala.Unit]] = js.undefined
  var onFBUReceive: js.UndefOr[js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, scala.Unit]] = js.undefined
  var onNotification: js.UndefOr[
    js.Function4[
      /* rfb */ RFB, 
      /* msg */ java.lang.String, 
      /* level */ novncDashCoreLib.novncDashCoreLibStrings.normal | novncDashCoreLib.novncDashCoreLibStrings.warn | novncDashCoreLib.novncDashCoreLibStrings.error, 
      /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Unit
    ]
  ] = js.undefined
  var onPasswordRequired: js.UndefOr[js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  var onUpdateState: js.UndefOr[
    js.Function3[
      /* rfb */ RFB, 
      /* state */ NvConnectionState, 
      /* oldstate */ NvConnectionState, 
      scala.Unit
    ]
  ] = js.undefined
  var onXvpInit: js.UndefOr[js.Function1[/* version */ scala.Double, scala.Unit]] = js.undefined
  var repeaterID: js.UndefOr[java.lang.String] = js.undefined
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  var view_only: js.UndefOr[scala.Boolean] = js.undefined
  var viewportDrag: js.UndefOr[scala.Boolean] = js.undefined
  var wsProtocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xvp_password_sep: js.UndefOr[java.lang.String] = js.undefined
}

object NvRFBDefaults {
  @scala.inline
  def apply(
    disconnectTimeout: scala.Int | scala.Double = null,
    encrypt: js.UndefOr[scala.Boolean] = js.undefined,
    focusContainer: stdLib.HTMLElement = null,
    local_cursor: js.UndefOr[scala.Boolean] = js.undefined,
    onBell: js.Function1[/* rfb */ RFB, scala.Unit] = null,
    onClipboard: js.Function2[/* rfb */ RFB, /* text */ java.lang.String, scala.Unit] = null,
    onDesktopName: js.Function2[/* rfb */ RFB, /* name */ java.lang.String, scala.Unit] = null,
    onDisconnected: js.Function2[/* rfb */ RFB, /* reason */ js.UndefOr[java.lang.String], scala.Unit] = null,
    onFBResize: js.Function3[/* rfb */ RFB, /* width */ scala.Double, /* height */ scala.Double, scala.Unit] = null,
    onFBUComplete: js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, scala.Unit] = null,
    onFBUReceive: js.Function2[/* rfb */ RFB, /* fbu */ NvFBU, scala.Unit] = null,
    onNotification: js.Function4[
      /* rfb */ RFB, 
      /* msg */ java.lang.String, 
      /* level */ novncDashCoreLib.novncDashCoreLibStrings.normal | novncDashCoreLib.novncDashCoreLibStrings.warn | novncDashCoreLib.novncDashCoreLibStrings.error, 
      /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Unit
    ] = null,
    onPasswordRequired: js.Function2[/* rfb */ RFB, /* msg */ js.UndefOr[java.lang.String], scala.Unit] = null,
    onUpdateState: js.Function3[
      /* rfb */ RFB, 
      /* state */ NvConnectionState, 
      /* oldstate */ NvConnectionState, 
      scala.Unit
    ] = null,
    onXvpInit: js.Function1[/* version */ scala.Double, scala.Unit] = null,
    repeaterID: java.lang.String = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    target: stdLib.HTMLCanvasElement = null,
    view_only: js.UndefOr[scala.Boolean] = js.undefined,
    viewportDrag: js.UndefOr[scala.Boolean] = js.undefined,
    wsProtocols: js.Array[java.lang.String] = null,
    xvp_password_sep: java.lang.String = null
  ): NvRFBDefaults = {
    val __obj = js.Dynamic.literal()
    if (disconnectTimeout != null) __obj.updateDynamic("disconnectTimeout")(disconnectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt)
    if (focusContainer != null) __obj.updateDynamic("focusContainer")(focusContainer)
    if (!js.isUndefined(local_cursor)) __obj.updateDynamic("local_cursor")(local_cursor)
    if (onBell != null) __obj.updateDynamic("onBell")(onBell)
    if (onClipboard != null) __obj.updateDynamic("onClipboard")(onClipboard)
    if (onDesktopName != null) __obj.updateDynamic("onDesktopName")(onDesktopName)
    if (onDisconnected != null) __obj.updateDynamic("onDisconnected")(onDisconnected)
    if (onFBResize != null) __obj.updateDynamic("onFBResize")(onFBResize)
    if (onFBUComplete != null) __obj.updateDynamic("onFBUComplete")(onFBUComplete)
    if (onFBUReceive != null) __obj.updateDynamic("onFBUReceive")(onFBUReceive)
    if (onNotification != null) __obj.updateDynamic("onNotification")(onNotification)
    if (onPasswordRequired != null) __obj.updateDynamic("onPasswordRequired")(onPasswordRequired)
    if (onUpdateState != null) __obj.updateDynamic("onUpdateState")(onUpdateState)
    if (onXvpInit != null) __obj.updateDynamic("onXvpInit")(onXvpInit)
    if (repeaterID != null) __obj.updateDynamic("repeaterID")(repeaterID)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(view_only)) __obj.updateDynamic("view_only")(view_only)
    if (!js.isUndefined(viewportDrag)) __obj.updateDynamic("viewportDrag")(viewportDrag)
    if (wsProtocols != null) __obj.updateDynamic("wsProtocols")(wsProtocols)
    if (xvp_password_sep != null) __obj.updateDynamic("xvp_password_sep")(xvp_password_sep)
    __obj.asInstanceOf[NvRFBDefaults]
  }
}

