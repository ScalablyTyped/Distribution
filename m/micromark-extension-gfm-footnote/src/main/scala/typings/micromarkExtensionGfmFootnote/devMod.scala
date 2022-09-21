package typings.micromarkExtensionGfmFootnote

import typings.micromarkExtensionGfmFootnote.htmlMod.HtmlExtension
import typings.micromarkExtensionGfmFootnote.htmlMod.Options
import typings.micromarkExtensionGfmFootnote.syntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devMod {
  
  @JSImport("micromark-extension-gfm-footnote/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnote(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnote")().asInstanceOf[Extension]
  
  inline def gfmFootnoteHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")().asInstanceOf[HtmlExtension]
  inline def gfmFootnoteHtml(options: Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type HtmlOptions = Options
}
