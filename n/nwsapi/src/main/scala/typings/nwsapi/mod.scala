package typings.nwsapi

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.nwsapi.anon.Callback
import typings.nwsapi.anon.CallbackExpression
import typings.nwsapi.anon.Dictoperator
import typings.nwsapi.anon.Expression
import typings.nwsapi.anon.Match
import typings.nwsapi.anon.PartialConfig
import typings.nwsapi.mod.MatcherMode.MATCH
import typings.nwsapi.mod.MatcherMode.SELECT
import typings.nwsapi.mod.MatcherMode.USE_COLLECTION_ITEM
import typings.nwsapi.nwsapiInts.`-1`
import typings.nwsapi.nwsapiInts.`2`
import typings.nwsapi.nwsapiStrings.`false`
import typings.nwsapi.nwsapiStrings.`true`
import typings.std.ArrayLike
import typings.std.DOMException
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.Node
import typings.std.NodeListOf
import typings.std.Parameters
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(global: Global): NWSAPI = ^.asInstanceOf[js.Dynamic].apply(global.asInstanceOf[js.Any]).asInstanceOf[NWSAPI]
  
  @JSImport("nwsapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AttributeOperator extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: `true` | `false`
  }
  object AttributeOperator {
    
    inline def apply(p1: String, p2: String, p3: `true` | `false`): AttributeOperator = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperator]
    }
    
    extension [Self <: AttributeOperator](x: Self) {
      
      inline def setP1(value: String): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: `true` | `false`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  trait CFG extends StObject {
    
    val combinators: String
    
    val operators: String
  }
  object CFG {
    
    inline def apply(combinators: String, operators: String): CFG = {
      val __obj = js.Dynamic.literal(combinators = combinators.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any])
      __obj.asInstanceOf[CFG]
    }
    
    extension [Self <: CFG](x: Self) {
      
      inline def setCombinators(value: String): Self = StObject.set(x, "combinators", value.asInstanceOf[js.Any])
      
      inline def setOperators(value: String): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config
    extends StObject
       with /* option */ StringDictionary[Boolean] {
    
    /**
      * Whether `Dom.byId` returns all elements with the matching `[id]`, or just the first.
      *
      * @default true
      */
    val IDS_DUPES: Boolean
    
    /**
      * Whether errors should be logged when `Config.VERBOSITY` is `false`.
      *
      * @default true
      */
    val LOGERRORS: Boolean
    
    /**
      * Whether tag names should always be compared case-insensitively.
      *
      * @default true
      */
    val MIXEDCASE: Boolean
    
    /**
      * Whether errors cause a `DOMException` to be thrown instead of being silently ignored.
      *
      * @default true
      */
    val VERBOSITY: Boolean
  }
  object Config {
    
    inline def apply(IDS_DUPES: Boolean, LOGERRORS: Boolean, MIXEDCASE: Boolean, VERBOSITY: Boolean): Config = {
      val __obj = js.Dynamic.literal(IDS_DUPES = IDS_DUPES.asInstanceOf[js.Any], LOGERRORS = LOGERRORS.asInstanceOf[js.Any], MIXEDCASE = MIXEDCASE.asInstanceOf[js.Any], VERBOSITY = VERBOSITY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setIDS_DUPES(value: Boolean): Self = StObject.set(x, "IDS_DUPES", value.asInstanceOf[js.Any])
      
      inline def setLOGERRORS(value: Boolean): Self = StObject.set(x, "LOGERRORS", value.asInstanceOf[js.Any])
      
      inline def setMIXEDCASE(value: Boolean): Self = StObject.set(x, "MIXEDCASE", value.asInstanceOf[js.Any])
      
      inline def setVERBOSITY(value: Boolean): Self = StObject.set(x, "VERBOSITY", value.asInstanceOf[js.Any])
    }
  }
  
  type ContextNode = Document | DocumentFragment | Element
  
  @js.native
  trait CustomSelector extends StObject {
    
    def Callback(`match`: RegExpMatchArray, source: String, mode: MatcherMode): CustomSelectorResult = js.native
    def Callback(
      `match`: RegExpMatchArray,
      source: String,
      mode: MatcherMode,
      callback: js.Function1[/* element */ Element, Any]
    ): CustomSelectorResult = js.native
    
    val Expression: String | js.RegExp | Match = js.native
  }
  
  trait CustomSelectorResult extends StObject {
    
    /** Used to return a new `match` array. */
    val `match`: js.UndefOr[RegExpMatchArray] = js.undefined
    
    /**
      * Used to declare new variables.
      *
      * @example
      *  ```js
      *  return {
      *      modvar: `\
      *          foo,
      *          bar = "baz",
      *          biz = 123
      *      `,
      *  };
      *  ```
      */
    val modvar: js.UndefOr[String] = js.undefined
    
    /** The ECMAScript source string. */
    val source: String
    
    /** Whether the selector compilation was successful. */
    val status: Boolean
  }
  object CustomSelectorResult {
    
    inline def apply(source: String, status: Boolean): CustomSelectorResult = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSelectorResult]
    }
    
    extension [Self <: CustomSelectorResult](x: Self) {
      
      inline def setMatch(value: RegExpMatchArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setModvar(value: String): Self = StObject.set(x, "modvar", value.asInstanceOf[js.Any])
      
      inline def setModvarUndefined: Self = StObject.set(x, "modvar", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global extends StObject {
    
    val DOMException: Instantiable2[
        /* message */ js.UndefOr[String], 
        /* name */ js.UndefOr[String], 
        typings.std.DOMException
      ]
    
    val document: Document
  }
  object Global {
    
    inline def apply(
      DOMException: Instantiable2[/* message */ js.UndefOr[String], /* name */ js.UndefOr[String], DOMException],
      document: Document
    ): Global = {
      val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setDOMException(
        value: Instantiable2[/* message */ js.UndefOr[String], /* name */ js.UndefOr[String], DOMException]
      ): Self = StObject.set(x, "DOMException", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
  
  type MatchLambda[T /* <: Element */] = js.Function4[
    /* element */ T, 
    /* callback */ js.UndefOr[js.Function1[/* element */ T, Unit]], 
    /* context */ ContextNode, 
    /* results */ ArrayLike[Element], 
    ArrayLike[Element]
  ]
  
  trait MatchResolver extends StObject {
    
    var factory: js.Array[MatchLambda[Element]]
  }
  object MatchResolver {
    
    inline def apply(factory: js.Array[MatchLambda[Element]]): MatchResolver = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResolver]
    }
    
    extension [Self <: MatchResolver](x: Self) {
      
      inline def setFactory(value: js.Array[MatchLambda[Element]]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryVarargs(value: MatchLambda[Element]*): Self = StObject.set(x, "factory", js.Array(value*))
    }
  }
  
  // tslint:enable: no-redundant-jsdoc-2
  object MatcherMode {
    
    /**
      * Used to check whether an element matches this selector.
      *
      * | variable |  type     |  relation to `e`
      * | :------: |  -------  | :---------------:
      * |   `c`    | `Element` |     `c === e`
      */
    type MATCH = typings.nwsapi.nwsapiBooleans.`false`
    
    /**
      * Used to select elements.
      *
      * | variable |  type                |  relation to `e`
      * | :------: |  ------------------  | :--------------:
      * |   `c`    | `ArrayLike<Element>` |   `c[i] === e`
      */
    type SELECT = typings.nwsapi.nwsapiBooleans.`true`
    
    /**
      * Used to select elements.
      *
      *
      * | variable |  type                          |  relation to `e`
      * | :------: |  ----------------------------  | :---------------:
      * |   `c`    | `{ item(i: number): Element }` | `c.item(i) === e`
      */
    type USE_COLLECTION_ITEM = Null
  }
  // tslint:disable: no-redundant-jsdoc-2
  /**
    * @enum
    * The `MatcherMode` type should be described using a **TypeScript** enum,\
    * but **TypeScript** doesn't treat `true`, `false` or `null`
    * as constant expressions in enum initializers.
    */
  type MatcherMode = SELECT | MATCH | USE_COLLECTION_ITEM
  
  @js.native
  trait NWSAPI extends StObject {
    
    // exported compiler macros
    val CFG: typings.nwsapi.mod.CFG = js.native
    
    /** special handling configuration flags */
    val Config: typings.nwsapi.mod.Config = js.native
    
    val M_BODY: String = js.native
    
    val M_TEST: String = js.native
    
    val Operators: Dictoperator = js.native
    
    val S_BODY: String = js.native
    
    val S_TEST: String = js.native
    
    val Selectors: StringDictionary[CustomSelector] = js.native
    
    /** passed to resolvers as the `s` variable */
    val Snapshot: typings.nwsapi.mod.Snapshot = js.native
    
    val Version: String = js.native
    
    /** context agnostic `getElementsByTagName` */
    def byClass(className: String, context: ContextNode): js.Array[Element] = js.native
    
    /** context agnostic `getElementById` */
    def byId(id: String, context: ContextNode): js.Array[Element] = js.native
    
    // exported engine methods
    /** context agnostic `getElementsByClassName` */
    def byTag[T /* <: String */](tag: T, context: ContextNode): js.Array[ResolveElementType[T]] = js.native
    
    /**
      * Equivalent of w3c `closest` method.
      */
    def closest[S /* <: String */](selector: S, element: Element): ResolveElementType[S] | Null = js.native
    def closest[S /* <: String */](selector: S, element: Element, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    
    /**
      * Compile groups or single selector strings into
      * executable functions for matching or selecting.
      */
    def compile[E /* <: Element */, M /* <: MatcherMode */](selector: String, mode: M): /* import warning: importer.ImportType#apply Failed type conversion: M extends nwsapi.nwsapi.MatcherMode.MATCH ? nwsapi.nwsapi.MatchLambda<E> : M extends nwsapi.nwsapi.MatcherMode.SELECT | nwsapi.nwsapi.MatcherMode.USE_COLLECTION_ITEM ? nwsapi.nwsapi.SelectLambda<E> : never */ js.Any = js.native
    def compile[E /* <: Element */, M /* <: MatcherMode */](selector: String, mode: M, callback: js.Function1[/* element */ E, Unit]): /* import warning: importer.ImportType#apply Failed type conversion: M extends nwsapi.nwsapi.MatcherMode.MATCH ? nwsapi.nwsapi.MatchLambda<E> : M extends nwsapi.nwsapi.MatcherMode.SELECT | nwsapi.nwsapi.MatcherMode.USE_COLLECTION_ITEM ? nwsapi.nwsapi.SelectLambda<E> : never */ js.Any = js.native
    
    /**
      * Returns the configuration object.
      *
      * @return The configuration object.
      */
    def configure(): typings.nwsapi.mod.Config = js.native
    /**
      * Returns the current value of the option.
      *
      * @param option The configuration option.
      * @return The current value of the option.
      */
    def configure(option: String): Boolean = js.native
    /**
      * Configure the engine to use special handling.
      *
      * @param options The new options to set.
      * @param clear Whether to clear the lambda cache.
      */
    def configure(options: PartialConfig): typings.nwsapi.nwsapiBooleans.`true` = js.native
    def configure(options: PartialConfig, clear: Boolean): typings.nwsapi.nwsapiBooleans.`true` = js.native
    
    /**
      * centralized error and exceptions handling
      *
      * @param constructor The error constructor to use, defaults to `DOMException` with a `name` of `"SyntaxError"`.
      */
    def emit(message: String): Unit = js.native
    def emit(message: String, constructor: Instantiable1[/* message */ String, js.Error]): Unit = js.native
    
    /**
      * Equivalent of w3c `querySelector` method.
      *
      * @param callback
      * The callback that gets invoked for the first element that matches `selector`.
      */
    def first[S /* <: String */](selector: S): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: Null, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: Unit, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: ContextNode): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](
      selector: S,
      context: ContextNode,
      callback: js.Function1[/* element */ ResolveElementType[S], Unit]
    ): ResolveElementType[S] | Null = js.native
    
    /** overrides QSA methods (only for browsers) */
    def install(): Unit = js.native
    def install(all: Boolean): Unit = js.native
    
    /**
      * Equivalent of w3c `matches` method.
      *
      * @param element The element to check whether it matches the `selector`.
      * @param callback The callback that gets invoked if `element` matches the `selector`.
      */
    def `match`[S /* <: String */](selector: S, element: Element): /* is nwsapi.nwsapi.ResolveElementType<S> */ Boolean = js.native
    def `match`[S /* <: String */](selector: S, element: Element, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): /* is nwsapi.nwsapi.ResolveElementType<S> */ Boolean = js.native
    
    // exported cache objects
    val matchLambdas: StringDictionary[MatchLambda[Element]] = js.native
    
    val matchResolvers: StringDictionary[MatchResolver] = js.native
    
    /** register a new selector combinator symbol and its related function resolver */
    def registerCombinator(combinator: String, resolver: js.Function1[/* match */ RegExpMatchArray, String]): Unit = js.native
    
    /** register a new attribute operator symbol and its related function resolver */
    def registerOperator(operator: String, resolver: AttributeOperator): Unit = js.native
    
    /** register a new selector symbol and its related function resolver */
    def registerSelector[F /* <: js.ThisFunction1[
        /* this */ Callback[F], 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](name: String, regExp: String, func: F): Unit = js.native
    def registerSelector[F /* <: js.ThisFunction1[
        /* this */ Expression[F], 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](name: String, regExp: js.RegExp, func: F): Unit = js.native
    def registerSelector[R /* <: Match */, F /* <: js.ThisFunction1[
        /* this */ CallbackExpression[R, F], 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](name: String, regExp: R, func: F): Unit = js.native
    
    /**
      * Equivalent of w3c `querySelectorAll` method.
      *
      * @param callback
      * The callback that gets invoked for every encountered element that matches `selector`.
      *
      * Return `false` to stop searching for more elements.
      */
    def select[S /* <: String */](selector: S): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: Null,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: Unit,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](selector: S, context: ContextNode): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: ContextNode,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
    
    val selectLambdas: StringDictionary[SelectLambda[Element]] = js.native
    
    val selectResolvers: StringDictionary[SelectResolver] = js.native
    
    /** restore QSA methods (only for browsers) */
    def uninstall(): Unit = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    string extends T ? std.Element : T extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[T] : T extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[T] : std.Element
    }}}
    */
  type ResolveElementType[T /* <: String */] = Element
  
  type SelectLambda[T /* <: Element */] = js.Function4[
    /* element */ ArrayLike[T] | NodeListOf[T] | HTMLCollectionOf[T], 
    /* callback */ js.UndefOr[js.Function1[/* element */ T, Any]], 
    /* context */ ContextNode, 
    /* results */ ArrayLike[Element], 
    ArrayLike[Element]
  ]
  
  trait SelectResolver extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
    
    var context: ContextNode
    
    var factory: js.Array[SelectLambda[Element]]
    
    var htmlset: js.Array[js.Function0[js.Array[Element]]]
    
    var nodeset: js.Array[String]
    
    var results: js.Array[Element]
  }
  object SelectResolver {
    
    inline def apply(
      context: ContextNode,
      factory: js.Array[SelectLambda[Element]],
      htmlset: js.Array[js.Function0[js.Array[Element]]],
      nodeset: js.Array[String],
      results: js.Array[Element]
    ): SelectResolver = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], htmlset = htmlset.asInstanceOf[js.Any], nodeset = nodeset.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectResolver]
    }
    
    extension [Self <: SelectResolver](x: Self) {
      
      inline def setCallback(value: /* node */ Node => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContext(value: ContextNode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFactory(value: js.Array[SelectLambda[Element]]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryVarargs(value: SelectLambda[Element]*): Self = StObject.set(x, "factory", js.Array(value*))
      
      inline def setHtmlset(value: js.Array[js.Function0[js.Array[Element]]]): Self = StObject.set(x, "htmlset", value.asInstanceOf[js.Any])
      
      inline def setHtmlsetVarargs(value: js.Function0[js.Array[Element]]*): Self = StObject.set(x, "htmlset", js.Array(value*))
      
      inline def setNodeset(value: js.Array[String]): Self = StObject.set(x, "nodeset", value.asInstanceOf[js.Any])
      
      inline def setNodesetVarargs(value: String*): Self = StObject.set(x, "nodeset", js.Array(value*))
      
      inline def setResults(value: js.Array[Element]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: Element*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  @js.native
  trait Snapshot extends StObject {
    
    def ancestor[S /* <: String */](selector: S, element: Element): ResolveElementType[S] | Null = js.native
    def ancestor[S /* <: String */](selector: S, element: Element, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    
    def byTag[T /* <: String */](tag: T, context: ContextNode): js.Array[ResolveElementType[T]] = js.native
    
    var doc: Document = js.native
    
    def first[S /* <: String */](selector: S): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: Null, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: Unit, callback: js.Function1[/* element */ ResolveElementType[S], Unit]): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](selector: S, context: ContextNode): ResolveElementType[S] | Null = js.native
    def first[S /* <: String */](
      selector: S,
      context: ContextNode,
      callback: js.Function1[/* element */ ResolveElementType[S], Unit]
    ): ResolveElementType[S] | Null = js.native
    
    var from: ContextNode = js.native
    
    /**
      * namespace aware `hasAttribute` helper for XML/XHTML documents
      */
    def hasAttributeNS(e: Element, name: String): Boolean = js.native
    
    /**
      * Fast resolver for the :nth-child() and :nth-last-child() pseudo-classes
      *
      * @param element The element from which the sibling is being searched for.
      * @param dir The direction to search in.
      *
      * |  value  | description
      * | ------- | :----------
      * | `false` | search forward.
      * | `true`  | search backward.
      * | `2`     | clear cache and immediately return `-1`, ignoring `element`.
      *
      * @return The index where the next element can be found.
      */
    def nthElement(element: Element): Double = js.native
    def nthElement(element: Element, dir: Boolean): Double = js.native
    @JSName("nthElement")
    def nthElement_2(element: Any, dir: `2`): `-1` = js.native
    
    /**
      * Fast resolver for the :nth-of-type() and :nth-last-of-type() pseudo-classes
      *
      * @param element The element from which the sibling is being searched for.
      * @param dir The direction to search in.
      *
      * |  value  | description
      * | ------- | :----------
      * | `false` | search forward.
      * | `true`  | search backward.
      * | `2`     | clear cache and immediately return `-1`, ignoring `element`.
      *
      * @return The index where the next element can be found.
      */
    def nthOfType(element: Element): Double = js.native
    def nthOfType(element: Element, dir: Boolean): Double = js.native
    @JSName("nthOfType")
    def nthOfType_2(element: Any, dir: `2`): `-1` = js.native
    
    var root: Element = js.native
    
    def select[S /* <: String */](selector: S): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: Null,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: Unit,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](selector: S, context: ContextNode): js.Array[ResolveElementType[S]] = js.native
    def select[S /* <: String */](
      selector: S,
      context: ContextNode,
      callback: js.Function1[/* element */ ResolveElementType[S], Boolean | Unit]
    ): js.Array[ResolveElementType[S]] = js.native
  }
}
