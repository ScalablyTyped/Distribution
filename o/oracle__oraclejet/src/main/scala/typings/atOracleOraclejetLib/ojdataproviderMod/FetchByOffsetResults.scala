package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetResults[K, D] extends js.Object {
  var done: scala.Boolean
  var fetchParameters: FetchByOffsetParameters[D]
  var results: js.Array[Item[K, D]]
}

