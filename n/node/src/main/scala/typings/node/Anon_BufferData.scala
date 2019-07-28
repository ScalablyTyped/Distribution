package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferData extends js.Object {
  var data: js.Array[Double]
  var `type`: typings.node.nodeStrings.Buffer
}

object Anon_BufferData {
  @scala.inline
  def apply(data: js.Array[Double], `type`: typings.node.nodeStrings.Buffer): Anon_BufferData = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BufferData]
  }
}

