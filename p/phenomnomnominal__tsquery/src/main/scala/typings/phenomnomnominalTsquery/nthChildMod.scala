package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nthChildMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/nth-child", "nthChild")
  @js.native
  def nthChild(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/nth-child", "nthLastChild")
  @js.native
  def nthLastChild(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
}
