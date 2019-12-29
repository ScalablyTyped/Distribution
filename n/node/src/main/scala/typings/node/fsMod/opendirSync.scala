package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "opendirSync")
@js.native
object opendirSync extends js.Object {
  def apply(path: String): Dir = js.native
  def apply(path: String, options: OpenDirOptions): Dir = js.native
}

