package typings
package officeDashUiDashFabricDashReactLib.libComponentsShimmerShimmerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerElement extends js.Object {
  /**
    * The height of the element (ICircle, ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Required for every element you intend to use.
    */
  var `type`: ShimmerElementType
  /**
    * The vertical alignemt of the element (ICircle, ILine).
    * @defaultvalue center
    */
  var verticalAlign: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.top | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.center | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.bottom
  ] = js.undefined
  /**
    * The width value of the element (ILine, IGap) in pixels.
    * Read more details for each specific element.
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

