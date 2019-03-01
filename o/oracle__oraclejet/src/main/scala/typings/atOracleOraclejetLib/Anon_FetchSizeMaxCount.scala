package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchSizeMaxCount extends js.Object {
  var fetchSize: scala.Double
  var maxCount: scala.Double
}

object Anon_FetchSizeMaxCount {
  @scala.inline
  def apply(fetchSize: scala.Double, maxCount: scala.Double): Anon_FetchSizeMaxCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetchSize")(fetchSize)
    __obj.updateDynamic("maxCount")(maxCount)
    __obj.asInstanceOf[Anon_FetchSizeMaxCount]
  }
}

