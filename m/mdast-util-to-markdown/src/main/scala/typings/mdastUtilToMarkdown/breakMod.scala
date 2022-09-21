package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.typesMod.Context
import typings.mdastUtilToMarkdown.typesMod.Parent
import typings.mdastUtilToMarkdown.typesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/break", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hardBreak(_underscore: Break, _1: Null, context: Context, safe: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hardBreak(_underscore: Break, _1: Unit, context: Context, safe: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hardBreak(_underscore: Break, _1: Parent, context: Context, safe: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hardBreak")(_underscore.asInstanceOf[js.Any], _1.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Break = typings.mdast.mod.Break
  
  type Handle = typings.mdastUtilToMarkdown.typesMod.Handle
}
