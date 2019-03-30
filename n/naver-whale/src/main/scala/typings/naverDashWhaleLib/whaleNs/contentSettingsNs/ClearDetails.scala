package typings
package naverDashWhaleLib.whaleNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearDetails extends js.Object {
  /**
    * Optional.
    * Where to clear the setting (default: regular).
    * The scope of the ContentSetting. One of
    * * regular: setting for regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * * incognito_session_only: setting for incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular settings).
    */
  var scope: js.UndefOr[chromeLib.chromeNs.contentSettingsNs.ScopeEnum] = js.undefined
}

object ClearDetails {
  @scala.inline
  def apply(scope: chromeLib.chromeNs.contentSettingsNs.ScopeEnum = null): ClearDetails = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ClearDetails]
  }
}

