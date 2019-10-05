package typings.neffosDotJs.neffosDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neffos.js", "dial")
@js.native
object dial extends js.Object {
  def apply(endpoint: String, connHandler: js.Any): js.Promise[Conn] = js.native
  def apply(endpoint: String, connHandler: js.Any, options: js.Any): js.Promise[Conn] = js.native
  def apply(endpoint: String, connHandler: js.Any, options: Options): js.Promise[Conn] = js.native
}

