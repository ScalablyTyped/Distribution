package typings
package novncDashCoreLib.libInputDevicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvMouseDefaults extends js.Object {
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var onMouseButton: js.UndefOr[
    js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* down */ scala.Boolean, 
      /* bmask */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var touchButton: js.UndefOr[scala.Double] = js.undefined
}

