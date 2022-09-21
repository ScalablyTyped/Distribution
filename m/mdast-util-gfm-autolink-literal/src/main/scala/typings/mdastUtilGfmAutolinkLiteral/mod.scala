package typings.mdastUtilGfmAutolinkLiteral

import typings.mdastUtilFromMarkdown.mod.Extension
import typings.mdastUtilFromMarkdown.mod.Handle
import typings.mdastUtilFromMarkdown.mod.Transform
import typings.mdastUtilToMarkdown.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-autolink-literal", "gfmAutolinkLiteralFromMarkdown")
  @js.native
  val gfmAutolinkLiteralFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-gfm-autolink-literal", "gfmAutolinkLiteralToMarkdown")
  @js.native
  val gfmAutolinkLiteralToMarkdown: ToMarkdownExtension = js.native
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type FromMarkdownTransform = Transform
  
  type Link = typings.mdast.mod.Link
  
  type PhrasingContent = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_mdast-util-find-and-replace.PhrasingContent */ Any
  
  type RegExpMatchObject = typings.mdastUtilFindAndReplace.mod.RegExpMatchObject
  
  type ReplaceFunction = typings.mdastUtilFindAndReplace.mod.ReplaceFunction
  
  type ToMarkdownExtension = Options
}
