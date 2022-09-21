package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: typings.mdastUtilToMarkdown.typesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Handle = typings.mdastUtilToMarkdown.typesMod.Handle
  
  type Handlers = typings.mdastUtilToMarkdown.typesMod.Handlers
  
  type Join = typings.mdastUtilToMarkdown.typesMod.Join
  
  type Map = typings.mdastUtilToMarkdown.indentLinesMod.Map
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
  
  type SafeOptions = typings.mdastUtilToMarkdown.typesMod.SafeOptions
  
  type Unsafe = typings.mdastUtilToMarkdown.typesMod.Unsafe
}
