package typings.mdastUtilDefinitions

import typings.mdast.mod.Content
import typings.mdast.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-definitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def definitions(node: Node): js.Function1[/* identifier */ String, Definition | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("definitions")(node.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* identifier */ String, Definition | Null]]
  
  type Definition = typings.mdast.mod.Definition
  
  type Node = Root | Content
}
