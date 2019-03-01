package typings
package personaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var id: personaLib.PersonaNs.Persona
}

object Navigator {
  @scala.inline
  def apply(id: personaLib.PersonaNs.Persona): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Navigator]
  }
}

