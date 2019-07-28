package typings.atNivoSankey.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyDataNode extends js.Object {
  var id: String | Double
}

object SankeyDataNode {
  @scala.inline
  def apply(id: String | Double): SankeyDataNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyDataNode]
  }
}

