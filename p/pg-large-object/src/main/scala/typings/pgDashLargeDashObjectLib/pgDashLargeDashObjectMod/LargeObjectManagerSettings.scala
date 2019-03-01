package typings
package pgDashLargeDashObjectLib.pgDashLargeDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LargeObjectManagerSettings extends js.Object {
  var pg: js.UndefOr[pgLib.pgMod.Client] = js.undefined
  var pgPromise: js.UndefOr[js.Object] = js.undefined
}

object LargeObjectManagerSettings {
  @scala.inline
  def apply(pg: pgLib.pgMod.Client = null, pgPromise: js.Object = null): LargeObjectManagerSettings = {
    val __obj = js.Dynamic.literal()
    if (pg != null) __obj.updateDynamic("pg")(pg)
    if (pgPromise != null) __obj.updateDynamic("pgPromise")(pgPromise)
    __obj.asInstanceOf[LargeObjectManagerSettings]
  }
}

