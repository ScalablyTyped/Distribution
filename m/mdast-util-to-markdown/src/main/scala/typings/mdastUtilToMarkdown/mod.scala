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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  def apply(node: Node): String = js.native
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  def apply(node: Node, options: Options): String = js.native
  
  @js.native
  trait Context extends StObject {
    
    def enter(`type`: String): js.Function0[Unit] = js.native
    
    def handle(node: Node, parent: js.UndefOr[scala.Nothing], context: Context, safeOptions: SafeOptions): String = js.native
    def handle(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String = js.native
    def handle(node: Node, parent: Parent, context: Context, safeOptions: SafeOptions): String = js.native
    @JSName("handle")
    var handle_Original: Handle = js.native
    
    var join: js.Array[Join] = js.native
    
    var options: Options = js.native
    
    var stack: js.Array[String] = js.native
    
    var unsafePatterns: js.Array[Unsafe] = js.native
  }
  
  @js.native
  trait Extension extends StObject {
    
    var handlers: js.UndefOr[Handlers] = js.native
    
    var join: js.UndefOr[js.Array[Join]] = js.native
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value :_*))
      
      @scala.inline
      def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      @scala.inline
      def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value :_*))
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
    
    def apply(node: Node, parent: js.UndefOr[scala.Nothing], context: Context, safeOptions: SafeOptions): String = js.native
    def apply(node: Node, parent: Null, context: Context, safeOptions: SafeOptions): String = js.native
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
  
  @js.native
  trait Options extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.native
    
    var closeAtx: js.UndefOr[Boolean] = js.native
    
    var emphasis: js.UndefOr[_underscore | Asterisk] = js.native
    
    var extensions: js.UndefOr[js.Array[Extension]] = js.native
    
    var fence: js.UndefOr[Tilde | Graveaccent] = js.native
    
    var fences: js.UndefOr[Boolean] = js.native
    
    var handlers: js.UndefOr[Handlers] = js.native
    
    var incrementListMarker: js.UndefOr[Boolean] = js.native
    
    var join: js.UndefOr[js.Array[Join]] = js.native
    
    var listItemIndent: js.UndefOr[tab | one | mixed] = js.native
    
    var quote: js.UndefOr[Quotationmark | Apostrophe] = js.native
    
    var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.native
    
    var ruleRepeat: js.UndefOr[Double] = js.native
    
    var ruleSpaces: js.UndefOr[Boolean] = js.native
    
    var setext: js.UndefOr[Boolean] = js.native
    
    var strong: js.UndefOr[_underscore | Asterisk] = js.native
    
    var tightDefinitions: js.UndefOr[Boolean] = js.native
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      @scala.inline
      def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      @scala.inline
      def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      @scala.inline
      def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      @scala.inline
      def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      @scala.inline
      def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value :_*))
      
      @scala.inline
      def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      @scala.inline
      def setQuote(value: Quotationmark | Apostrophe): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleRepeat(value: Double): Self = StObject.set(x, "ruleRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleRepeatUndefined: Self = StObject.set(x, "ruleRepeat", js.undefined)
      
      @scala.inline
      def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      @scala.inline
      def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      @scala.inline
      def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      @scala.inline
      def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SafeOptions extends StObject {
    
    var after: String = js.native
    
    var before: String = js.native
  }
  object SafeOptions {
    
    @scala.inline
    def apply(after: String, before: String): SafeOptions = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeOptions]
    }
    
    @scala.inline
    implicit class SafeOptionsMutableBuilder[Self <: SafeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unsafe extends StObject {
    
    var after: js.UndefOr[String] = js.native
    
    var atBreak: js.UndefOr[Boolean] = js.native
    
    var before: js.UndefOr[String] = js.native
    
    var character: String = js.native
    
    var inConstruct: js.UndefOr[String | js.Array[String]] = js.native
    
    var notInConstruct: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Unsafe {
    
    @scala.inline
    def apply(character: String): Unsafe = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsafe]
    }
    
    @scala.inline
    implicit class UnsafeMutableBuilder[Self <: Unsafe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAtBreak(value: Boolean): Self = StObject.set(x, "atBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtBreakUndefined: Self = StObject.set(x, "atBreak", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "inConstruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInConstructUndefined: Self = StObject.set(x, "inConstruct", js.undefined)
      
      @scala.inline
      def setInConstructVarargs(value: String*): Self = StObject.set(x, "inConstruct", js.Array(value :_*))
      
      @scala.inline
      def setNotInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "notInConstruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotInConstructUndefined: Self = StObject.set(x, "notInConstruct", js.undefined)
      
      @scala.inline
      def setNotInConstructVarargs(value: String*): Self = StObject.set(x, "notInConstruct", js.Array(value :_*))
    }
  }
}
