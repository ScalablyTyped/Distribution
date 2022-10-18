package typings.mdastUtilToMarkdown

import typings.mdast.mod.HTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleHtmlMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def html(node: HTML_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type HTML_ = HTML
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
}
