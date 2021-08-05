package typings.mustache

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.mustache.mustacheStrings.Ampersand
import typings.mustache.mustacheStrings.Equalssign
import typings.mustache.mustacheStrings.Exclamationmark
import typings.mustache.mustacheStrings.Greaterthansign
import typings.mustache.mustacheStrings.Numbersign
import typings.mustache.mustacheStrings.name
import typings.mustache.mustacheStrings.text
import typings.std.Array
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to render templates with `{{mustaches}}`.
  */
object mod extends Shortcut {
  
  @JSImport("mustache", JSImport.Namespace)
  @js.native
  val ^ : MustacheStatic = js.native
  
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mustache", "Context")
  @js.native
  class Context protected ()
    extends StObject
       with MustacheContext {
    /**
      * Initializes a new instance of the `MustacheContext` class.
      */
    def this(view: js.Any) = this()
    def this(view: js.Any, parentContext: MustacheContext) = this()
    
    /**
      * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
      *
      * @param name
      * The name to look up.
      */
    /* CompleteClass */
    override def lookup(name: String): js.Any = js.native
    
    /**
      * Creates a new context using the given view with this context as the parent.
      *
      * @param view
      * The view to create the new context with.
      */
    /* CompleteClass */
    override def push(view: js.Any): MustacheContext = js.native
    
    /* CompleteClass */
    var view: js.Any = js.native
  }
  
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mustache", "Scanner")
  @js.native
  class Scanner protected ()
    extends StObject
       with MustacheScanner {
    /**
      * Initializes a new instance of the `MustacheScanner` class.
      */
    def this(string: String) = this()
    
    /**
      * Returns `true` if the tail is empty (end of string).
      */
    /* CompleteClass */
    override def eos(): Boolean = js.native
    
    /* CompleteClass */
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
    /* CompleteClass */
    override def scan(re: RegExp): String = js.native
    
    /**
      * Skips all text until the given regular expression can be matched.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * Returns the skipped string, which is the entire tail if no match can be made.
      */
    /* CompleteClass */
    override def scanUntil(re: RegExp): String = js.native
    
    /* CompleteClass */
    var string: String = js.native
    
    /* CompleteClass */
    var tail: String = js.native
  }
  
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mustache", "Writer")
  @js.native
  /**
    * Initializes a new instance of the `MustacheWriter` class.
    */
  class Writer ()
    extends StObject
       with MustacheWriter
  
  type COMMENT = Exclamationmark
  
  type EQUAL = Equalssign
  
  type ESCAPED_VALUE = name
  
  type INVERTED = typings.mustache.mustacheStrings.^
  
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  trait MustacheContext extends StObject {
    
    /**
      * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
      *
      * @param name
      * The name to look up.
      */
    def lookup(name: String): js.Any
    
    var parentContext: js.UndefOr[MustacheContext] = js.undefined
    
    /**
      * Creates a new context using the given view with this context as the parent.
      *
      * @param view
      * The view to create the new context with.
      */
    def push(view: js.Any): MustacheContext
    
    var view: js.Any
  }
  object MustacheContext {
    
    inline def apply(lookup: String => js.Any, push: js.Any => MustacheContext, view: js.Any): MustacheContext = {
      val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), push = js.Any.fromFunction1(push), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[MustacheContext]
    }
    
    extension [Self <: MustacheContext](x: Self) {
      
      inline def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setParentContext(value: MustacheContext): Self = StObject.set(x, "parentContext", value.asInstanceOf[js.Any])
      
      inline def setParentContextUndefined: Self = StObject.set(x, "parentContext", js.undefined)
      
      inline def setPush(value: js.Any => MustacheContext): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  trait MustacheScanner extends StObject {
    
    /**
      * Returns `true` if the tail is empty (end of string).
      */
    def eos(): Boolean
    
    var pos: Double
    
    /**
      * Tries to match the given regular expression at the current position.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * The matched text if it can match, the empty string otherwise.
      */
    def scan(re: RegExp): String
    
    /**
      * Skips all text until the given regular expression can be matched.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * Returns the skipped string, which is the entire tail if no match can be made.
      */
    def scanUntil(re: RegExp): String
    
    var string: String
    
    var tail: String
  }
  object MustacheScanner {
    
    inline def apply(
      eos: () => Boolean,
      pos: Double,
      scan: RegExp => String,
      scanUntil: RegExp => String,
      string: String,
      tail: String
    ): MustacheScanner = {
      val __obj = js.Dynamic.literal(eos = js.Any.fromFunction0(eos), pos = pos.asInstanceOf[js.Any], scan = js.Any.fromFunction1(scan), scanUntil = js.Any.fromFunction1(scanUntil), string = string.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
      __obj.asInstanceOf[MustacheScanner]
    }
    
    extension [Self <: MustacheScanner](x: Self) {
      
      inline def setEos(value: () => Boolean): Self = StObject.set(x, "eos", js.Any.fromFunction0(value))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setScan(value: RegExp => String): Self = StObject.set(x, "scan", js.Any.fromFunction1(value))
      
      inline def setScanUntil(value: RegExp => String): Self = StObject.set(x, "scanUntil", js.Any.fromFunction1(value))
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setTail(value: String): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MustacheStatic extends StObject {
    
    /**
      * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
      */
    var Context: Instantiable2[/* view */ js.Any, /* parentContext */ js.UndefOr[MustacheContext], MustacheContext] = js.native
    
    /**
      * A simple string scanner that is used by the template parser to find tokens in template strings.
      */
    var Scanner: Instantiable1[/* string */ String, MustacheScanner] = js.native
    
    /**
      * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
      *
      * It also maintains a cache of templates to avoid the need to parse the same template twice.
      */
    var Writer: Instantiable0[MustacheWriter] = js.native
    
    /**
      * Clears all cached templates in this writer.
      */
    def clearCache(): Unit = js.native
    
    /**
      * Escapes HTML-characters.
      *
      * @param value
      * The string to escape.
      */
    def escape(value: String): String = js.native
    
    /**
      * The name of the module.
      */
    val name: String = js.native
    
    /**
      * Parses and caches the given template in the default writer and returns the array of tokens it contains.
      *
      * Doing this ahead of time avoids the need to parse templates on the fly as they are rendered.
      *
      * @param template
      * The template to parse.
      *
      * @param tags
      * The tags to use.
      */
    def parse(template: String): TemplateSpans = js.native
    def parse(template: String, tags: OpeningAndClosingTags): TemplateSpans = js.native
    
    /**
      * Renders the `template` with the given `view` and `partials` using the default writer.
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
      * @param tags
      * The tags to use.
      */
    def render(template: String, view: js.Any): String = js.native
    def render(template: String, view: js.Any, partials: Unit, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: js.Any, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: js.Any, partials: PartialsOrLookupFn, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: MustacheContext): String = js.native
    def render(template: String, view: MustacheContext, partials: Unit, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: MustacheContext, partials: PartialsOrLookupFn, tags: OpeningAndClosingTags): String = js.native
    
    /**
      * The default opening and closing tags used while parsing the templates.
      *
      * Different default tags can be overridden by setting this field. They will have effect on all subsequent
      * calls to `.render()` or `.parse()`, unless custom tags are given as arguments to those functions.
      *
      * Default value is `[ "{{", "}}" ]`.
      */
    var tags: OpeningAndClosingTags = js.native
    
    /**
      * Customise the template caching behaviour by either:
      *
      * disable it completely by setting it to `undefined`
      *
      * -- or --
      *
      * provide a custom cache strategy that satisfies the `TemplateCache` interface
      */
    var templateCache: js.UndefOr[TemplateCache] = js.native
    
    /**
      * The version of the module.
      */
    val version: String = js.native
  }
  
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  @js.native
  trait MustacheWriter extends StObject {
    
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
      */
    def escapedValue(token: js.Array[String], context: MustacheContext): String = js.native
    
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
      * Parses and caches the given `template` and returns the array of tokens that is generated from the parse.
      *
      * @param template
      * The template to parse.
      *
      * @param tags
      * The tags to use.
      */
    def parse(template: String): js.Any = js.native
    def parse(template: String, tags: OpeningAndClosingTags): js.Any = js.native
    
    /**
      * Renders a raw token.
      *
      * @param token
      * The token to render.
      */
    def rawValue(token: js.Array[String]): String = js.native
    
    /**
      * High-level method that is used to render the given `template` with the given `view`.
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
      * @param tags
      * The tags to use.
      */
    def render(template: String, view: js.Any): String = js.native
    def render(template: String, view: js.Any, partials: Unit, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: js.Any, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: js.Any, partials: PartialsOrLookupFn, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: MustacheContext): String = js.native
    def render(template: String, view: MustacheContext, partials: Unit, tags: OpeningAndClosingTags): String = js.native
    def render(template: String, view: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def render(template: String, view: MustacheContext, partials: PartialsOrLookupFn, tags: OpeningAndClosingTags): String = js.native
    
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
      */
    def renderInverted(token: js.Array[String], context: MustacheContext): String = js.native
    def renderInverted(token: js.Array[String], context: MustacheContext, partials: Unit, originalTemplate: String): String = js.native
    def renderInverted(token: js.Array[String], context: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def renderInverted(
      token: js.Array[String],
      context: MustacheContext,
      partials: PartialsOrLookupFn,
      originalTemplate: String
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
      * @param tags
      * The tags to use.
      */
    def renderPartial(token: js.Array[String], context: MustacheContext): String = js.native
    def renderPartial(token: js.Array[String], context: MustacheContext, partials: Unit, tags: OpeningAndClosingTags): String = js.native
    def renderPartial(token: js.Array[String], context: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def renderPartial(
      token: js.Array[String],
      context: MustacheContext,
      partials: PartialsOrLookupFn,
      tags: OpeningAndClosingTags
    ): String = js.native
    
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
      */
    def renderSection(token: js.Array[String], context: MustacheContext): String = js.native
    def renderSection(token: js.Array[String], context: MustacheContext, partials: Unit, originalTemplate: String): String = js.native
    def renderSection(token: js.Array[String], context: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def renderSection(
      token: js.Array[String],
      context: MustacheContext,
      partials: PartialsOrLookupFn,
      originalTemplate: String
    ): String = js.native
    
    /**
      * Low-level method that renders the given array of `tokens` using the given `context` and `partials`.
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
      */
    def renderTokens(tokens: js.Array[js.Array[String]], context: MustacheContext): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: MustacheContext,
      partials: Unit,
      originalTemplate: String
    ): String = js.native
    def renderTokens(tokens: js.Array[js.Array[String]], context: MustacheContext, partials: PartialsOrLookupFn): String = js.native
    def renderTokens(
      tokens: js.Array[js.Array[String]],
      context: MustacheContext,
      partials: PartialsOrLookupFn,
      originalTemplate: String
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
    def unescapedValue(token: js.Array[String], context: MustacheContext): String = js.native
  }
  
  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[String, String]
  
  type PARTIAL = Greaterthansign
  
  type PartialLookupFn = js.Function1[/* partialName */ String, js.UndefOr[String]]
  
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (Record[String, String]) | PartialLookupFn
  
  type RAW_VALUE = text
  
  type SECTION = Numbersign
  
  trait TemplateCache extends StObject {
    
    def clear(): Unit
    
    def get(cacheKey: String): js.UndefOr[String]
    
    def set(cacheKey: String, value: String): Unit
  }
  object TemplateCache {
    
    inline def apply(clear: () => Unit, get: String => js.UndefOr[String], set: (String, String) => Unit): TemplateCache = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[TemplateCache]
    }
    
    extension [Self <: TemplateCache](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type TemplateSpanType = RAW_VALUE | ESCAPED_VALUE | SECTION | UNESCAPED_VALUE | INVERTED | COMMENT | PARTIAL | EQUAL
  
  @js.native
  trait TemplateSpans
    extends StObject
       with Array[
          (js.Tuple4[TemplateSpanType, String, Double, Double]) | (js.Tuple6[TemplateSpanType, String, Double, Double, TemplateSpans, Double]) | (js.Tuple7[TemplateSpanType, String, Double, Double, String, Double, Boolean])
        ]
  
  type UNESCAPED_VALUE = Ampersand
  
  type _To = MustacheStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MustacheStatic = ^
}
