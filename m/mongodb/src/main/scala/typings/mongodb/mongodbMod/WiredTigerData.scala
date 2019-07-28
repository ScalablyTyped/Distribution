package typings.mongodb.mongodbMod

import typings.mongodb.Anon_Allocationsrequiringfileextension
import typings.mongodb.Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typings.mongodb.Anon_Bloomfilterfalsepositives
import typings.mongodb.Anon_Btreecheckpointgeneration
import typings.mongodb.Anon_Bulkloadedcursorinsertcalls
import typings.mongodb.Anon_Bytescurrentlyinthecache
import typings.mongodb.Anon_Compressedpagesread
import typings.mongodb.Anon_Dictionarymatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiredTigerData extends js.Object {
  var LSM: Anon_Bloomfilterfalsepositives
  var `block-manager`: Anon_Allocationsrequiringfileextension
  var btree: Anon_Btreecheckpointgeneration
  var cache: Anon_Bytescurrentlyinthecache
  var cache_walk: Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  var compression: Anon_Compressedpagesread
  var cursor: Anon_Bulkloadedcursorinsertcalls
  var reconciliation: Anon_Dictionarymatches
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: Anon_Bloomfilterfalsepositives,
    `block-manager`: Anon_Allocationsrequiringfileextension,
    btree: Anon_Btreecheckpointgeneration,
    cache: Anon_Bytescurrentlyinthecache,
    cache_walk: Anon_Averagedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: Anon_Compressedpagesread,
    cursor: Anon_Bulkloadedcursorinsertcalls,
    reconciliation: Anon_Dictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM, btree = btree, cache = cache, cache_walk = cache_walk, compression = compression, cursor = cursor, reconciliation = reconciliation)
    __obj.updateDynamic("block-manager")(`block-manager`)
    __obj.asInstanceOf[WiredTigerData]
  }
}

