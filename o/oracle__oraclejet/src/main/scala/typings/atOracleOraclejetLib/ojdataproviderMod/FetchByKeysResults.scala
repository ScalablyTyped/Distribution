package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysResults[K, D] extends js.Object {
  var fetchParameters: FetchByKeysParameters[K]
  var results: stdLib.Map[K, Item[K, D]]
}

