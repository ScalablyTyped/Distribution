package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatCodeAsIndentedMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/format-code-as-indented", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCodeAsIndented(node: Code, context: Context): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCodeAsIndented")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Code = typings.mdast.mod.Code
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
}
