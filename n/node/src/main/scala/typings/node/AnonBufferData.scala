package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferData extends js.Object {
  var data: js.Array[Double]
  var `type`: typings.node.nodeStrings.Buffer
}

object AnonBufferData {
  @scala.inline
  def apply(data: js.Array[Double], `type`: typings.node.nodeStrings.Buffer): AnonBufferData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferData]
  }
}

