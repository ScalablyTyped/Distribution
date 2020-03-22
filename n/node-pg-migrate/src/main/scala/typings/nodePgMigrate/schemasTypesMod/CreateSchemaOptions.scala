package typings.nodePgMigrate.schemasTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSchemaOptions extends IfNotExistsOption {
  var authorization: js.UndefOr[String] = js.undefined
}

object CreateSchemaOptions {
  @scala.inline
  def apply(authorization: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): CreateSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaOptions]
  }
}

