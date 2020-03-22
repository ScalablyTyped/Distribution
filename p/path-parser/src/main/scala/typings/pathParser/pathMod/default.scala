package typings.pathParser.pathMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-parser/dist/Path", JSImport.Default)
@js.native
class default[T /* <: Record[String, _] */] protected () extends Path[T] {
  def this(path: String) = this()
  def this(path: String, options: PathOptions) = this()
}

/* static members */
@JSImport("path-parser/dist/Path", JSImport.Default)
@js.native
object default extends js.Object {
  def createPath[T /* <: Record[String, _] */](path: String): Path[T] = js.native
  def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): Path[T] = js.native
}

