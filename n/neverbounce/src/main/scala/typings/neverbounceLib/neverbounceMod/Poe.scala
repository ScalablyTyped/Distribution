package typings
package neverbounceLib.neverbounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poe extends js.Object {
  def confirm(
    email: java.lang.String,
    result: java.lang.String,
    confirmationToken: java.lang.String,
    transactionId: java.lang.String
  ): js.Promise[neverbounceLib.Response]
}

object Poe {
  @scala.inline
  def apply(
    confirm: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => js.Promise[neverbounceLib.Response]
  ): Poe = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction4(confirm))
  
    __obj.asInstanceOf[Poe]
  }
}

