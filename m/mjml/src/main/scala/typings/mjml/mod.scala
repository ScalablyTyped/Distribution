package typings.mjml

import org.scalablytyped.runtime.StringDictionary
import typings.mjml.mjmlStrings.skip
import typings.mjml.mjmlStrings.soft
import typings.mjml.mjmlStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(inp: String): MJMLParseResults = ^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def apply(inp: String, opts: MJMLParsingOpts): MJMLParseResults = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  inline def apply(inp: MJMLJsonObject): MJMLParseResults = ^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def apply(inp: MJMLJsonObject, opts: MJMLParsingOpts): MJMLParseResults = (^.asInstanceOf[js.Dynamic].apply(inp.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  
  @JSImport("mjml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MJMLJsonObject extends StObject {
    
    var attributes: js.Object
    
    var children: js.UndefOr[js.Array[MJMLJsonObject]] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var tagName: String
  }
  object MJMLJsonObject {
    
    inline def apply(attributes: js.Object, tagName: String): MJMLJsonObject = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLJsonObject]
    }
    
    extension [Self <: MJMLJsonObject](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[MJMLJsonObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: MJMLJsonObject*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLMinifyOptions extends StObject {
    
    var collapseWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var minifyCSS: js.UndefOr[Boolean] = js.undefined
    
    var removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined
  }
  object MJMLMinifyOptions {
    
    inline def apply(): MJMLMinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MJMLMinifyOptions]
    }
    
    extension [Self <: MJMLMinifyOptions](x: Self) {
      
      inline def setCollapseWhitespace(value: Boolean): Self = StObject.set(x, "collapseWhitespace", value.asInstanceOf[js.Any])
      
      inline def setCollapseWhitespaceUndefined: Self = StObject.set(x, "collapseWhitespace", js.undefined)
      
      inline def setMinifyCSS(value: Boolean): Self = StObject.set(x, "minifyCSS", value.asInstanceOf[js.Any])
      
      inline def setMinifyCSSUndefined: Self = StObject.set(x, "minifyCSS", js.undefined)
      
      inline def setRemoveEmptyAttributes(value: Boolean): Self = StObject.set(x, "removeEmptyAttributes", value.asInstanceOf[js.Any])
      
      inline def setRemoveEmptyAttributesUndefined: Self = StObject.set(x, "removeEmptyAttributes", js.undefined)
    }
  }
  
  trait MJMLParseError extends StObject {
    
    var formattedMessage: String
    
    var line: Double
    
    var message: String
    
    var tagName: String
  }
  object MJMLParseError {
    
    inline def apply(formattedMessage: String, line: Double, message: String, tagName: String): MJMLParseError = {
      val __obj = js.Dynamic.literal(formattedMessage = formattedMessage.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLParseError]
    }
    
    extension [Self <: MJMLParseError](x: Self) {
      
      inline def setFormattedMessage(value: String): Self = StObject.set(x, "formattedMessage", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLParseResults extends StObject {
    
    var errors: js.Array[MJMLParseError]
    
    var html: String
  }
  object MJMLParseResults {
    
    inline def apply(errors: js.Array[MJMLParseError], html: String): MJMLParseResults = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLParseResults]
    }
    
    extension [Self <: MJMLParseResults](x: Self) {
      
      inline def setErrors(value: js.Array[MJMLParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: MJMLParseError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLParsingOpts extends StObject {
    
    var beautify: js.UndefOr[Boolean] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var keepComments: js.UndefOr[Boolean] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var minifyOptions: js.UndefOr[MJMLMinifyOptions] = js.undefined
    
    var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
  }
  object MJMLParsingOpts {
    
    inline def apply(): MJMLParsingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MJMLParsingOpts]
    }
    
    extension [Self <: MJMLParsingOpts](x: Self) {
      
      inline def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      inline def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFonts(value: StringDictionary[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setKeepComments(value: Boolean): Self = StObject.set(x, "keepComments", value.asInstanceOf[js.Any])
      
      inline def setKeepCommentsUndefined: Self = StObject.set(x, "keepComments", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyOptions(value: MJMLMinifyOptions): Self = StObject.set(x, "minifyOptions", value.asInstanceOf[js.Any])
      
      inline def setMinifyOptionsUndefined: Self = StObject.set(x, "minifyOptions", js.undefined)
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setValidationLevel(value: strict | soft | skip): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
      
      inline def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
    }
  }
}
