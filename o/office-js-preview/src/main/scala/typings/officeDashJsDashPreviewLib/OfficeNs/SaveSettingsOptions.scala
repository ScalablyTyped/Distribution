package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides options for saving settings.
     */

trait SaveSettingsOptions extends js.Object {
  /**
           * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
           */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
           * Indicates whether the setting will be replaced if stale.
           */
  var overwriteIfStale: js.UndefOr[scala.Boolean] = js.undefined
}

