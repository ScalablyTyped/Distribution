package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternativeSecurityId extends js.Object {
  /** For internal use only */
  var identityProvider: js.UndefOr[java.lang.String] = js.undefined
  /** For internal use only */
  var key: js.UndefOr[scala.Double] = js.undefined
  /** For internal use only */
  var `type`: js.UndefOr[scala.Double] = js.undefined
}

object AlternativeSecurityId {
  @scala.inline
  def apply(
    identityProvider: java.lang.String = null,
    key: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null
  ): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    if (identityProvider != null) __obj.updateDynamic("identityProvider")(identityProvider)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeSecurityId]
  }
}

