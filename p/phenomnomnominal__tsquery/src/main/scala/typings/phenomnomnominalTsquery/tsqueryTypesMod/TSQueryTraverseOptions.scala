package typings.phenomnomnominalTsquery.tsqueryTypesMod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQueryTraverseOptions extends js.Object {
  
  def enter(node: Node): Unit = js.native
  def enter(node: Node, parent: Node): Unit = js.native
  
  def leave(node: Node): Unit = js.native
  def leave(node: Node, parent: Node): Unit = js.native
  
  var visitAllChildren: Boolean = js.native
}
