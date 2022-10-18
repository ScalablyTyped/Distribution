package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilContainerPhrasingMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/container-phrasing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containerPhrasing(parent: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("containerPhrasing")(parent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type Node = typings.mdastUtilToMarkdown.libTypesMod.Node
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type SafeOptions = typings.mdastUtilToMarkdown.libTypesMod.SafeOptions
}
