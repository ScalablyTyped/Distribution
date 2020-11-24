package typings.mdastUtilToMarkdown.mod

import typings.unist.mod.Node
import typings.unist.mod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  def enter(`type`: String): js.Function0[Unit] = js.native
  
  def handle(node: Node, parent: js.UndefOr[scala.Nothing], context: Context, safeOptions: SafeOptions): String = js.native
  def handle(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String = js.native
  def handle(node: Node, parent: Parent, context: Context, safeOptions: SafeOptions): String = js.native
  @JSName("handle")
  var handle_Original: Handle = js.native
  
  var join: js.Array[Join] = js.native
  
  var options: Options = js.native
  
  var stack: js.Array[String] = js.native
  
  var unsafePatterns: js.Array[Unsafe] = js.native
}
