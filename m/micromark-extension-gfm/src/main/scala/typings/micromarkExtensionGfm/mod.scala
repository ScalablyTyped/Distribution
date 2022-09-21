package typings.micromarkExtensionGfm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-gfm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfm(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfm")().asInstanceOf[Extension]
  inline def gfm(options: typings.micromarkExtensionGfmStrikethrough.libSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfm")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  inline def gfmHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmHtml")().asInstanceOf[HtmlExtension]
  inline def gfmHtml(options: typings.micromarkExtensionGfmFootnote.libHtmlMod.Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  type HtmlExtension = typings.micromarkUtilTypes.mod.HtmlExtension
  
  type HtmlOptions = typings.micromarkExtensionGfmFootnote.mod.HtmlOptions
  
  type Options = typings.micromarkExtensionGfmStrikethrough.mod.Options
}
