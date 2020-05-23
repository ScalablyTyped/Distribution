package typings.novncCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.novncCore.novncCoreStrings.error
import typings.novncCore.novncCoreStrings.normal
import typings.novncCore.novncCoreStrings.warn
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvRFBDefaults extends js.Object {
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
  def apply(
    disconnectTimeout: js.UndefOr[Double] = js.undefined,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    focusContainer: HTMLElement = null,
    local_cursor: js.UndefOr[Boolean] = js.undefined,
    onBell: /* rfb */ RFB => Unit = null,
    onClipboard: (/* rfb */ RFB, /* text */ String) => Unit = null,
    onDesktopName: (/* rfb */ RFB, /* name */ String) => Unit = null,
    onDisconnected: (/* rfb */ RFB, /* reason */ js.UndefOr[String]) => Unit = null,
    onFBResize: (/* rfb */ RFB, /* width */ Double, /* height */ Double) => Unit = null,
    onFBUComplete: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit = null,
    onFBUReceive: (/* rfb */ RFB, /* fbu */ NvFBU) => Unit = null,
    onNotification: (/* rfb */ RFB, /* msg */ String, /* level */ normal | warn | error, /* options */ js.UndefOr[StringDictionary[js.Any]]) => Unit = null,
    onPasswordRequired: (/* rfb */ RFB, /* msg */ js.UndefOr[String]) => Unit = null,
    onUpdateState: (/* rfb */ RFB, /* state */ NvConnectionState, /* oldstate */ NvConnectionState) => Unit = null,
    onXvpInit: /* version */ Double => Unit = null,
    repeaterID: String = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    target: HTMLCanvasElement = null,
    view_only: js.UndefOr[Boolean] = js.undefined,
    viewportDrag: js.UndefOr[Boolean] = js.undefined,
    wsProtocols: js.Array[String] = null,
    xvp_password_sep: String = null
  ): NvRFBDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disconnectTimeout)) __obj.updateDynamic("disconnectTimeout")(disconnectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.get.asInstanceOf[js.Any])
    if (focusContainer != null) __obj.updateDynamic("focusContainer")(focusContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(local_cursor)) __obj.updateDynamic("local_cursor")(local_cursor.get.asInstanceOf[js.Any])
    if (onBell != null) __obj.updateDynamic("onBell")(js.Any.fromFunction1(onBell))
    if (onClipboard != null) __obj.updateDynamic("onClipboard")(js.Any.fromFunction2(onClipboard))
    if (onDesktopName != null) __obj.updateDynamic("onDesktopName")(js.Any.fromFunction2(onDesktopName))
    if (onDisconnected != null) __obj.updateDynamic("onDisconnected")(js.Any.fromFunction2(onDisconnected))
    if (onFBResize != null) __obj.updateDynamic("onFBResize")(js.Any.fromFunction3(onFBResize))
    if (onFBUComplete != null) __obj.updateDynamic("onFBUComplete")(js.Any.fromFunction2(onFBUComplete))
    if (onFBUReceive != null) __obj.updateDynamic("onFBUReceive")(js.Any.fromFunction2(onFBUReceive))
    if (onNotification != null) __obj.updateDynamic("onNotification")(js.Any.fromFunction4(onNotification))
    if (onPasswordRequired != null) __obj.updateDynamic("onPasswordRequired")(js.Any.fromFunction2(onPasswordRequired))
    if (onUpdateState != null) __obj.updateDynamic("onUpdateState")(js.Any.fromFunction3(onUpdateState))
    if (onXvpInit != null) __obj.updateDynamic("onXvpInit")(js.Any.fromFunction1(onXvpInit))
    if (repeaterID != null) __obj.updateDynamic("repeaterID")(repeaterID.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(view_only)) __obj.updateDynamic("view_only")(view_only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportDrag)) __obj.updateDynamic("viewportDrag")(viewportDrag.get.asInstanceOf[js.Any])
    if (wsProtocols != null) __obj.updateDynamic("wsProtocols")(wsProtocols.asInstanceOf[js.Any])
    if (xvp_password_sep != null) __obj.updateDynamic("xvp_password_sep")(xvp_password_sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvRFBDefaults]
  }
}

