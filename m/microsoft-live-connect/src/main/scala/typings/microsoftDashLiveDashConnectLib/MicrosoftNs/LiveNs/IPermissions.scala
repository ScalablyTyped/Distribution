package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Permissions object contains a list of scopes, showing those scopes to
  * which the user has consented. The response body contains a JSON object
  * that lists all consented scopes as a name/value pair. Each scope to which
  * the user consented is present as a key.
  */
trait IPermissions
  extends /* scope */ org.scalablytyped.runtime.StringDictionary[scala.Double]

object IPermissions {
  @scala.inline
  def apply(StringDictionary: /* scope */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null): IPermissions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IPermissions]
  }
}

