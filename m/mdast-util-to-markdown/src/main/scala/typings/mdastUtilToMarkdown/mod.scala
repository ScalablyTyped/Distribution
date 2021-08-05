package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Apostrophe
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Graveaccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Tilde
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import typings.unist.mod.Node
import typings.unist.mod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(node: Node): String = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(node: Node, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Context extends StObject {
    
    def enter(`type`: String): js.Function0[Unit]
    
    def handle(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String
    def handle(node: Node, parent: Unit, context: Context, safeOptions: SafeOptions): String
    def handle(node: Node, parent: Parent, context: Context, safeOptions: SafeOptions): String
    @JSName("handle")
    var handle_Original: Handle
    
    var join: js.Array[Join]
    
    var options: Options
    
    var stack: js.Array[String]
    
    var unsafePatterns: js.Array[Unsafe]
  }
  object Context {
    
    inline def apply(
      enter: String => js.Function0[Unit],
      handle: (/* node */ Node, /* parent */ js.UndefOr[Parent | Null], /* context */ Context, /* safeOptions */ SafeOptions) => String,
      join: js.Array[Join],
      options: Options,
      stack: js.Array[String],
      unsafePatterns: js.Array[Unsafe]
    ): Context = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), handle = js.Any.fromFunction4(handle), join = join.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], unsafePatterns = unsafePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setEnter(value: String => js.Function0[Unit]): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setHandle(
        value: (/* node */ Node, /* parent */ js.UndefOr[Parent | Null], /* context */ Context, /* safeOptions */ SafeOptions) => String
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value :_*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      inline def setUnsafePatterns(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafePatterns", value.asInstanceOf[js.Any])
      
      inline def setUnsafePatternsVarargs(value: Unsafe*): Self = StObject.set(x, "unsafePatterns", js.Array(value :_*))
    }
  }
  
  trait Extension extends StObject {
    
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    var join: js.UndefOr[js.Array[Join]] = js.undefined
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value :_*))
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value :_*))
    }
  }
  
  type Handle = js.Function4[
    /* node */ Node, 
    /* parent */ js.UndefOr[Parent | Null], 
    /* context */ Context, 
    /* safeOptions */ SafeOptions, 
    String
  ]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String = js.native
    def apply(node: Node, parent: Unit, context: Context, safeOptions: SafeOptions): String = js.native
    def apply(node: Node, parent: Parent, context: Context, safeOptions: SafeOptions): String = js.native
    
    var peek: js.UndefOr[Handle] = js.native
  }
  
  type Handlers = StringDictionary[Handler]
  
  type Join = js.Function4[
    /* left */ Node, 
    /* right */ Node, 
    /* parent */ Parent, 
    /* context */ Context, 
    Boolean | Null | Unit
  ]
  
  trait Options extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var closeAtx: js.UndefOr[Boolean] = js.undefined
    
    var emphasis: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
    
    var fence: js.UndefOr[Tilde | Graveaccent] = js.undefined
    
    var fences: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    var incrementListMarker: js.UndefOr[Boolean] = js.undefined
    
    var join: js.UndefOr[js.Array[Join]] = js.undefined
    
    var listItemIndent: js.UndefOr[tab | one | mixed] = js.undefined
    
    var quote: js.UndefOr[Quotationmark | Apostrophe] = js.undefined
    
    var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.undefined
    
    var ruleRepeat: js.UndefOr[Double] = js.undefined
    
    var ruleSpaces: js.UndefOr[Boolean] = js.undefined
    
    var setext: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var tightDefinitions: js.UndefOr[Boolean] = js.undefined
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      inline def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      inline def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      inline def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      inline def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value :_*))
      
      inline def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      inline def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      inline def setQuote(value: Quotationmark | Apostrophe): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleRepeat(value: Double): Self = StObject.set(x, "ruleRepeat", value.asInstanceOf[js.Any])
      
      inline def setRuleRepeatUndefined: Self = StObject.set(x, "ruleRepeat", js.undefined)
      
      inline def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      inline def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      inline def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      inline def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      inline def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value :_*))
    }
  }
  
  trait SafeOptions extends StObject {
    
    var after: String
    
    var before: String
  }
  object SafeOptions {
    
    inline def apply(after: String, before: String): SafeOptions = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeOptions]
    }
    
    extension [Self <: SafeOptions](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unsafe extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var atBreak: js.UndefOr[Boolean] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
    
    var character: String
    
    var inConstruct: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var notInConstruct: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Unsafe {
    
    inline def apply(character: String): Unsafe = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsafe]
    }
    
    extension [Self <: Unsafe](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAtBreak(value: Boolean): Self = StObject.set(x, "atBreak", value.asInstanceOf[js.Any])
      
      inline def setAtBreakUndefined: Self = StObject.set(x, "atBreak", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "inConstruct", value.asInstanceOf[js.Any])
      
      inline def setInConstructUndefined: Self = StObject.set(x, "inConstruct", js.undefined)
      
      inline def setInConstructVarargs(value: String*): Self = StObject.set(x, "inConstruct", js.Array(value :_*))
      
      inline def setNotInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "notInConstruct", value.asInstanceOf[js.Any])
      
      inline def setNotInConstructUndefined: Self = StObject.set(x, "notInConstruct", js.undefined)
      
      inline def setNotInConstructVarargs(value: String*): Self = StObject.set(x, "notInConstruct", js.Array(value :_*))
    }
  }
}
