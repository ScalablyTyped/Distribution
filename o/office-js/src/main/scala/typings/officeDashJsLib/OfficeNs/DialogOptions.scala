package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides options for how a dialog is displayed.
     */

trait DialogOptions extends js.Object {
  /**
           * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
           */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
           * Determines whether the dialog box should be displayed within an IFrame. This setting is only applicable in Office Online clients, and is 
           * ignored by other platforms. If false (default), the dialog will be displayed as a new browser window (pop-up). Recommended for 
           * authentication pages that cannot be displayed in an IFrame. If true, the dialog will be displayed as a floating overlay with an IFrame. 
           * This is best for user experience and performance.
           */
  var displayInIframe: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the width of the dialog as a percentage of the current display. Defaults to 80%. 250px minimum.
           */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
           * Determines if the pop-up blocker dialog will be shown to the user. Defaults to true.
           * 
           * `true` - The framework displays a pop-up to trigger the navigation and avoid the browser's pop-up blocker.
           * `false` - The dialog will not be shown and the developer must handle pop-ups (by providing a user interface artifact to trigger the navigation).
           */
  var promptBeforeOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the height of the dialog as a percentage of the current display. Defaults to 80%. 150px minimum.
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

