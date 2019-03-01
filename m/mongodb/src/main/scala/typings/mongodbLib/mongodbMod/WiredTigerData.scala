package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiredTigerData extends js.Object {
  var LSM: mongodbLib.Anon_Bloomfilterfalsepositives
  var `block-manager`: mongodbLib.Anon_Allocationsrequiringfileextension
  var btree: mongodbLib.Anon_Btreecheckpointgeneration
  var cache: mongodbLib.Anon_Bytescurrentlyinthecache
  var cache_walk: mongodbLib.Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  var compression: mongodbLib.Anon_Compressedpagesread
  var cursor: mongodbLib.Anon_Bulkloadedcursorinsertcalls
  var reconciliation: mongodbLib.Anon_Dictionarymatches
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: mongodbLib.Anon_Bloomfilterfalsepositives,
    `block-manager`: mongodbLib.Anon_Allocationsrequiringfileextension,
    btree: mongodbLib.Anon_Btreecheckpointgeneration,
    cache: mongodbLib.Anon_Bytescurrentlyinthecache,
    cache_walk: mongodbLib.Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: mongodbLib.Anon_Compressedpagesread,
    cursor: mongodbLib.Anon_Bulkloadedcursorinsertcalls,
    reconciliation: mongodbLib.Anon_Dictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(`block-manager` = `block-manager`)
    __obj.updateDynamic("LSM")(LSM)
    __obj.updateDynamic("btree")(btree)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cache_walk")(cache_walk)
    __obj.updateDynamic("compression")(compression)
    __obj.updateDynamic("cursor")(cursor)
    __obj.updateDynamic("reconciliation")(reconciliation)
    __obj.asInstanceOf[WiredTigerData]
  }
}

