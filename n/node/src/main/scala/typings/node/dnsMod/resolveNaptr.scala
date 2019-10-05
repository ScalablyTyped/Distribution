package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "resolveNaptr")
@js.native
object resolveNaptr extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = js.native
}

