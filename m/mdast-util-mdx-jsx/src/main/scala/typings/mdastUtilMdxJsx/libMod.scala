package typings.mdastUtilMdxJsx

import typings.mdastUtilFromMarkdown.libMod.Extension
import typings.mdastUtilFromMarkdown.libMod.Handle
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.Quotationmark
import typings.mdastUtilToMarkdown.libTypesMod.Map
import typings.mdastUtilToMarkdown.libTypesMod.Options
import typings.micromarkUtilTypes.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-mdx-jsx/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsxFromMarkdown(): FromMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxFromMarkdown")().asInstanceOf[FromMarkdownExtension]
  
  inline def mdxJsxToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def mdxJsxToMarkdown(options: ToMarkdownOptions): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsxToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type Literal = typings.mdast.mod.Literal
  
  type MdxJsxAttribute = typings.mdastUtilMdxJsx.libComplexTypesMod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typings.mdastUtilMdxJsx.libComplexTypesMod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typings.mdastUtilMdxJsx.libComplexTypesMod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typings.mdastUtilMdxJsx.libComplexTypesMod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typings.mdastUtilMdxJsx.libComplexTypesMod.MdxJsxTextElement
  
  type OnEnterError = typings.mdastUtilFromMarkdown.libMod.OnEnterError
  
  type OnExitError = typings.mdastUtilFromMarkdown.libMod.OnExitError
  
  type Parent = typings.mdast.mod.Parent
  
  type Program = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Program */ Any
  
  trait Tag extends StObject {
    
    var attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute]
    
    var close: js.UndefOr[Boolean] = js.undefined
    
    var end: Point
    
    var name: String | Null
    
    var selfClosing: js.UndefOr[Boolean] = js.undefined
    
    var start: Point
  }
  object Tag {
    
    inline def apply(attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute], end: Point, start: Point): Tag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: (MdxJsxAttribute | MdxJsxExpressionAttribute)*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type ToMarkdownMap = Map
  
  trait ToMarkdownOptions extends StObject {
    
    /**
      * Specify the line length that the printer will wrap on.
      * This is not a hard maximum width: things will be printed longer and
      * shorter.
      *
      * Note: this option is only used for JSX tags currently, and might be moved
      * to `mdast-util-to-markdown` in the future.
      */
    var printWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Preferred quote to use around attribute values.
      */
    var quote: js.UndefOr[Quotationmark | (/* ' */ String)] = js.undefined
    
    /**
      * Use the other quote if that results in less bytes.
      */
    var quoteSmart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not use an extra space when closing self-closing elements: `<img/>`
      * instead of `<img />`.
      */
    var tightSelfClosing: js.UndefOr[Boolean] = js.undefined
  }
  object ToMarkdownOptions {
    
    inline def apply(): ToMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToMarkdownOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToMarkdownOptions] (val x: Self) extends AnyVal {
      
      inline def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
      
      inline def setPrintWidthUndefined: Self = StObject.set(x, "printWidth", js.undefined)
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteSmart(value: Boolean): Self = StObject.set(x, "quoteSmart", value.asInstanceOf[js.Any])
      
      inline def setQuoteSmartUndefined: Self = StObject.set(x, "quoteSmart", js.undefined)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setTightSelfClosing(value: Boolean): Self = StObject.set(x, "tightSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setTightSelfClosingUndefined: Self = StObject.set(x, "tightSelfClosing", js.undefined)
    }
  }
  
  type Token = typings.mdastUtilFromMarkdown.libMod.Token
}
