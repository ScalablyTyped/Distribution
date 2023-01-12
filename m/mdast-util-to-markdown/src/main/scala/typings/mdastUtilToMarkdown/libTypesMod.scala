package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Dot
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Graveaccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Tilde
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type Content = typings.mdast.mod.Content
  
  trait Context extends StObject {
    
    /**
      *   The marker used by the current list.
      */
    var bulletCurrent: js.UndefOr[String] = js.undefined
    
    /**
      *   The marker used by the previous list.
      */
    var bulletLastUsed: js.UndefOr[String] = js.undefined
    
    def enter(`type`: String): Exit
    @JSName("enter")
    var enter_Original: Enter
    
    def handle(node: Any, parent: Null, context: Context, safeOptions: SafeOptions): String
    def handle(node: Any, parent: Unit, context: Context, safeOptions: SafeOptions): String
    def handle(node: Any, parent: Parent, context: Context, safeOptions: SafeOptions): String
    @JSName("handle")
    var handle_Original: Handle
    
    var handlers: Handlers
    
    /**
      *   Positions of children in their parents.
      */
    var indexStack: js.Array[Double]
    
    var join: js.Array[Join]
    
    var options: Options
    
    /**
      *   Stack of labels.
      */
    var stack: js.Array[String]
    
    var unsafe: js.Array[Unsafe]
  }
  object Context {
    
    inline def apply(
      enter: /* type */ String => Exit,
      handle: (/* node */ Any, /* parent */ js.UndefOr[Parent | Null], /* context */ Context, /* safeOptions */ SafeOptions) => String,
      handlers: Handlers,
      indexStack: js.Array[Double],
      join: js.Array[Join],
      options: Options,
      stack: js.Array[String],
      unsafe: js.Array[Unsafe]
    ): Context = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), handle = js.Any.fromFunction4(handle), handlers = handlers.asInstanceOf[js.Any], indexStack = indexStack.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], unsafe = unsafe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setBulletCurrent(value: String): Self = StObject.set(x, "bulletCurrent", value.asInstanceOf[js.Any])
      
      inline def setBulletCurrentUndefined: Self = StObject.set(x, "bulletCurrent", js.undefined)
      
      inline def setBulletLastUsed(value: String): Self = StObject.set(x, "bulletLastUsed", value.asInstanceOf[js.Any])
      
      inline def setBulletLastUsedUndefined: Self = StObject.set(x, "bulletLastUsed", js.undefined)
      
      inline def setEnter(value: /* type */ String => Exit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setHandle(
        value: (/* node */ Any, /* parent */ js.UndefOr[Parent | Null], /* context */ Context, /* safeOptions */ SafeOptions) => String
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setIndexStack(value: js.Array[Double]): Self = StObject.set(x, "indexStack", value.asInstanceOf[js.Any])
      
      inline def setIndexStackVarargs(value: Double*): Self = StObject.set(x, "indexStack", js.Array(value*))
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  type Enter = js.Function1[/* type */ String, Exit]
  
  type Exit = js.Function0[Unit]
  
  type Handle = js.Function4[
    /* node */ Any, 
    /* parent */ js.UndefOr[Parent | Null], 
    /* context */ Context, 
    /* safeOptions */ SafeOptions, 
    String
  ]
  
  type Handlers = Record[String, Handle]
  
  type Join = js.Function4[
    /* left */ Node, 
    /* right */ Node, 
    /* parent */ Parent, 
    /* context */ Context, 
    Boolean | Null | Unit | Double
  ]
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var bulletOrdered: js.UndefOr[Dot | (/* ) */ String)] = js.undefined
    
    var bulletOrderedOther: js.UndefOr[Dot | (/* ) */ String)] = js.undefined
    
    var bulletOther: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
    
    var closeAtx: js.UndefOr[Boolean] = js.undefined
    
    var emphasis: js.UndefOr[Asterisk | _underscore] = js.undefined
    
    var extensions: js.UndefOr[js.Array[Options]] = js.undefined
    
    var fence: js.UndefOr[Tilde | Graveaccent] = js.undefined
    
    var fences: js.UndefOr[Boolean] = js.undefined
    
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    var incrementListMarker: js.UndefOr[Boolean] = js.undefined
    
    var join: js.UndefOr[js.Array[Join]] = js.undefined
    
    var listItemIndent: js.UndefOr[tab | one | mixed] = js.undefined
    
    var quote: js.UndefOr[Quotationmark | (/* ' */ String)] = js.undefined
    
    var resourceLink: js.UndefOr[Boolean] = js.undefined
    
    var rule: js.UndefOr[`-_` | Asterisk | _underscore] = js.undefined
    
    var ruleRepetition: js.UndefOr[Double] = js.undefined
    
    var ruleSpaces: js.UndefOr[Boolean] = js.undefined
    
    var setext: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Asterisk | _underscore] = js.undefined
    
    var tightDefinitions: js.UndefOr[Boolean] = js.undefined
    
    var unsafe: js.UndefOr[js.Array[Unsafe]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletOrdered(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrdered", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOther(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrderedOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOtherUndefined: Self = StObject.set(x, "bulletOrderedOther", js.undefined)
      
      inline def setBulletOrderedUndefined: Self = StObject.set(x, "bulletOrdered", js.undefined)
      
      inline def setBulletOther(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bulletOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOtherUndefined: Self = StObject.set(x, "bulletOther", js.undefined)
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      inline def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      inline def setEmphasis(value: Asterisk | _underscore): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setExtensions(value: js.Array[Options]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: Options*): Self = StObject.set(x, "extensions", js.Array(value*))
      
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
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      inline def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setResourceLink(value: Boolean): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
      
      inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
      
      inline def setRule(value: `-_` | Asterisk | _underscore): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetitionUndefined: Self = StObject.set(x, "ruleRepetition", js.undefined)
      
      inline def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      inline def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      inline def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      inline def setStrong(value: Asterisk | _underscore): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      inline def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  /* Inlined std.Extract<mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Node, mdast-util-to-markdown.mdast-util-to-markdown/lib/types.UnistParent> */
  type Parent = children
  
  type Point = typings.unist.mod.Point
  
  type Root = typings.mdast.mod.Root
  
  trait SafeFields extends StObject {
    
    var after: String
    
    var before: String
  }
  object SafeFields {
    
    inline def apply(after: String, before: String): SafeFields = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SafeFields] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait SafeOptions
    extends StObject
       with TrackFields
       with SafeFields
  object SafeOptions {
    
    inline def apply(after: String, before: String, lineShift: Double, now: Point): SafeOptions = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], lineShift = lineShift.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeOptions]
    }
  }
  
  trait TrackFields extends StObject {
    
    var lineShift: Double
    
    var now: Point
  }
  object TrackFields {
    
    inline def apply(lineShift: Double, now: Point): TrackFields = {
      val __obj = js.Dynamic.literal(lineShift = lineShift.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackFields] (val x: Self) extends AnyVal {
      
      inline def setLineShift(value: Double): Self = StObject.set(x, "lineShift", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Point): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    }
  }
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  trait Unsafe extends StObject {
    
    /**
      * The unsafe pattern compiled as a regex
      */
    var _compiled: js.UndefOr[js.RegExp] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unsafe] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAtBreak(value: Boolean): Self = StObject.set(x, "atBreak", value.asInstanceOf[js.Any])
      
      inline def setAtBreakUndefined: Self = StObject.set(x, "atBreak", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "inConstruct", value.asInstanceOf[js.Any])
      
      inline def setInConstructUndefined: Self = StObject.set(x, "inConstruct", js.undefined)
      
      inline def setInConstructVarargs(value: String*): Self = StObject.set(x, "inConstruct", js.Array(value*))
      
      inline def setNotInConstruct(value: String | js.Array[String]): Self = StObject.set(x, "notInConstruct", value.asInstanceOf[js.Any])
      
      inline def setNotInConstructUndefined: Self = StObject.set(x, "notInConstruct", js.undefined)
      
      inline def setNotInConstructVarargs(value: String*): Self = StObject.set(x, "notInConstruct", js.Array(value*))
      
      inline def set_compiled(value: js.RegExp): Self = StObject.set(x, "_compiled", value.asInstanceOf[js.Any])
      
      inline def set_compiledUndefined: Self = StObject.set(x, "_compiled", js.undefined)
    }
  }
}
