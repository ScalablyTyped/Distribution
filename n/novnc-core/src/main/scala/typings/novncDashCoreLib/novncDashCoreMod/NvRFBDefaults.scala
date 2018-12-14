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

