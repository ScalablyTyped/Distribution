package typings.node.moduleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("module", "findSourceMap")
@js.native
object findSourceMap extends js.Object {
  
  def apply(path: String): SourceMap = js.native
  def apply(path: String, error: Error): SourceMap = js.native
}
