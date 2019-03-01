package typings
package atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext[K] extends js.Object {
  var index: scala.Double
  var key: K
  var subId: java.lang.String
}

object NodeContext {
  @scala.inline
  def apply[K](index: scala.Double, key: K, subId: java.lang.String): NodeContext[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("subId")(subId)
    __obj.asInstanceOf[NodeContext[K]]
  }
}

