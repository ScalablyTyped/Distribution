package typings
package officeDashUiDashFabricDashReactLib.libComponentsStickyStickyDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyProps
  extends reactLib.reactMod.ReactNs.Props[officeDashUiDashFabricDashReactLib.libComponentsStickyStickyMod.Sticky] {
  /**
    * Gets ref to component interface.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IStickyProps]] = js.undefined
  /**
    * If true, then match scrolling position of placeholder element in Sticky.
    * @defaultvalue true
    */
  var isScrollSynced: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * color to apply as 'background-color' style for sticky element.
    */
  var stickyBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class name to apply to the sticky element if component is sticky.
    */
  var stickyClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Region to render sticky component in.
    * @defaultvalue Both
    */
  var stickyPosition: js.UndefOr[StickyPositionType] = js.undefined
}

