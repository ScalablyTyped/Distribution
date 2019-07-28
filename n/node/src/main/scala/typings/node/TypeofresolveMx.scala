package typings.node

import typings.node.dnsMod.MxRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveMx extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[MxRecord]]
}

object TypeofresolveMx {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[MxRecord]]): TypeofresolveMx = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveMx]
  }
}

