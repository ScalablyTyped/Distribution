package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKey_Options extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object UsersCreatePublicKey_Options {
  @scala.inline
  def apply(key: java.lang.String = null, title: java.lang.String = null): UsersCreatePublicKey_Options = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UsersCreatePublicKey_Options]
  }
}

