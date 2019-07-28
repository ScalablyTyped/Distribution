package typings.persona

import typings.persona.PersonaNs.Persona
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var id: Persona
}

object Navigator {
  @scala.inline
  def apply(id: Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Navigator]
  }
}

