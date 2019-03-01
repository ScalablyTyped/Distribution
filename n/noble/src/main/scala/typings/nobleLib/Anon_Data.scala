package typings
package nobleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var uuid: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, uuid: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Anon_Data]
  }
}

