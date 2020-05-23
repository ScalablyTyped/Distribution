package typings.nodePgMigrate.indexesTypesMod

import typings.nodePgMigrate.generalTypesMod.CascadeOption
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexOptions
  extends IfExistsOption
     with CascadeOption {
  var concurrently: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object DropIndexOptions {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    concurrently: js.UndefOr[Boolean] = js.undefined,
    ifExists: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexOptions]
  }
}

