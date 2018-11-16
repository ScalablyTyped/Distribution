package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPersonaStyleProps extends js.Object {
  /**
       * Custom class name.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional custom persona coin size in pixel.
       */
  var coinSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Presence of the person to display - will not display presence if undefined.
       * @defaultvalue PersonaPresence.none
       */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  var showSecondaryText: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Decides the size of the control.
       * @defaultvalue PersonaSize.size48
       */
  var size: js.UndefOr[PersonaSize] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
}

