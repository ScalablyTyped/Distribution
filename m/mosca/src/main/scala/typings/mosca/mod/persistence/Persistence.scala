package typings.mosca.mod.persistence

import typings.mosca.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  def wire(server: Server): Unit
}

object Persistence {
  @scala.inline
  def apply(wire: Server => Unit): Persistence = {
    val __obj = js.Dynamic.literal(wire = js.Any.fromFunction1(wire))
  
    __obj.asInstanceOf[Persistence]
  }
}

