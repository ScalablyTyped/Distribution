package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigator type definition with possible `permissions` API support.
  *
  * This interface adds the `permissions` property to the navigator.
  */
@js.native
trait NavigatorPermissions
  extends stdLib.Navigator {
  /**
    * Provides the core Permission API functionality, such as querying and revoking permissions.
    *
    * The typing takes into account that the feature is not widely supported,
    * making code using this API more secure by forcing considering the `undefined` case.
    */
  var permissions: js.UndefOr[Permissions] = js.native
}

