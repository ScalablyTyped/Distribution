package typings.mongodb.mod

import typings.mongodb.AnonAllocationsrequiringfileextension
import typings.mongodb.AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
import typings.mongodb.AnonBloomfilterfalsepositives
import typings.mongodb.AnonBtreecheckpointgeneration
import typings.mongodb.AnonBulkloadedcursorinsertcalls
import typings.mongodb.AnonBytescurrentlyinthecache
import typings.mongodb.AnonCompressedpagesread
import typings.mongodb.AnonDictionarymatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiredTigerData extends js.Object {
  var LSM: AnonBloomfilterfalsepositives
  var `block-manager`: AnonAllocationsrequiringfileextension
  var btree: AnonBtreecheckpointgeneration
  var cache: AnonBytescurrentlyinthecache
  var cache_walk: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered
  var compression: AnonCompressedpagesread
  var cursor: AnonBulkloadedcursorinsertcalls
  var reconciliation: AnonDictionarymatches
}

object WiredTigerData {
  @scala.inline
  def apply(
    LSM: AnonBloomfilterfalsepositives,
    `block-manager`: AnonAllocationsrequiringfileextension,
    btree: AnonBtreecheckpointgeneration,
    cache: AnonBytescurrentlyinthecache,
    cache_walk: AnonAveragedifferencebetweencurrentevictiongenerationwhenthepagewaslastconsidered,
    compression: AnonCompressedpagesread,
    cursor: AnonBulkloadedcursorinsertcalls,
    reconciliation: AnonDictionarymatches
  ): WiredTigerData = {
    val __obj = js.Dynamic.literal(LSM = LSM.asInstanceOf[js.Any], btree = btree.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cache_walk = cache_walk.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], reconciliation = reconciliation.asInstanceOf[js.Any])
    __obj.updateDynamic("block-manager")(`block-manager`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredTigerData]
  }
}

