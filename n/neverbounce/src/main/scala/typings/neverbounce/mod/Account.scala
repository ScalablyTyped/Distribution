package typings.neverbounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  def info(): js.Promise[Response]
}

object Account {
  @scala.inline
  def apply(info: () => js.Promise[Response]): Account = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction0(info))
    __obj.asInstanceOf[Account]
  }
}

