package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatLinkAsAutolinkMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/format-link-as-autolink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatLinkAsAutolink(node: Link, context: Context): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLinkAsAutolink")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Link = typings.mdast.mod.Link
}
