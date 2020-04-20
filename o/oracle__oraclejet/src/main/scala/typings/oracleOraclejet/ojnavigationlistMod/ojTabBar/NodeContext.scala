package typings.oracleOraclejet.ojnavigationlistMod.ojTabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext[K] extends js.Object {
  var index: Double
  var key: K
  var subId: String
}

object NodeContext {
  @scala.inline
  def apply[K](index: Double, key: K, subId: String): NodeContext[K] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContext[K]]
  }
}

