package typings.mjmlCore

import org.scalablytyped.runtime.StringDictionary
import typings.mjmlCore.anon.Attributes
import typings.mjmlCore.anon.Borders
import typings.mjmlCore.anon.Children
import typings.mjmlCore.anon.End
import typings.mjmlCore.anon.TypeofComponent
import typings.mjmlCore.mjmlCoreStrings.skip
import typings.mjmlCore.mjmlCoreStrings.soft
import typings.mjmlCore.mjmlCoreStrings.strict
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mjml-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): MJMLParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def default(input: String, options: MJMLParsingOptions): MJMLParseResults = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  inline def default(input: MJMLJsonObject): MJMLParseResults = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def default(input: MJMLJsonObject, options: MJMLParsingOptions): MJMLParseResults = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  
  /* note: abstract class */ @JSImport("mjml-core", "BodyComponent")
  @js.native
  open class BodyComponent protected () extends Component {
    def this(initialData: Any) = this()
    
    def getBoxWidths(): Borders = js.native
    
    /**
      * takes a style attribute and tries to parse it's value
      * ie. padding="1 2 3 4"
      * getShorthandAttrValue("padding","left") => 1
      */
    def getShorthandAttrValue(attribute: Any, direction: Any): Double = js.native
    
    def getShorthandBorderValue(direction: Any): Double = js.native
    
    def getStyles(): js.Object = js.native
    
    def htmlAttributes(attributes: Any): Any = js.native
    
    def renderChildren(): String = js.native
    def renderChildren(children: js.Array[Any]): String = js.native
    def renderChildren(children: js.Array[Any], options: Attributes): String = js.native
    def renderChildren(children: Unit, options: Attributes): String = js.native
    
    def styles(styles: Any): Any = js.native
  }
  
  /* note: abstract class */ @JSImport("mjml-core", "Component")
  @js.native
  open class Component protected () extends StObject {
    def this(initialData: Any) = this()
    
    var attributes: Record[String, String] = js.native
    
    /**
      * Use if you need custom styles for every instance of a component
      *
      * @returns string css style string
      */
    def componentHeadStyle(breakpoint: Double): String = js.native
    
    var context: Any = js.native
    
    def getAttribute(name: Any): Any = js.native
    
    def getChildContext(): Any = js.native
    
    def getContent(): Any = js.native
    
    /**
      * Use if you want the CSS to be registered once
      *
      * @returns string css style string
      */
    def headStyle(breakpoint: Double): String = js.native
    
    var props: Children = js.native
    
    /**
      * Expected to return an html string
      * @see renderMJML for returning an mjml string
      */
    def render(): String = js.native
    
    /**
      * If you want to return mjml from a component, it needs to be processed first, ie.
      *
      * render() {
      *   return this.renderMJML('<mj-text>hello world</mj-text>');
      * }
      */
    def renderMJML(mjml: String): String = js.native
    def renderMJML(mjml: String, options: js.Object): String = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("mjml-core", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mjml-core", "Component.defaultAttributes")
    @js.native
    def defaultAttributes: StringDictionary[js.UndefOr[String]] = js.native
    inline def defaultAttributes_=(x: StringDictionary[js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAttributes")(x.asInstanceOf[js.Any])
    
    inline def getTagName(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagName")().asInstanceOf[Any]
    
    inline def isRawElement(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRawElement")().asInstanceOf[Boolean]
  }
  
  /* note: abstract class */ @JSImport("mjml-core", "HeadComponent")
  @js.native
  open class HeadComponent protected () extends Component {
    def this(initialData: Any) = this()
    
    def handlerChildren(): Any = js.native
  }
  
  inline def registerComponent(ComponentClass: TypeofComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def suffixCssClasses(classes: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("suffixCssClasses")(classes.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mjmlCore.mod.MJMLJsonWithChildren
    - typings.mjmlCore.mod.MJMLJsonWithContent
    - typings.mjmlCore.mod.MJMLJsonSelfClosingTag
  */
  trait MJMLJsonObject extends StObject
  object MJMLJsonObject {
    
    inline def MJMLJsonSelfClosingTag(attributes: js.Object, tagName: String): typings.mjmlCore.mod.MJMLJsonSelfClosingTag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mjmlCore.mod.MJMLJsonSelfClosingTag]
    }
    
    inline def MJMLJsonWithChildren(attributes: js.Object, children: js.Array[MJMLJsonObject], tagName: String): typings.mjmlCore.mod.MJMLJsonWithChildren = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mjmlCore.mod.MJMLJsonWithChildren]
    }
    
    inline def MJMLJsonWithContent(attributes: js.Object, content: String, tagName: String): typings.mjmlCore.mod.MJMLJsonWithContent = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mjmlCore.mod.MJMLJsonWithContent]
    }
  }
  
  trait MJMLJsonSelfClosingTag
    extends StObject
       with MJMLJsonObject {
    
    var attributes: js.Object
    
    var tagName: String
  }
  object MJMLJsonSelfClosingTag {
    
    inline def apply(attributes: js.Object, tagName: String): MJMLJsonSelfClosingTag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLJsonSelfClosingTag]
    }
    
    extension [Self <: MJMLJsonSelfClosingTag](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLJsonWithChildren
    extends StObject
       with MJMLJsonObject {
    
    var attributes: js.Object
    
    var children: js.Array[MJMLJsonObject]
    
    var tagName: String
  }
  object MJMLJsonWithChildren {
    
    inline def apply(attributes: js.Object, children: js.Array[MJMLJsonObject], tagName: String): MJMLJsonWithChildren = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLJsonWithChildren]
    }
    
    extension [Self <: MJMLJsonWithChildren](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[MJMLJsonObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: MJMLJsonObject*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLJsonWithContent
    extends StObject
       with MJMLJsonObject {
    
    var attributes: js.Object
    
    var content: String
    
    var tagName: String
  }
  object MJMLJsonWithContent {
    
    inline def apply(attributes: js.Object, content: String, tagName: String): MJMLJsonWithContent = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLJsonWithContent]
    }
    
    extension [Self <: MJMLJsonWithContent](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
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
    
    var json: MJMLJsonObject
  }
  object MJMLParseResults {
    
    inline def apply(errors: js.Array[MJMLParseError], html: String, json: MJMLJsonObject): MJMLParseResults = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLParseResults]
    }
    
    extension [Self <: MJMLParseResults](x: Self) {
      
      inline def setErrors(value: js.Array[MJMLParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: MJMLParseError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setJson(value: MJMLJsonObject): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait MJMLParsingOptions extends StObject {
    
    var actualPath: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated use js-beautify directly after processing the MJML
      *
      * Option to beautify the HTML output
      * default: false
      */
    var beautify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Full path of the specified file to use when resolving paths from mj-include components
      * default: '.'
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * Default fonts imported in the HTML rendered by HTML
      * ie. { 'Open Sans': 'https://fonts.googleapis.com/css?family=Open+Sans:300,400,500,700' }
      *
      * default: @see https://github.com/mjmlio/mjml/blob/master/packages/mjml-core/src/index.js
      */
    var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * undocumented
      * ignore mj-include elements
      * default: false
      */
    var ignoreIncludes: js.UndefOr[Any] = js.undefined
    
    var juiceOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * optional setting when inlining css, see mjml-cli documentation for more info
      */
    var juicePreserveTags: js.UndefOr[StringDictionary[End]] = js.undefined
    
    /**
      * Option to keep comments in the HTML output
      * default: true
      */
    var keepComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated use html-minifier directly after processing the MJML
      *
      * Option to minify the HTML output
      *
      * default: false
      */
    var minify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated @see minify
      *
      * Options for html minifier, see mjml-cli documentation for more info
      * Passed directly to html-minifier as options
      *
      * default: @see htmlMinify usage in mjml-core/src/index.js
      */
    var minifyOptions: js.UndefOr[MJMLMinifyOptions] = js.undefined
    
    /**
      * The path or directory of the .mjmlconfig file
      * default: process.cwd()
      */
    var mjmlConfigPath: js.UndefOr[String] = js.undefined
    
    /**
      * see mjml-parser-xml
      */
    var preprocessors: js.UndefOr[js.Array[js.Function1[/* xml */ String, String]]] = js.undefined
    
    /**
      * undocumented
      * a function returning html skeleton
      * default: see mjml-core/src/helpers/skeleton.js
      */
    var skeleton: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    /**
      * Use the config attribute defined in the .mjmlconfig file.
      * The config passed into mjml2html overrides the .mjmlconfig.
      * default: false
      */
    var useMjmlConfigOptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How to validate your MJML
      *
      * skip: your document is rendered without going through validation
      * soft: your document is going through validation and is rendered, even if it has errors
      * strict: your document is going through validation and is not rendered if it has any error
      *
      * default: soft
      */
    var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
  }
  object MJMLParsingOptions {
    
    inline def apply(): MJMLParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MJMLParsingOptions]
    }
    
    extension [Self <: MJMLParsingOptions](x: Self) {
      
      inline def setActualPath(value: String): Self = StObject.set(x, "actualPath", value.asInstanceOf[js.Any])
      
      inline def setActualPathUndefined: Self = StObject.set(x, "actualPath", js.undefined)
      
      inline def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
      
      inline def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFonts(value: StringDictionary[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setIgnoreIncludes(value: Any): Self = StObject.set(x, "ignoreIncludes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIncludesUndefined: Self = StObject.set(x, "ignoreIncludes", js.undefined)
      
      inline def setJuiceOptions(value: Any): Self = StObject.set(x, "juiceOptions", value.asInstanceOf[js.Any])
      
      inline def setJuiceOptionsUndefined: Self = StObject.set(x, "juiceOptions", js.undefined)
      
      inline def setJuicePreserveTags(value: StringDictionary[End]): Self = StObject.set(x, "juicePreserveTags", value.asInstanceOf[js.Any])
      
      inline def setJuicePreserveTagsUndefined: Self = StObject.set(x, "juicePreserveTags", js.undefined)
      
      inline def setKeepComments(value: Boolean): Self = StObject.set(x, "keepComments", value.asInstanceOf[js.Any])
      
      inline def setKeepCommentsUndefined: Self = StObject.set(x, "keepComments", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyOptions(value: MJMLMinifyOptions): Self = StObject.set(x, "minifyOptions", value.asInstanceOf[js.Any])
      
      inline def setMinifyOptionsUndefined: Self = StObject.set(x, "minifyOptions", js.undefined)
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setMjmlConfigPath(value: String): Self = StObject.set(x, "mjmlConfigPath", value.asInstanceOf[js.Any])
      
      inline def setMjmlConfigPathUndefined: Self = StObject.set(x, "mjmlConfigPath", js.undefined)
      
      inline def setPreprocessors(value: js.Array[js.Function1[/* xml */ String, String]]): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
      
      inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
      
      inline def setPreprocessorsVarargs(value: (js.Function1[/* xml */ String, String])*): Self = StObject.set(x, "preprocessors", js.Array(value*))
      
      inline def setSkeleton(value: String | js.Function0[String]): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
      
      inline def setSkeletonFunction0(value: () => String): Self = StObject.set(x, "skeleton", js.Any.fromFunction0(value))
      
      inline def setSkeletonUndefined: Self = StObject.set(x, "skeleton", js.undefined)
      
      inline def setUseMjmlConfigOptions(value: Boolean): Self = StObject.set(x, "useMjmlConfigOptions", value.asInstanceOf[js.Any])
      
      inline def setUseMjmlConfigOptionsUndefined: Self = StObject.set(x, "useMjmlConfigOptions", js.undefined)
      
      inline def setValidationLevel(value: strict | soft | skip): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
      
      inline def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
    }
  }
}
