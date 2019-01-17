package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchListResult[K, D] extends js.Object {
  var data: js.Array[D]
  var fetchParameters: FetchListParameters[D]
  var metadata: js.Array[ItemMetadata[K]]
}

