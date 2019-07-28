package typings.node

import typings.node.dnsMod.SoaRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofresolveSoa extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[SoaRecord]
}

object TypeofresolveSoa {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[SoaRecord]): TypeofresolveSoa = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[TypeofresolveSoa]
  }
}

