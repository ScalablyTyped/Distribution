package typings.nodePgMigrate.extensionsTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExtensionOptions extends IfNotExistsOption {
  var schema: js.UndefOr[String] = js.undefined
}

object CreateExtensionOptions {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[Boolean] = js.undefined, schema: String = null): CreateExtensionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExtensionOptions]
  }
}

