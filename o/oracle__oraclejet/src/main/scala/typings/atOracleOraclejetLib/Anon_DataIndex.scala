package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIndex[D, K] extends js.Object {
  var data: D
  var index: scala.Double
  var key: K
}

object Anon_DataIndex {
  @scala.inline
  def apply[D, K](data: D, index: scala.Double, key: K): Anon_DataIndex[D, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index, key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataIndex[D, K]]
  }
}

