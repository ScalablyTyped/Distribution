package typings.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("module", "SourceMap")
@js.native
class SourceMap protected () extends js.Object {
  def this(payload: SourceMapPayload) = this()
  
  def findEntry(line: Double, column: Double): SourceMapping = js.native
  
  val payload: SourceMapPayload = js.native
}
