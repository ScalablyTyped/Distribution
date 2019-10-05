package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.SoaRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveSoa extends js.Object {
  def apply(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  def __promisify__(hostname: java.lang.String): js.Promise[SoaRecord] = js.native
}

