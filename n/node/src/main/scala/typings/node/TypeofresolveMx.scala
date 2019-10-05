package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.MxRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveMx extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = js.native
}

