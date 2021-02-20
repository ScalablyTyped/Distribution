package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryProperties
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traverseMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/traverse", "getProperties")
  @js.native
  def getProperties(node: Node): TSQueryProperties = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/traverse", "getVisitorKeys")
  @js.native
  def getVisitorKeys(): js.Array[String] = js.native
  @JSImport("@phenomnomnominal/tsquery/dist/src/traverse", "getVisitorKeys")
  @js.native
  def getVisitorKeys(node: Node): js.Array[String] = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/traverse", "traverseChildren")
  @js.native
  def traverseChildren(
    node: Node,
    iterator: js.Function2[/* childNode */ Node, /* ancestors */ js.Array[Node], Unit],
    options: TSQueryOptions
  ): Unit = js.native
}
