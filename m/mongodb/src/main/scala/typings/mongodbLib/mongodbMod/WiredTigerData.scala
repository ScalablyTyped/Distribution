package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WiredTigerData extends js.Object {
  var LSM: mongodbLib.Anon_Bloomfilterpagesevictedfromcache
  var `block-manager`: mongodbLib.Anon_Blocksfreed
  var btree: mongodbLib.Anon_Maximuminternalpagekeysize
  var cache: mongodbLib.Anon_Inmemorypagesplits
  var cache_walk: mongodbLib.Anon_Pagescurrentlyqueuedforeviction
  var compression: mongodbLib.Anon_Rawcompressioncallfailednoadditionaldataavailable
  var cursor: mongodbLib.Anon_Searchnearcalls
  var reconciliation: mongodbLib.Anon_Internalpagemultiblockwrites
}

