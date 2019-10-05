package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveSrv extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = js.native
}

