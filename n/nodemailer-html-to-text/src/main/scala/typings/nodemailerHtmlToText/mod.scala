package typings.nodemailerHtmlToText

import typings.htmlToText.mod.HtmlToTextOptions
import typings.nodemailer.mailerMod.PluginFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer-html-to-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlToText(): PluginFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToText")().asInstanceOf[PluginFunction]
  inline def htmlToText(options: HtmlToTextOptions): PluginFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToText")(options.asInstanceOf[js.Any]).asInstanceOf[PluginFunction]
}
