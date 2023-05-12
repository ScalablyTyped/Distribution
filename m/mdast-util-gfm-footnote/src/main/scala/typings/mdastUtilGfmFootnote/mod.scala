package typings.mdastUtilGfmFootnote

import typings.mdastUtilFromMarkdown.libMod.Extension
import typings.mdastUtilFromMarkdown.libMod.Handle
import typings.mdastUtilToMarkdown.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-footnote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnoteFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  
  inline def gfmFootnoteToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteToMarkdown")().asInstanceOf[ToMarkdownExtension]
  
  type FootnoteDefinition = typings.mdast.mod.FootnoteDefinition
  
  type FootnoteReference = typings.mdast.mod.FootnoteReference
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Map = typings.mdastUtilToMarkdown.libTypesMod.Map
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.libTypesMod.Handle
}
