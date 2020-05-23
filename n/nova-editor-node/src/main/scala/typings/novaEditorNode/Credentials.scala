package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  def getPassword(service: String, user: User): String | Null
  def removePassword(service: String, user: User): Null
  def setPassword(service: String, user: User, password: String): Null
}

object Credentials {
  @scala.inline
  def apply(
    getPassword: (String, User) => String | Null,
    removePassword: (String, User) => Null,
    setPassword: (String, User, String) => Null
  ): Credentials = {
    val __obj = js.Dynamic.literal(getPassword = js.Any.fromFunction2(getPassword), removePassword = js.Any.fromFunction2(removePassword), setPassword = js.Any.fromFunction3(setPassword))
    __obj.asInstanceOf[Credentials]
  }
}

