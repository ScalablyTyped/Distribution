package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFormatHeadingAsSetextMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/format-heading-as-setext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatHeadingAsSetext(node: Heading, context: Context): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatHeadingAsSetext")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type Heading = typings.mdast.mod.Heading
}
