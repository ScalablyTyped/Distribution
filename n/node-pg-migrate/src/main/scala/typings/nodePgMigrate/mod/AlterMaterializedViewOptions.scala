package typings.nodePgMigrate.mod

import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterMaterializedViewOptions extends js.Object {
  var cluster: js.UndefOr[Null | `false` | String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var storageParameters: js.UndefOr[js.Object] = js.undefined
}

object AlterMaterializedViewOptions {
  @scala.inline
  def apply(cluster: `false` | String = null, extension: String = null, storageParameters: js.Object = null): AlterMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (storageParameters != null) __obj.updateDynamic("storageParameters")(storageParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterMaterializedViewOptions]
  }
}

