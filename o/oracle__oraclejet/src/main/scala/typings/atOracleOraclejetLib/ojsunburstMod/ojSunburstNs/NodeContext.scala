package typings
package atOracleOraclejetLib.ojsunburstMod.ojSunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContext extends js.Object {
  var indexPath: js.Array[scala.Double]
  var subId: java.lang.String
}

object NodeContext {
  @scala.inline
  def apply(indexPath: js.Array[scala.Double], subId: java.lang.String): NodeContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath, subId = subId)
  
    __obj.asInstanceOf[NodeContext]
  }
}

