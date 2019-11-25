package typings.pouchdbDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var data: js.Array[_]
  var `type`: typings.pouchdbDashCore.pouchdbDashCoreStrings.Buffer
}

object Anon_Buffer {
  @scala.inline
  def apply(data: js.Array[_], `type`: typings.pouchdbDashCore.pouchdbDashCoreStrings.Buffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buffer]
  }
}

