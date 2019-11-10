package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActPromiseResult[T] extends js.Object {
  var context: Hemera[ClientRequest, ClientResponse]
  var data: T
}

object ActPromiseResult {
  @scala.inline
  def apply[T](context: Hemera[ClientRequest, ClientResponse], data: T): ActPromiseResult[T] = {
    val __obj = js.Dynamic.literal(context = context, data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActPromiseResult[T]]
  }
}

