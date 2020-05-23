package typings.nodePgMigrate.viewsMaterializedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshMaterializedViewOptions extends js.Object {
  var concurrently: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[Boolean] = js.undefined
}

object RefreshMaterializedViewOptions {
  @scala.inline
  def apply(concurrently: js.UndefOr[Boolean] = js.undefined, data: js.UndefOr[Boolean] = js.undefined): RefreshMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.get.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshMaterializedViewOptions]
  }
}

