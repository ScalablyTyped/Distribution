package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraPopoverOptions extends js.Object {
  var arrowDir: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

@JSGlobal("CameraPopoverOptions")
@js.native
class CameraPopoverOptionsCls protected () extends CameraPopoverOptions {
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, arrowDir: scala.Double) = this()
}

@JSGlobal("CameraPopoverOptions")
@js.native
object CameraPopoverOptions
  extends org.scalablytyped.runtime.Instantiable5[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* arrowDir */ scala.Double, 
      CameraPopoverOptions
    ]

