package typings.atOracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait GroupContext extends js.Object {
  var indexPath: js.Array[_]
  var subId: String
}

object GroupContext {
  @scala.inline
  def apply(indexPath: js.Array[_], subId: String): GroupContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupContext]
  }
}

