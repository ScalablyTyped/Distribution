package typings.mdastUtilToMarkdown.mod

import typings.unist.mod.Node
import typings.unist.mod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler extends js.Object {
  
  def apply(node: Node, parent: js.UndefOr[scala.Nothing], context: Context, safeOptions: SafeOptions): String = js.native
  def apply(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String = js.native
  def apply(node: Node, parent: Parent, context: Context, safeOptions: SafeOptions): String = js.native
  
  var peek: js.UndefOr[Handle] = js.native
}
