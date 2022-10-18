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
  inline def frontmatterFromMarkdown(options: typings.micromarkExtensionFrontmatter.mattersMod.Options): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterFromMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[FromMarkdownExtension]
  
  inline def frontmatterToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def frontmatterToMarkdown(options: typings.micromarkExtensionFrontmatter.mattersMod.Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatterToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Info = typings.micromarkExtensionFrontmatter.mattersMod.Info
  
  type Literal = typings.mdast.mod.Literal
  
  type Map = typings.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Matter = typings.micromarkExtensionFrontmatter.mattersMod.Matter
  
  type Options = typings.micromarkExtensionFrontmatter.mattersMod.Options
  
  type ToMarkdownExtension = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.libTypesMod.Handle
}
