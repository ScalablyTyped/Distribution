package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorization extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object AnonAuthorization {
  @scala.inline
  def apply(authorization: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): AnonAuthorization = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorization]
  }
}

