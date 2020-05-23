package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[Double]
  var `type`: typings.node.nodeStrings.Buffer
}

object Data {
  @scala.inline
  def apply(data: js.Array[Double], `type`: typings.node.nodeStrings.Buffer): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

