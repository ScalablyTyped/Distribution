package typings.mosca.moscaMod.persistence

import typings.mosca.moscaMod.Server
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

