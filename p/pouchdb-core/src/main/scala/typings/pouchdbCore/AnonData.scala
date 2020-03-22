package typings.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Array[_]
  var `type`: typings.pouchdbCore.pouchdbCoreStrings.Buffer
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[_], `type`: typings.pouchdbCore.pouchdbCoreStrings.Buffer): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

