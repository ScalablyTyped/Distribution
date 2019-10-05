package typings.node

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveTxt extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

