package typings.persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var id: typings.persona.Persona.Persona
}

object Navigator {
  @scala.inline
  def apply(id: typings.persona.Persona.Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

