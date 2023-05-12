package typings.mdastUtilMdx

import typings.mdastUtilFromMarkdown.libMod.Extension
import typings.mdastUtilToMarkdown.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxFromMarkdown(): js.Array[FromMarkdownExtension] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxFromMarkdown")().asInstanceOf[js.Array[FromMarkdownExtension]]
  
  inline def mdxToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def mdxToMarkdown(options: typings.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type MdxFlowExpression = typings.mdastUtilMdxExpression.mod.MdxFlowExpression
  
  type MdxJsxAttribute = typings.mdastUtilMdxJsx.mod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typings.mdastUtilMdxJsx.mod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typings.mdastUtilMdxJsx.mod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typings.mdastUtilMdxJsx.mod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typings.mdastUtilMdxJsx.mod.MdxJsxTextElement
  
  type MdxTextExpression = typings.mdastUtilMdxExpression.mod.MdxTextExpression
  
  type MdxjsEsm = typings.mdastUtilMdxjsEsm.mod.MdxjsEsm
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownOptions = typings.mdastUtilMdxJsx.mod.ToMarkdownOptions
}
