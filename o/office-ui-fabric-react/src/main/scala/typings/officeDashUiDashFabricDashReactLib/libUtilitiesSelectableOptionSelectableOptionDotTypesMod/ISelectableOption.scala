package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectableOption extends js.Object {
  /**
    * The aria label for the dropdown option. If not present, the `text` will be used.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data available to custom onRender functions.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the option is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Index for this option
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text to render for this option
    */
  var itemType: js.UndefOr[SelectableOptionMenuItemType] = js.undefined
  /**
    * Arbitrary string associated with this option.
    */
  var key: java.lang.String | scala.Double
  /** If option is selected. */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text to render for this option
    */
  var text: java.lang.String
  /**
    * Title attribute (built in tooltip) for a given option.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

