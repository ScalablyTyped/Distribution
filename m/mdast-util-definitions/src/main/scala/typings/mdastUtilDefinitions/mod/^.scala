package typings.mdastUtilDefinitions.mod

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdast-util-definitions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a cache of all [definition](https://github.com/syntax-tree/mdast#definition)s in [`node`](https://github.com/syntax-tree/unist#node).
    */
  def apply(node: Node): DefinitionCache = js.native
  def apply(node: Node, options: Options): DefinitionCache = js.native
}

