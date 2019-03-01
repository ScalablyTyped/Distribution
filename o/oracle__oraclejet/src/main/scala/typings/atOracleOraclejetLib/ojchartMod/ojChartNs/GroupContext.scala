package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait GroupContext extends js.Object {
  var indexPath: js.Array[_]
  var subId: java.lang.String
}

object GroupContext {
  @scala.inline
  def apply(indexPath: js.Array[_], subId: java.lang.String): GroupContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexPath")(indexPath)
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[GroupContext]
  }
}

