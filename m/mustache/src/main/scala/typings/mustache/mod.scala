package typings.mustache

import typings.mustache.mustacheStrings.Ampersand
import typings.mustache.mustacheStrings.Equalssign
import typings.mustache.mustacheStrings.Exclamationmark
import typings.mustache.mustacheStrings.Greaterthansign
import typings.mustache.mustacheStrings.Numbersign
import typings.mustache.mustacheStrings.text
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mustache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mustache", "Context")
  @js.native
  open class Context protected () extends StObject {
    /**
      * Initializes a new instance of the {@link Context `Context`} class.
      */
    def this(view: Any) = this()
    def this(view: Any, parentContext: Context) = this()
    
    /**
      * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
      *
      * @param name
      * The name to look up.
      */
    def lookup(name: String): Any = js.native
    
    var parent: js.UndefOr[Context] = js.native
    
    /**
      * Creates a new context using the given view with this context as the parent.
      *
      * @param view
      * The view to create the new context with.
      */
    def push(view: Any): Context = js.native
    
    var view: Any = js.native
  }
  
  @JSImport("mustache", "Scanner")
  @js.native
  open class Scanner protected () extends StObject {
    /**
      * Initializes a new instance of the {@link Scanner `Scanner`} class.
      */
    def this(string: String) = this()
    
    /**
      * Returns `true` if the tail is empty (end of string).
      */
    def eos(): Boolean = js.native
    
    var pos: Double = js.native
    
    /**
      * Tries to match the given regular expression at the current position.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * The matched text if it can match, the empty string otherwise.
      */
    def scan(re: js.RegExp): String = js.native
    
    /**
      * Skips all text until the given regular expression can be matched.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * Returns the skipped string, which is the entire tail if no match can be made.
      */
    def scanUntil(re: js.RegExp): String = js.native
    
    var string: String = js.native
    
    var tail: String = js.native
  }
  
  @JSImport("mustache", "Writer")
  @js.native
  /**
    * Initializes a new instance of the {@link Writer `Writer`} class.
    */
  open class Writer () extends StObject {
    
    /**
      * Clears all cached templates in this writer.
      */
    def clearCache(): Unit = js.native
    
    /**
      * Renders an escaped value.
      *
      * @param token
      * The token to render.
      *
      * @param context
      * The context to use for rendering the token.
      *
      * @param config
      * The options for the rendering process.
      */
    def escapedValue(token: js.Array[String], context: Context): String = js.native
    def escapedValue(token: js.Array[String], context: Context, config: RenderOptions): String = js.native
    
    /**
      * Adds indentation to each line of the given partial.
      *
      * @param partial
      * The partial to indent.
      *
      * @param indentation
      * String containing a combination of spaces and tabs to use as indentation.
      *
      * @param lineHasNonSpace
      * Whether to indent lines that are empty.
      */
    def indentPartial(partial: String, indentation: String, lineHasNonSpace: Boolean): String = js.native
    
    /**
      * Parses and caches the given {@link template `template`} and returns the array of tokens that is generated from the parse.
      *
      * @param template
      * The template to parse.
      *
      * @param tags
      * The tags to use.
      */
    def parse(template: String): Any = js.native
    def parse(template: String, tags: OpeningAndClosingTags): Any = js.native
    
    /**
      * Renders a raw token.
      *
      * @param token
      * The token to render.
      */
    def rawValue(token: js.Array[String]): String = js.native
    
    /**
      * High-level method that is used to render the given {@link template `template`} with the given {@link view `view`}.
      *
      * @param template
      * The template to render.
      *
      * @param view
      * The view to render the template with.
      *
      * @param partials
      * Either an object that contains the names and templates of partials that are used in a template
      *
      * -- or --
      *
      * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
      *
      * @param config
      * The options for the rendering process.
      */
    def render(template: String, view: Any): String = js.native
    def render(template: String, view: Any, partials: Unit, config: OpeningAndClosingTags): String = js.native
    def render(template: String, view: Any, partials: Unit, config: RenderOptions): String = js.native
    def render(template: String, view: Any, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: Any, partials: PartialsOrLookupFn, config: OpeningAndClosingTags): String = js.native
    def render(template: String, view: Any, partials: PartialsOrLookupFn, config: RenderOptions): String = js.native
    def render(template: String, view: Context): String = js.native
    def render(template: String, view: Context, partials: Unit, config: OpeningAndClosingTags): String = js.native
    def render(template: String, view: Context, partials: Unit, config: RenderOptions): String = js.native
    def render(template: String, view: Context, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: Context, partials: PartialsOrLookupFn, config: OpeningAndClosingTags): String = js.native
    def render(template: String, view: Context, partials: PartialsOrLookupFn, config: RenderOptions): String = js.native
    
    /**
      * Renders an inverted section block.
      *
      * @param token
      * The token to render.
      *
      * @param context
      * The context to use for rendering the token.
      *
      * @param partials
      * The partials to use for rendering the token.
      *
      * @param originalTemplate
      * An object used to extract the portion of the original template that was contained in a higher-order section.
      *
      * @param config
      * The options for the rendering process.
      */
    def renderInverted(token: js.Array[String], context: Context): String = js.native
    def renderInverted(token: js.Array[String], context: Context, partials: Unit, originalTemplate: String): String = js.native
    def renderInverted(
      token: js.Array[String],
      context: Context,
      partials: Unit,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderInverted(
      token: js.Array[String],
      context: Context,
      partials: Unit,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    def renderInverted(token: js.Array[String], context: Context, partials: PartialsOrLookupFn): String = js.native
    def renderInverted(token: js.Array[String], context: Context, partials: PartialsOrLookupFn, originalTemplate: String): String = js.native
    def renderInverted(
      token: js.Array[String],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderInverted(
      token: js.Array[String],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    
    /**
      * Renders a partial.
      *
      * @param token
      * The token to render.
      *
      * @param context
      * The context to use for rendering the token.
      *
      * @param partials
      * The partials to use for rendering the token.
      *
      * @param config
      * The options for the rendering process.
      */
    def renderPartial(token: js.Array[String], context: Context): String = js.native
    def renderPartial(token: js.Array[String], context: Context, partials: Unit, config: OpeningAndClosingTags): String = js.native
    def renderPartial(token: js.Array[String], context: Context, partials: Unit, config: RenderOptions): String = js.native
    def renderPartial(token: js.Array[String], context: Context, partials: PartialsOrLookupFn): String = js.native
    def renderPartial(
      token: js.Array[String],
      context: Context,
      partials: PartialsOrLookupFn,
      config: OpeningAndClosingTags
    ): String = js.native
    def renderPartial(token: js.Array[String], context: Context, partials: PartialsOrLookupFn, config: RenderOptions): String = js.native
    
    /**
      * Renders a section block.
      *
      * @param token
      * The token to render.
      *
      * @param context
      * The context to use for rendering the token.
      *
      * @param partials
      * The partials to use for rendering the token.
      *
      * @param originalTemplate
      * An object used to extract the portion of the original template that was contained in a higher-order section.
      *
      * @param config
      * The options for the rendering process.
      */
    def renderSection(token: js.Array[String], context: Context): String = js.native
    def renderSection(token: js.Array[String], context: Context, partials: Unit, originalTemplate: String): String = js.native
    def renderSection(
      token: js.Array[String],
      context: Context,
      partials: Unit,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderSection(
      token: js.Array[String],
      context: Context,
      partials: Unit,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    def renderSection(token: js.Array[String], context: Context, partials: PartialsOrLookupFn): String = js.native
    def renderSection(token: js.Array[String], context: Context, partials: PartialsOrLookupFn, originalTemplate: String): String = js.native
    def renderSection(
      token: js.Array[String],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderSection(
      token: js.Array[String],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    
    /**
      * Low-level method that renders the given array of {@link tokens `tokens`} using the given {@link context `context`} and {@link partials `partials`}.
      *
      * @param tokens
      * The tokens to render.
      *
      * @param context
      * The context to use for rendering the tokens.
      *
      * @param partials
      * The partials to use for rendering the tokens.
      *
      * @param originalTemplate
      * An object used to extract the portion of the original template that was contained in a higher-order section.
      *
      * If the template doesn't use higher-order sections, this argument may be omitted.
      *
      * @param config
      * The options for the rendering process.
      */
    def renderTokens(tokens: js.Array[js.Array[String]], context: Context): String = js.native
    def renderTokens(tokens: js.Array[js.Array[String]], context: Context, partials: Unit, originalTemplate: String): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: Context,
      partials: Unit,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: Context,
      partials: Unit,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    def renderTokens(tokens: js.Array[js.Array[String]], context: Context, partials: PartialsOrLookupFn): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: String
    ): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: String,
      config: RenderOptions
    ): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: Context,
      partials: PartialsOrLookupFn,
      originalTemplate: Unit,
      config: RenderOptions
    ): String = js.native
    
    /**
      * Renders an unescaped value.
      *
      * @param token
      * The token to render.
      *
      * @param context
      * The context to use for rendering the token.
      */
    def unescapedValue(token: js.Array[String], context: Context): String = js.native
  }
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  @JSImport("mustache", "escape")
  @js.native
  val escape: EscapeFunction = js.native
  
  @JSImport("mustache", "name")
  @js.native
  val name: String = js.native
  
  inline def parse(template: String): TemplateSpans = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateSpans]
  inline def parse(template: String, tags: OpeningAndClosingTags): TemplateSpans = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[TemplateSpans]
  
  inline def render(template: String, view: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Any, partials: Unit, tagsOrOptions: OpeningAndClosingTags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Any, partials: Unit, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Any, partials: PartialsOrLookupFn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Any, partials: PartialsOrLookupFn, tagsOrOptions: OpeningAndClosingTags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Any, partials: PartialsOrLookupFn, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Context, partials: Unit, tagsOrOptions: OpeningAndClosingTags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Context, partials: Unit, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Context, partials: PartialsOrLookupFn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(
    template: String,
    view: Context,
    partials: PartialsOrLookupFn,
    tagsOrOptions: OpeningAndClosingTags
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(template: String, view: Context, partials: PartialsOrLookupFn, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("mustache", "tags")
  @js.native
  def tags: OpeningAndClosingTags = js.native
  inline def tags_=(x: OpeningAndClosingTags): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
  
  @JSImport("mustache", "templateCache")
  @js.native
  def templateCache: js.UndefOr[TemplateCache_] = js.native
  inline def templateCache_=(x: js.UndefOr[TemplateCache_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templateCache")(x.asInstanceOf[js.Any])
  
  @JSImport("mustache", "version")
  @js.native
  val version: String = js.native
  
  type COMMENT = Exclamationmark
  
  type EQUAL = Equalssign
  
  type ESCAPED_VALUE = typings.mustache.mustacheStrings.name
  
  type EscapeFunction = js.Function1[/* value */ Any, String]
  
  type INVERTED = typings.mustache.mustacheStrings.^
  
  type OpeningAndClosingTags = js.Tuple2[String, String]
  
  type PARTIAL = Greaterthansign
  
  type PartialLookupFn = js.Function1[/* partialName */ String, js.UndefOr[String]]
  
  type PartialsOrLookupFn = (Record[String, String]) | PartialLookupFn
  
  type RAW_VALUE = text
  
  trait RenderOptions extends StObject {
    
    var escape: js.UndefOr[EscapeFunction] = js.undefined
    
    var tags: js.UndefOr[OpeningAndClosingTags] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setEscape(value: /* value */ Any => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setTags(value: OpeningAndClosingTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  type SECTION = Numbersign
  
  trait TemplateCache_ extends StObject {
    
    def clear(): Unit
    
    def get(cacheKey: String): js.UndefOr[String]
    
    def set(cacheKey: String, value: String): Unit
  }
  object TemplateCache_ {
    
    inline def apply(clear: () => Unit, get: String => js.UndefOr[String], set: (String, String) => Unit): TemplateCache_ = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[TemplateCache_]
    }
    
    extension [Self <: TemplateCache_](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type TemplateSpanType = RAW_VALUE | ESCAPED_VALUE | SECTION | UNESCAPED_VALUE | INVERTED | COMMENT | PARTIAL | EQUAL
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TemplateSpans = std.Array<[mustache.mustache.TemplateSpanType, string, number, number] | [mustache.mustache.TemplateSpanType, string, number, number, mustache.mustache.TemplateSpans, number] | [mustache.mustache.TemplateSpanType, string, number, number, string, number, boolean]>
  }}}
  to avoid circular code involving: 
  - mustache.mustache.TemplateSpans
  */
  @js.native
  trait TemplateSpans
    extends StObject
       with Array[
          (js.Tuple4[TemplateSpanType, String, Double, Double]) | (js.Tuple6[TemplateSpanType, String, Double, Double, TemplateSpans, Double]) | (js.Tuple7[TemplateSpanType, String, Double, Double, String, Double, Boolean])
        ]
  
  type UNESCAPED_VALUE = Ampersand
}
