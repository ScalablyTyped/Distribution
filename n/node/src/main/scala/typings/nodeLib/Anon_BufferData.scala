package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferData extends js.Object {
  var data: js.Array[scala.Double]
  var `type`: nodeLib.nodeLibStrings.Buffer
}

object Anon_BufferData {
  @scala.inline
  def apply(data: js.Array[scala.Double], `type`: nodeLib.nodeLibStrings.Buffer): Anon_BufferData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_BufferData]
  }
}

