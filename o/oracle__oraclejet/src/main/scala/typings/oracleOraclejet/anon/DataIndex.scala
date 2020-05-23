package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataIndex[D, K] extends js.Object {
  var data: D
  var index: Double
  var key: K
}

object DataIndex {
  @scala.inline
  def apply[D, K](data: D, index: Double, key: K): DataIndex[D, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex[D, K]]
  }
}

