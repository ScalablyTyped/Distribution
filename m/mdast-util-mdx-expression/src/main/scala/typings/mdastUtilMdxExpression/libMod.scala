package typings.mdastUtilMdxExpression

import typings.mdastUtilFromMarkdown.libMod.Extension
import typings.mdastUtilFromMarkdown.libMod.Handle
import typings.mdastUtilToMarkdown.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-mdx-expression/lib", "mdxExpressionFromMarkdown")
  @js.native
  val mdxExpressionFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-mdx-expression/lib", "mdxExpressionToMarkdown")
  @js.native
  val mdxExpressionToMarkdown: ToMarkdownExtension = js.native
  
  type CompileContext = typings.mdastUtilFromMarkdown.libMod.CompileContext
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type MdxFlowExpression = typings.mdastUtilMdxExpression.mod.MdxFlowExpression
  
  type MdxTextExpression = typings.mdastUtilMdxExpression.mod.MdxTextExpression
  
  type Program = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Program */ Any
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.libTypesMod.Handle
}
