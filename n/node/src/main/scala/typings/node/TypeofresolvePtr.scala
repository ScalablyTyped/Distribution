package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolvePtr extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]]
}

object TypeofresolvePtr {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[java.lang.String]]): TypeofresolvePtr = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolvePtr]
  }
}

