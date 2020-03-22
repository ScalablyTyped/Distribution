package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.tablesTypesMod.LikeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[LikeOptions] = js.undefined
  var table: Name
}

object AnonOptions {
  @scala.inline
  def apply(table: Name, options: LikeOptions = null): AnonOptions = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

