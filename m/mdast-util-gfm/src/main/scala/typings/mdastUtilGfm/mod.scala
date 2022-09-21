package typings.mdastUtilGfm

import typings.mdastUtilGfm.libMod.FromMarkdownExtension
import typings.mdastUtilGfm.libMod.ToMarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFromMarkdown(): js.Array[FromMarkdownExtension] = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFromMarkdown")().asInstanceOf[js.Array[FromMarkdownExtension]]
  
  inline def gfmToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmToMarkdown(options: typings.mdastUtilGfmTable.mod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type Options = typings.mdastUtilGfm.libMod.Options
}
