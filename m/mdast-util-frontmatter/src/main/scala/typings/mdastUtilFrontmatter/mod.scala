package typings.mdastUtilFrontmatter

import typings.mdastUtilFromMarkdown.mod.Extension
import typings.mdastUtilFromMarkdown.mod.Handle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-frontmatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatterFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  inline def frontmatterFromMarkdown(options: typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterMod.Options): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterFromMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[FromMarkdownExtension]
  
  inline def frontmatterToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def frontmatterToMarkdown(options: typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterMod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Info = typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterMod.Info
  
  type Literal = typings.mdast.mod.Literal
  
  type Map = typings.mdastUtilToMarkdown.indentLinesMod.Map
  
  type Matter = typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterMod.Matter
  
  type Options = typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterMod.Options
  
  type ToMarkdownExtension = typings.mdastUtilToMarkdown.typesMod.Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.typesMod.Handle
}
