package typings.micromarkExtensionGfmStrikethrough

import typings.micromarkExtensionGfmStrikethrough.htmlMod.HtmlExtension
import typings.micromarkExtensionGfmStrikethrough.syntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devMod {
  
  @JSImport("micromark-extension-gfm-strikethrough/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmStrikethrough(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")().asInstanceOf[Extension]
  inline def gfmStrikethrough(options: typings.micromarkExtensionGfmStrikethrough.syntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmStrikethrough")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  @JSImport("micromark-extension-gfm-strikethrough/dev", "gfmStrikethroughHtml")
  @js.native
  val gfmStrikethroughHtml: HtmlExtension = js.native
  
  type Options = typings.micromarkExtensionGfmStrikethrough.syntaxMod.Options
}
