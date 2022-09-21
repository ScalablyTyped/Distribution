package typings.mdastUtilGfmTable

import typings.mdastUtilGfmTable.libMod.FromMarkdownExtension
import typings.mdastUtilGfmTable.libMod.ToMarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdast-util-gfm-table", "gfmTableFromMarkdown")
  @js.native
  val gfmTableFromMarkdown: FromMarkdownExtension = js.native
  
  inline def gfmTableToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmTableToMarkdown(options: typings.mdastUtilGfmTable.libMod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type Options = typings.mdastUtilGfmTable.libMod.Options
}
