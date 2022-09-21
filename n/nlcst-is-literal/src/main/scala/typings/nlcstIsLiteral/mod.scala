package typings.nlcstIsLiteral

import typings.nlcstIsLiteral.nlcstIsLiteralStrings.children
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-is-literal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLiteral(parent: Parent, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Content = typings.nlcst.mod.Content
  
  type Node = Root | Content
  
  /* Inlined std.Extract<nlcst-is-literal.nlcst-is-literal.Node, nlcst-is-literal.nlcst-is-literal.UnistParent> */
  type Parent = children
  
  type Root = typings.nlcst.mod.Root
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
}
