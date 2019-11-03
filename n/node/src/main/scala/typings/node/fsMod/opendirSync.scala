package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "opendirSync")
@js.native
object opendirSync extends js.Object {
  def apply(path: java.lang.String): Dir = js.native
  def apply(path: java.lang.String, options: OpenDirOptions): Dir = js.native
}

