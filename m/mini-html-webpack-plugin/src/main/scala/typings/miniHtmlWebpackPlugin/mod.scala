package typings.miniHtmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A miniature version of html-webpack-plugin with only necessary features
    * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
    */
  @JSImport("mini-html-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with MiniHtmlWebpackPlugin {
    def this(options: PluginOptions) = this()
  }
  @JSImport("mini-html-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTemplate")().asInstanceOf[String]
  inline def defaultTemplate(options: PluginContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateAttributes(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAttributes")().asInstanceOf[String]
  inline def generateAttributes(options: GenerateAttributesOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAttributes")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateCSSReferences(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCSSReferences")().asInstanceOf[String]
  inline def generateCSSReferences(options: GenerateCSSReferencesOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCSSReferences")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateJSReferences(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateJSReferences")().asInstanceOf[String]
  inline def generateJSReferences(options: GenerateJSReferencesOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateJSReferences")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AttributesType = StringDictionary[String | Boolean]
  
  trait FilesOptions extends StObject {
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
  }
  object FilesOptions {
    
    inline def apply(): FilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilesOptions]
    }
    
    extension [Self <: FilesOptions](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
  
  trait GenerateAttributesOptions extends StObject {
    
    var attributes: js.UndefOr[AttributesType] = js.undefined
  }
  object GenerateAttributesOptions {
    
    inline def apply(): GenerateAttributesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateAttributesOptions]
    }
    
    extension [Self <: GenerateAttributesOptions](x: Self) {
      
      inline def setAttributes(value: AttributesType): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  trait GenerateCSSReferencesOptions
    extends StObject
       with GenerateAttributesOptions
       with FilesOptions
  object GenerateCSSReferencesOptions {
    
    inline def apply(): GenerateCSSReferencesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateCSSReferencesOptions]
    }
  }
  
  trait GenerateJSReferencesOptions
    extends StObject
       with GenerateAttributesOptions
       with FilesOptions
  object GenerateJSReferencesOptions {
    
    inline def apply(): GenerateJSReferencesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateJSReferencesOptions]
    }
  }
  
  /**
    * A miniature version of html-webpack-plugin with only necessary features
    * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
    */
  @js.native
  trait MiniHtmlWebpackPlugin
    extends StObject
       with Plugin {
    
    def plugin(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
      callback: js.Function0[Unit]
    ): Unit = js.native
  }
  
  trait PluginContext extends StObject {
    
    /** Optional, any additional HTML attached within <body> */
    var body: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[js.Array[String]] = js.undefined
    
    var cssAttributes: js.UndefOr[AttributesType] = js.undefined
    
    /** Optional, any additional HTML attached within <head> */
    var head: js.UndefOr[String] = js.undefined
    
    /** Optional, defaults to `{ lang: 'en' }` */
    var htmlAttributes: js.UndefOr[AttributesType] = js.undefined
    
    var jsAttributes: js.UndefOr[AttributesType] = js.undefined
    
    @JSName("js")
    var js_ : js.UndefOr[js.Array[String]] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PluginContext {
    
    inline def apply(): PluginContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginContext]
    }
    
    extension [Self <: PluginContext](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssAttributes(value: AttributesType): Self = StObject.set(x, "cssAttributes", value.asInstanceOf[js.Any])
      
      inline def setCssAttributesUndefined: Self = StObject.set(x, "cssAttributes", js.undefined)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHtmlAttributes(value: AttributesType): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setJsAttributes(value: AttributesType): Self = StObject.set(x, "jsAttributes", value.asInstanceOf[js.Any])
      
      inline def setJsAttributesUndefined: Self = StObject.set(x, "jsAttributes", js.undefined)
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PluginOptions extends StObject {
    
    /** Optional, use this for choosing chunks to include to your page. */
    var chunks: js.UndefOr[js.Array[String]] = js.undefined
    
    var context: js.UndefOr[PluginContext] = js.undefined
    
    /** Optional, defaults to `index.html` */
    var filename: js.UndefOr[String] = js.undefined
    
    var publicPath: js.UndefOr[String] = js.undefined
    
    /** define a template function to generate your own code */
    var template: js.UndefOr[js.Function1[/* context */ PluginContext, String | js.Promise[String]]] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setChunks(value: js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      inline def setContext(value: PluginContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setTemplate(value: /* context */ PluginContext => String | js.Promise[String]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
