package typings.miniHtmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A miniature version of html-webpack-plugin with only necessary features
    * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
    */
  @JSImport("mini-html-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends MiniHtmlWebpackPlugin {
    def this(options: PluginOptions) = this()
  }
  
  @JSImport("mini-html-webpack-plugin", "defaultTemplate")
  @js.native
  def defaultTemplate(): String = js.native
  @JSImport("mini-html-webpack-plugin", "defaultTemplate")
  @js.native
  def defaultTemplate(options: PluginContext): String = js.native
  
  @JSImport("mini-html-webpack-plugin", "generateAttributes")
  @js.native
  def generateAttributes(): String = js.native
  @JSImport("mini-html-webpack-plugin", "generateAttributes")
  @js.native
  def generateAttributes(options: GenerateAttributesOptions): String = js.native
  
  @JSImport("mini-html-webpack-plugin", "generateCSSReferences")
  @js.native
  def generateCSSReferences(): String = js.native
  @JSImport("mini-html-webpack-plugin", "generateCSSReferences")
  @js.native
  def generateCSSReferences(options: GenerateCSSReferencesOptions): String = js.native
  
  @JSImport("mini-html-webpack-plugin", "generateJSReferences")
  @js.native
  def generateJSReferences(): String = js.native
  @JSImport("mini-html-webpack-plugin", "generateJSReferences")
  @js.native
  def generateJSReferences(options: GenerateJSReferencesOptions): String = js.native
  
  type AttributesType = StringDictionary[String | Boolean]
  
  @js.native
  trait FilesOptions extends StObject {
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var publicPath: js.UndefOr[String] = js.native
  }
  object FilesOptions {
    
    @scala.inline
    def apply(): FilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilesOptions]
    }
    
    @scala.inline
    implicit class FilesOptionsMutableBuilder[Self <: FilesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
  
  @js.native
  trait GenerateAttributesOptions extends StObject {
    
    var attributes: js.UndefOr[AttributesType] = js.native
  }
  object GenerateAttributesOptions {
    
    @scala.inline
    def apply(): GenerateAttributesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateAttributesOptions]
    }
    
    @scala.inline
    implicit class GenerateAttributesOptionsMutableBuilder[Self <: GenerateAttributesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributesType): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
  
  type GenerateCSSReferencesOptions = GenerateAttributesOptions with FilesOptions
  
  type GenerateJSReferencesOptions = GenerateAttributesOptions with FilesOptions
  
  /**
    * A miniature version of html-webpack-plugin with only necessary features
    * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
    */
  @js.native
  trait MiniHtmlWebpackPlugin extends Plugin {
    
    def plugin(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
      callback: js.Function0[Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait PluginContext extends StObject {
    
    /** Optional, any additional HTML attached within <body> */
    var body: js.UndefOr[String] = js.native
    
    var css: js.UndefOr[js.Array[String]] = js.native
    
    var cssAttributes: js.UndefOr[AttributesType] = js.native
    
    /** Optional, any additional HTML attached within <head> */
    var head: js.UndefOr[String] = js.native
    
    /** Optional, defaults to `{ lang: 'en' }` */
    var htmlAttributes: js.UndefOr[AttributesType] = js.native
    
    var jsAttributes: js.UndefOr[AttributesType] = js.native
    
    @JSName("js")
    var js_ : js.UndefOr[js.Array[String]] = js.native
    
    var publicPath: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object PluginContext {
    
    @scala.inline
    def apply(): PluginContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginContext]
    }
    
    @scala.inline
    implicit class PluginContextMutableBuilder[Self <: PluginContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssAttributes(value: AttributesType): Self = StObject.set(x, "cssAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssAttributesUndefined: Self = StObject.set(x, "cssAttributes", js.undefined)
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: AttributesType): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setJsAttributes(value: AttributesType): Self = StObject.set(x, "jsAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsAttributesUndefined: Self = StObject.set(x, "jsAttributes", js.undefined)
      
      @scala.inline
      def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      @scala.inline
      def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait PluginOptions extends StObject {
    
    /** Optional, use this for choosing chunks to include to your page. */
    var chunks: js.UndefOr[js.Array[String]] = js.native
    
    var context: js.UndefOr[PluginContext] = js.native
    
    /** Optional, defaults to `index.html` */
    var filename: js.UndefOr[String] = js.native
    
    var publicPath: js.UndefOr[String] = js.native
    
    /** define a template function to generate your own code */
    var template: js.UndefOr[js.Function1[/* context */ PluginContext, String | js.Promise[String]]] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunks(value: js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      @scala.inline
      def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: PluginContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* context */ PluginContext => String | js.Promise[String]): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
