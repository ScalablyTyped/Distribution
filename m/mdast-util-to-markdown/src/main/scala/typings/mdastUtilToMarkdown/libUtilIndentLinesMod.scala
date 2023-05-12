package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.libTypesMod.IndentLines
import typings.mdastUtilToMarkdown.libTypesMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilIndentLinesMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/indent-lines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentLines(value: String, map: Map): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentLines")(value.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type IndentLines_ = IndentLines
}
