package typings.nodePgMigrate.anon

import typings.nodePgMigrate.tablesTypesMod.LikeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[LikeOptions] = js.undefined
  var table: typings.nodePgMigrate.generalTypesMod.Name
}

object Options {
  @scala.inline
  def apply(table: typings.nodePgMigrate.generalTypesMod.Name, options: LikeOptions = null): Options = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

