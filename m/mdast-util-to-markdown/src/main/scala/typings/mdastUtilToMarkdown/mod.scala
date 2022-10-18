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
  inline def toMarkdown(tree: Node, options: typings.mdastUtilToMarkdown.libTypesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Handlers = typings.mdastUtilToMarkdown.libTypesMod.Handlers
  
  type Join = typings.mdastUtilToMarkdown.libTypesMod.Join
  
  type Map = typings.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type SafeOptions = typings.mdastUtilToMarkdown.libTypesMod.SafeOptions
  
  type Unsafe = typings.mdastUtilToMarkdown.libTypesMod.Unsafe
}
