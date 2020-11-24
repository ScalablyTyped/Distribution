package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "openSync")
@js.native
object openSync extends js.Object {
  
  def apply(path: PathLike, flags: OpenMode): Double = js.native
  def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
}
