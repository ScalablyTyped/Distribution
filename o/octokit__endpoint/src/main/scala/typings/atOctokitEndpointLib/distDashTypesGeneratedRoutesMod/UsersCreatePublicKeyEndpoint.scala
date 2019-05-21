package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKeyEndpoint extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UsersCreatePublicKeyEndpoint {
  @scala.inline
  def apply(key: java.lang.String = null, title: java.lang.String = null): UsersCreatePublicKeyEndpoint = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UsersCreatePublicKeyEndpoint]
  }
}

