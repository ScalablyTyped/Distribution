package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuSection
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any] {
  /**
    * If set to true, the section will display a divider at the bottom of the section.
    */
  var bottomDivider: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The items to include inside the section.
    */
  var items: js.Array[IContextualMenuItem]
  /**
    * The optional section title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, the section will display a divider at the top of the section.
    */
  var topDivider: js.UndefOr[scala.Boolean] = js.undefined
}

