package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var data: js.Array[_]
  var `type`: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.Buffer
}

object Anon_Buffer {
  @scala.inline
  def apply(data: js.Array[_], `type`: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.Buffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

