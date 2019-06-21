package typings
package neverbounceLib.neverbounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  def info(): js.Promise[neverbounceLib.Response]
}

object Account {
  @scala.inline
  def apply(info: () => js.Promise[neverbounceLib.Response]): Account = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction0(info))
  
    __obj.asInstanceOf[Account]
  }
}

