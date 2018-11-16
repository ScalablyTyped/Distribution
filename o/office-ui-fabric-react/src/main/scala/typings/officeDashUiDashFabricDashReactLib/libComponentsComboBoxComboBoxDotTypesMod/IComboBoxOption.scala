package typings
package officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComboBoxOption
  extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption {
  /**
       * Specific styles for each comboBox option. If you intend to give
       * common styles to all comboBox option please use
       * the prop comboBoxOptionStyles
       */
  var styles: js.UndefOr[stdLib.Partial[IComboBoxOptionStyles]] = js.undefined
  /**
       * In scenarios where embedded data is used at the text prop, we will use the ariaLabel prop
       * to set the aria-label and preview text. Default to false
       * @defaultvalue false;
       */
  var useAriaLabelAsText: js.UndefOr[scala.Boolean] = js.undefined
}

