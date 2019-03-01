package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/Permissions/query}
  */
trait PermissionDescriptor[N /* <: PermissionName */] extends js.Object {
  /**
    * The name of the API whose permissions you want to query.
    *
    * Please, be aware, that not all of these are supported in every browser
    * that supports the Permissions API. For example, in Firefox you can't query
    * the `'microphone'` or `'camera'` and it'll throw `TypeError`
    */
  var name: N
}

object PermissionDescriptor {
  @scala.inline
  def apply[N /* <: PermissionName */](name: N): PermissionDescriptor[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor[N]]
  }
}

