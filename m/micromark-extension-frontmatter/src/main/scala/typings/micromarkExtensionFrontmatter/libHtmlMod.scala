package typings.micromarkExtensionFrontmatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlMod {
  
  @JSImport("micromark-extension-frontmatter/lib/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatterHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")().asInstanceOf[HtmlExtension]
  inline def frontmatterHtml(options: typings.micromarkExtensionFrontmatter.devMattersMod.Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Handle = typings.micromarkUtilTypes.mod.Handle
  
  type HtmlExtension = typings.micromarkUtilTypes.mod.HtmlExtension
  
  type Options = typings.micromarkExtensionFrontmatter.devMattersMod.Options
}
