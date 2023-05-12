package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-to-markdown/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: typings.mdastUtilToMarkdown.libTypesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Enter = typings.mdastUtilToMarkdown.libTypesMod.Enter
  
  type FlowContent = typings.mdastUtilToMarkdown.libTypesMod.FlowContent
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  type Join = typings.mdastUtilToMarkdown.libTypesMod.Join
  
  type Node = typings.mdastUtilToMarkdown.libTypesMod.Node
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type PhrasingContent = typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent
  
  type SafeConfig = typings.mdastUtilToMarkdown.libTypesMod.SafeConfig
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
  
  type TrackFields = typings.mdastUtilToMarkdown.libTypesMod.TrackFields
}
