package typings.objtools.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objtools", "getPath")
@js.native
object getPath extends js.Object {
  def apply(obj: Record[String, _], path: String): js.Any = js.native
  def apply(obj: Record[String, _], path: String, allowSkipArrays: Boolean): js.Any = js.native
}

