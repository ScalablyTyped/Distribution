package typings.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
@JSImport("module", "SourceMap")
@js.native
class SourceMap protected () extends js.Object {
  def this(payload: SourceMapPayload) = this()
  val payload: SourceMapPayload = js.native
  def findEntry(line: Double, column: Double): SourceMapping = js.native
}

