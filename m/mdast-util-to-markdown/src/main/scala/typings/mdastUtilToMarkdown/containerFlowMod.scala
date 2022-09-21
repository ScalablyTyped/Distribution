package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerFlowMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/container-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containerFlow(parent: Parent, context: Context, safeOptions: TrackFields): String = (^.asInstanceOf[js.Dynamic].applyDynamic("containerFlow")(parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Join = typings.mdastUtilToMarkdown.typesMod.Join
  
  type Node = typings.mdastUtilToMarkdown.typesMod.Node
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type TrackFields = typings.mdastUtilToMarkdown.typesMod.TrackFields
}
