package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryProperties
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTraverseMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProperties(node: Node): TSQueryProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(node.asInstanceOf[js.Any]).asInstanceOf[TSQueryProperties]
  
  inline def getVisitorKeys(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorKeys")().asInstanceOf[js.Array[String]]
  inline def getVisitorKeys(node: Node): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorKeys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def traverseChildren(
    node: Node,
    iterator: js.Function2[/* childNode */ Node, /* ancestors */ js.Array[Node], Unit],
    options: TSQueryOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseChildren")(node.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
