package typings.node

import typings.node.dnsMod.NaptrRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveNaptr extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]]
}

object TypeofresolveNaptr {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[NaptrRecord]]): TypeofresolveNaptr = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveNaptr]
  }
}

