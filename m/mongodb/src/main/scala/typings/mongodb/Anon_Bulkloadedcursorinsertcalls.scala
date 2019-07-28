package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bulkloadedcursorinsertcalls extends js.Object {
  var `bulk-loaded cursor-insert calls`: Double
  var `create calls`: Double
  var `cursor-insert key and value bytes inserted`: Double
  var `cursor-remove key bytes removed`: Double
  var `cursor-update value bytes updated`: Double
  var `insert calls`: Double
  var `next calls`: Double
  var `prev calls`: Double
  var `remove calls`: Double
  var `reset calls`: Double
  var `restarted searches`: Double
  var `search calls`: Double
  var `search near calls`: Double
  var `truncate calls`: Double
  var `update calls`: Double
}

object Anon_Bulkloadedcursorinsertcalls {
  @scala.inline
  def apply(
    `bulk-loaded cursor-insert calls`: Double,
    `create calls`: Double,
    `cursor-insert key and value bytes inserted`: Double,
    `cursor-remove key bytes removed`: Double,
    `cursor-update value bytes updated`: Double,
    `insert calls`: Double,
    `next calls`: Double,
    `prev calls`: Double,
    `remove calls`: Double,
    `reset calls`: Double,
    `restarted searches`: Double,
    `search calls`: Double,
    `search near calls`: Double,
    `truncate calls`: Double,
    `update calls`: Double
  ): Anon_Bulkloadedcursorinsertcalls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bulk-loaded cursor-insert calls")(`bulk-loaded cursor-insert calls`)
    __obj.updateDynamic("create calls")(`create calls`)
    __obj.updateDynamic("cursor-insert key and value bytes inserted")(`cursor-insert key and value bytes inserted`)
    __obj.updateDynamic("cursor-remove key bytes removed")(`cursor-remove key bytes removed`)
    __obj.updateDynamic("cursor-update value bytes updated")(`cursor-update value bytes updated`)
    __obj.updateDynamic("insert calls")(`insert calls`)
    __obj.updateDynamic("next calls")(`next calls`)
    __obj.updateDynamic("prev calls")(`prev calls`)
    __obj.updateDynamic("remove calls")(`remove calls`)
    __obj.updateDynamic("reset calls")(`reset calls`)
    __obj.updateDynamic("restarted searches")(`restarted searches`)
    __obj.updateDynamic("search calls")(`search calls`)
    __obj.updateDynamic("search near calls")(`search near calls`)
    __obj.updateDynamic("truncate calls")(`truncate calls`)
    __obj.updateDynamic("update calls")(`update calls`)
    __obj.asInstanceOf[Anon_Bulkloadedcursorinsertcalls]
  }
}

