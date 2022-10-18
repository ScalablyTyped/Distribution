package typings.micromarkExtensionFrontmatter

import typings.micromarkExtensionFrontmatter.libHtmlMod.HtmlExtension
import typings.micromarkExtensionFrontmatter.libSyntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-frontmatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")().asInstanceOf[Extension]
  inline def frontmatter(options: typings.micromarkExtensionFrontmatter.devMattersMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  inline def frontmatterHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")().asInstanceOf[HtmlExtension]
  inline def frontmatterHtml(options: typings.micromarkExtensionFrontmatter.devMattersMod.Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Options = typings.micromarkExtensionFrontmatter.devMattersMod.Options
}
