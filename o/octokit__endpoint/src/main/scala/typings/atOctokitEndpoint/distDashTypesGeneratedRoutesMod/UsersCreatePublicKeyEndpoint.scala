package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreatePublicKeyEndpoint extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object UsersCreatePublicKeyEndpoint {
  @scala.inline
  def apply(key: String = null, title: String = null): UsersCreatePublicKeyEndpoint = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UsersCreatePublicKeyEndpoint]
  }
}

