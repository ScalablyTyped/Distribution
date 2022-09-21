package typings.mdastUtilMdxJsx

import typings.mdastUtilMdxJsx.libMod.FromMarkdownExtension
import typings.mdastUtilMdxJsx.libMod.ToMarkdownExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-mdx-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsxFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  
  inline def mdxJsxToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def mdxJsxToMarkdown(options: typings.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type MdxJsxAttribute = typings.mdastUtilMdxJsx.libMod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typings.mdastUtilMdxJsx.libMod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typings.mdastUtilMdxJsx.libMod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typings.mdastUtilMdxJsx.libMod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typings.mdastUtilMdxJsx.libMod.MdxJsxTextElement
  
  type ToMarkdownOptions = typings.mdastUtilMdxJsx.libMod.ToMarkdownOptions
}
