package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-to-markdown/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: typings.mdastUtilToMarkdown.libTypesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Join = typings.mdastUtilToMarkdown.libTypesMod.Join
  
  type Node = typings.mdastUtilToMarkdown.libTypesMod.Node
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type Unsafe = typings.mdastUtilToMarkdown.libTypesMod.Unsafe
}
