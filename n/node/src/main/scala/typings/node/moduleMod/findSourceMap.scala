package typings.node.moduleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", "findSourceMap")
@js.native
object findSourceMap extends js.Object {
  /**
    * @experimental
    */
  def apply(path: String): SourceMap = js.native
  def apply(path: String, error: Error): SourceMap = js.native
}

