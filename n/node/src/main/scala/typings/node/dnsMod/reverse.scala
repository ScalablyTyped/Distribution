package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "reverse")
@js.native
object reverse extends js.Object {
  def apply(
    ip: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
}

