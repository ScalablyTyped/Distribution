package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.anon.Children
import typings.mdastUtilToMarkdown.anon.ChildrenArray
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
import typings.std.Partial
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type Association = typings.mdast.mod.Association
  
  type AssociationId = js.Function1[/* node */ Association, String]
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown.ConstructName */
  /* Rewritten from type alias, can be one of: 
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeIndented
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangTilde
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleQuote
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFenced
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationLiteral
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.reference
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.linkReference
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingAtx
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleApostrophe
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.definition
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.image
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationRaw
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaTilde
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.paragraph
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.phrasing
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.strong
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaGraveAccent
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.imageReference
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingSetext
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.listItem
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.label
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.list
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.emphasis
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.autolink
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.blockquote
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangGraveAccent
    - typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.link
  */
  trait ConstructName extends StObject
  object ConstructName {
    
    inline def autolink: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.autolink = "autolink".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.autolink]
    
    inline def blockquote: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.blockquote = "blockquote".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.blockquote]
    
    inline def codeFenced: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFenced = "codeFenced".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFenced]
    
    inline def codeFencedLangGraveAccent: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangGraveAccent = "codeFencedLangGraveAccent".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangGraveAccent]
    
    inline def codeFencedLangTilde: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangTilde = "codeFencedLangTilde".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangTilde]
    
    inline def codeFencedMetaGraveAccent: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaGraveAccent = "codeFencedMetaGraveAccent".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaGraveAccent]
    
    inline def codeFencedMetaTilde: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaTilde = "codeFencedMetaTilde".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaTilde]
    
    inline def codeIndented: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeIndented = "codeIndented".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeIndented]
    
    inline def definition: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.definition = "definition".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.definition]
    
    inline def destinationLiteral: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationLiteral = "destinationLiteral".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationLiteral]
    
    inline def destinationRaw: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationRaw = "destinationRaw".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationRaw]
    
    inline def emphasis: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.emphasis = "emphasis".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.emphasis]
    
    inline def headingAtx: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingAtx = "headingAtx".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingAtx]
    
    inline def headingSetext: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingSetext = "headingSetext".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingSetext]
    
    inline def image: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.image = "image".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.image]
    
    inline def imageReference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.imageReference = "imageReference".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.imageReference]
    
    inline def label: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.label = "label".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.label]
    
    inline def link: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.link = "link".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.link]
    
    inline def linkReference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.linkReference = "linkReference".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.linkReference]
    
    inline def list: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.list = "list".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.list]
    
    inline def listItem: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.listItem = "listItem".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.listItem]
    
    inline def paragraph: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.paragraph = "paragraph".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.paragraph]
    
    inline def phrasing: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.phrasing = "phrasing".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.phrasing]
    
    inline def reference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.reference = "reference".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.reference]
    
    inline def strong: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.strong = "strong".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.strong]
    
    inline def titleApostrophe: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleApostrophe = "titleApostrophe".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleApostrophe]
    
    inline def titleQuote: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleQuote = "titleQuote".asInstanceOf[typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleQuote]
  }
  
  type ContainerFlow = js.Function2[/* parent */ Parent & ChildrenArray, /* info */ TrackFields, String]
  
  type ContainerPhrasing = js.Function2[/* parent */ Parent & Children, /* info */ Info, String]
  
  type Content = typings.mdast.mod.Content
  
  type CreateTracker = js.Function1[/* info */ TrackFields, Tracker]
  
  type Enter = js.Function1[/* name */ ConstructName, Exit]
  
  type Exit = js.Function0[Unit]
  
  type FlowContent = TopLevelContent | ListContent
  
  type Handle = js.Function4[
    /* node */ Any, 
    /* parent */ js.UndefOr[Parent], 
    /* state */ State, 
    /* Info */ Info, 
    String
  ]
  
  type Handlers = Record[
    /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Node['type'] */ js.Any, 
    Handle
  ]
  
  type IndentLines = js.Function2[/* value */ String, /* map */ Map, String]
  
  trait Info
    extends StObject
       with TrackFields
       with SafeFields
  object Info {
    
    inline def apply(after: String, before: String, lineShift: Double, now: Point): Info = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], lineShift = lineShift.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
  }
  
  type Join = js.Function4[
    /* left */ Node, 
    /* right */ Node, 
    /* parent */ Parent, 
    /* state */ State, 
    js.UndefOr[Boolean | Null | Unit | Double]
  ]
  
  type ListContent = typings.mdast.mod.ListContent
  
  type Map = js.Function3[/* value */ String, /* line */ Double, /* blank */ Boolean, String]
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    /**
      * Marker to use for bullets of items in unordered lists.
      */
    var bullet: js.UndefOr[`-_` | Asterisk | Plussign | Null] = js.undefined
    
    /**
      * Marker to use for bullets of items in ordered lists.
      */
    var bulletOrdered: js.UndefOr[Dot | (/* ) */ String) | Null] = js.undefined
    
    /**
      * Marker to use in certain cases where the primary bullet for ordered items
      * doesn’t work.
      *
      * There is one case where the primary bullet for ordered items cannot be used:
      *
      * *   When two ordered lists appear next to each other: `1. a\n2) b`.
      * CommonMark added support for `)` as a marker, but other markdown
      * parsers do not support it.
      * To solve for both, we instead inject an empty comment between the two
      * lists: `1. a\n<!---->\n1. b`, but if `bulletOrderedOther` is given
      * explicitly, it will be used instead
      */
    var bulletOrderedOther: js.UndefOr[Dot | (/* ) */ String) | Null] = js.undefined
    
    /**
      * Marker to use in certain cases where the primary bullet doesn’t work.
      *
      * There are three cases where the primary bullet cannot be used:
      *
      * *   When three list items are on their own, the last one is empty, and
      * `bullet` is also a valid `rule`: `* - +`.
      * This would turn into a thematic break if serialized with three primary
      * bullets.
      * As this is an edge case unlikely to appear in normal markdown, the
      * last list item will be given a different bullet.
      * *   When a thematic break is the first child of one of the list items, and
      * `bullet` is the same character as `rule`: `- ***`.
      * This would turn into a single thematic break if serialized with
      * primary bullets.
      * As this is an edge case unlikely to appear in normal markdown this
      * markup is always fixed, even if `bulletOther` is not passed
      * *   When two unordered lists appear next to each other: `* a\n- b`.
      * CommonMark sees different bullets as different lists, but several
      * markdown parsers parse it as one list.
      * To solve for both, we instead inject an empty comment between the two
      * lists: `* a\n<!---->\n* b`, but if `bulletOther` is given explicitly,
      * it will be used instead
      */
    var bulletOther: js.UndefOr[`-_` | Asterisk | Plussign | Null] = js.undefined
    
    /**
      * Whether to add the same number of number signs (`#`) at the end of an ATX
      * heading as the opening sequence.
      */
    var closeAtx: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Marker to use for emphasis.
      */
    var emphasis: js.UndefOr[_underscore | Asterisk | Null] = js.undefined
    
    /**
      * List of extensions to include.
      *
      * Each `ToMarkdownExtension` is an object with the same interface as
      * `Options` here.
      */
    var extensions: js.UndefOr[js.Array[Options] | Null] = js.undefined
    
    /**
      * Marker to use for fenced code.
      */
    var fence: js.UndefOr[Tilde | Graveaccent | Null] = js.undefined
    
    /**
      * Whether to use fenced code always.
      *
      * The default is to use fenced code if there is a language defined, if the
      * code is empty, or if it starts or ends in blank lines.
      */
    var fences: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Handle particular nodes.
      *
      * Each key is a node type, each value its corresponding handler.
      */
    var handlers: js.UndefOr[Partial[Handlers] | Null] = js.undefined
    
    /**
      * Whether to increment the counter of ordered lists items.
      */
    var incrementListMarker: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * How to join blocks.
      */
    var join: js.UndefOr[js.Array[Join] | Null] = js.undefined
    
    /**
      * How to indent the content of list items.
      *
      * Either with the size of the bullet plus one space (when `'one'`), a tab
      * stop (`'tab'`), or depending on the item and its parent list (`'mixed'`,
      * uses `'one'` if the item and list are tight and `'tab'` otherwise).
      */
    var listItemIndent: js.UndefOr[tab | one | mixed | Null] = js.undefined
    
    /**
      * Marker to use for titles.
      */
    var quote: js.UndefOr[Quotationmark | (/* ' */ String) | Null] = js.undefined
    
    /**
      * Whether to always use resource links.
      *
      * The default is to use autolinks (`<https://example.com>`) when possible
      * and resource links (`[text](url)`) otherwise.
      */
    var resourceLink: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Marker to use for thematic breaks.
      */
    var rule: js.UndefOr[`-_` | _underscore | Asterisk | Null] = js.undefined
    
    /**
      * Number of markers to use for thematic breaks.
      */
    var ruleRepetition: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Whether to add spaces between markers in thematic breaks.
      */
    var ruleSpaces: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Whether to use setext headings when possible.
      *
      * The default is to always use ATX headings (`# heading`) instead of setext
      * headings (`heading\n=======`).
      * Setext headings cannot be used for empty headings or headings with a rank
      * of three or more.
      */
    var setext: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Marker to use for strong.
      */
    var strong: js.UndefOr[_underscore | Asterisk | Null] = js.undefined
    
    /**
      * Whether to join definitions without a blank line.
      *
      * The default is to add blank lines between any flow (“block”) construct.
      * Turning this option on is a shortcut for a join function like so:
      *
      * ```js
      * function joinTightDefinitions(left, right) {
      * if (left.type === 'definition' && right.type === 'definition') {
      * return 0
      * }
      * }
      * ```
      */
    var tightDefinitions: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Schemas that define when characters cannot occur.
      */
    var unsafe: js.UndefOr[js.Array[Unsafe] | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBullet(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletNull: Self = StObject.set(x, "bullet", null)
      
      inline def setBulletOrdered(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrdered", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedNull: Self = StObject.set(x, "bulletOrdered", null)
      
      inline def setBulletOrderedOther(value: Dot | (/* ) */ String)): Self = StObject.set(x, "bulletOrderedOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOrderedOtherNull: Self = StObject.set(x, "bulletOrderedOther", null)
      
      inline def setBulletOrderedOtherUndefined: Self = StObject.set(x, "bulletOrderedOther", js.undefined)
      
      inline def setBulletOrderedUndefined: Self = StObject.set(x, "bulletOrdered", js.undefined)
      
      inline def setBulletOther(value: `-_` | Asterisk | Plussign): Self = StObject.set(x, "bulletOther", value.asInstanceOf[js.Any])
      
      inline def setBulletOtherNull: Self = StObject.set(x, "bulletOther", null)
      
      inline def setBulletOtherUndefined: Self = StObject.set(x, "bulletOther", js.undefined)
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setCloseAtx(value: Boolean): Self = StObject.set(x, "closeAtx", value.asInstanceOf[js.Any])
      
      inline def setCloseAtxNull: Self = StObject.set(x, "closeAtx", null)
      
      inline def setCloseAtxUndefined: Self = StObject.set(x, "closeAtx", js.undefined)
      
      inline def setEmphasis(value: _underscore | Asterisk): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisNull: Self = StObject.set(x, "emphasis", null)
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setExtensions(value: js.Array[Options]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: Options*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFence(value: Tilde | Graveaccent): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceNull: Self = StObject.set(x, "fence", null)
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setFences(value: Boolean): Self = StObject.set(x, "fences", value.asInstanceOf[js.Any])
      
      inline def setFencesNull: Self = StObject.set(x, "fences", null)
      
      inline def setFencesUndefined: Self = StObject.set(x, "fences", js.undefined)
      
      inline def setHandlers(value: Partial[Handlers]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersNull: Self = StObject.set(x, "handlers", null)
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setIncrementListMarker(value: Boolean): Self = StObject.set(x, "incrementListMarker", value.asInstanceOf[js.Any])
      
      inline def setIncrementListMarkerNull: Self = StObject.set(x, "incrementListMarker", null)
      
      inline def setIncrementListMarkerUndefined: Self = StObject.set(x, "incrementListMarker", js.undefined)
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinNull: Self = StObject.set(x, "join", null)
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setListItemIndent(value: tab | one | mixed): Self = StObject.set(x, "listItemIndent", value.asInstanceOf[js.Any])
      
      inline def setListItemIndentNull: Self = StObject.set(x, "listItemIndent", null)
      
      inline def setListItemIndentUndefined: Self = StObject.set(x, "listItemIndent", js.undefined)
      
      inline def setQuote(value: Quotationmark | (/* ' */ String)): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setResourceLink(value: Boolean): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
      
      inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
      
      inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
      
      inline def setRule(value: `-_` | _underscore | Asterisk): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleNull: Self = StObject.set(x, "rule", null)
      
      inline def setRuleRepetition(value: Double): Self = StObject.set(x, "ruleRepetition", value.asInstanceOf[js.Any])
      
      inline def setRuleRepetitionNull: Self = StObject.set(x, "ruleRepetition", null)
      
      inline def setRuleRepetitionUndefined: Self = StObject.set(x, "ruleRepetition", js.undefined)
      
      inline def setRuleSpaces(value: Boolean): Self = StObject.set(x, "ruleSpaces", value.asInstanceOf[js.Any])
      
      inline def setRuleSpacesNull: Self = StObject.set(x, "ruleSpaces", null)
      
      inline def setRuleSpacesUndefined: Self = StObject.set(x, "ruleSpaces", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setSetext(value: Boolean): Self = StObject.set(x, "setext", value.asInstanceOf[js.Any])
      
      inline def setSetextNull: Self = StObject.set(x, "setext", null)
      
      inline def setSetextUndefined: Self = StObject.set(x, "setext", js.undefined)
      
      inline def setStrong(value: _underscore | Asterisk): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "strong", null)
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTightDefinitions(value: Boolean): Self = StObject.set(x, "tightDefinitions", value.asInstanceOf[js.Any])
      
      inline def setTightDefinitionsNull: Self = StObject.set(x, "tightDefinitions", null)
      
      inline def setTightDefinitionsUndefined: Self = StObject.set(x, "tightDefinitions", js.undefined)
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeNull: Self = StObject.set(x, "unsafe", null)
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  /* Inlined std.Extract<mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Node, mdast-util-to-markdown.mdast-util-to-markdown/lib/types.UnistParent> */
  type Parent = children
  
  type PhrasingContent = typings.mdast.mod.PhrasingContent
  
  type Point = typings.unist.mod.Point
  
  type Root = typings.mdast.mod.Root
  
  type Safe = js.Function2[/* input */ js.UndefOr[String | Null], /* config */ SafeConfig, String]
  
  trait SafeConfig
    extends StObject
       with SafeFields
       with SafeEncodeFields
  object SafeConfig {
    
    inline def apply(after: String, before: String): SafeConfig = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeConfig]
    }
  }
  
  trait SafeEncodeFields extends StObject {
    
    /**
      * Extra characters that *must* be encoded (as character references) instead
      * of escaped (character escapes).
      *
      * Only ASCII punctuation will use character escapes, so you never need to
      * pass non-ASCII-punctuation here.
      */
    var encode: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object SafeEncodeFields {
    
    inline def apply(): SafeEncodeFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeEncodeFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SafeEncodeFields] (val x: Self) extends AnyVal {
      
      inline def setEncode(value: js.Array[String]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeNull: Self = StObject.set(x, "encode", null)
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setEncodeVarargs(value: String*): Self = StObject.set(x, "encode", js.Array(value*))
    }
  }
  
  trait SafeFields extends StObject {
    
    /**
      * Characters after this (guaranteed to be one, can be more).
      */
    var after: String
    
    /**
      * Characters before this (guaranteed to be one, can be more).
      */
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
  
  trait State extends StObject {
    
    /**
      * Get an identifier from an association to match it to others.
      */
    def associationId(node: Association): String
    /**
      * Get an identifier from an association to match it to others.
      */
    @JSName("associationId")
    var associationId_Original: AssociationId
    
    /**
      * List marker currently in use.
      */
    var bulletCurrent: js.UndefOr[String] = js.undefined
    
    /**
      * List marker previously in use.
      */
    var bulletLastUsed: js.UndefOr[String] = js.undefined
    
    /**
      * Serialize the children of a parent that contains flow children.
      */
    def containerFlow(parent: Parent & ChildrenArray, info: TrackFields): String
    /**
      * Serialize the children of a parent that contains flow children.
      */
    @JSName("containerFlow")
    var containerFlow_Original: ContainerFlow
    
    /**
      * Serialize the children of a parent that contains phrasing children.
      */
    def containerPhrasing(parent: Parent & Children, info: Info): String
    /**
      * Serialize the children of a parent that contains phrasing children.
      */
    @JSName("containerPhrasing")
    var containerPhrasing_Original: ContainerPhrasing
    
    /**
      * Track positional info in the output.
      */
    def createTracker(info: TrackFields): Tracker
    /**
      * Track positional info in the output.
      */
    @JSName("createTracker")
    var createTracker_Original: CreateTracker
    
    /**
      * Enter a construct (returns a corresponding exit function).
      */
    def enter(name: ConstructName): Exit
    /**
      * Enter a construct (returns a corresponding exit function).
      */
    @JSName("enter")
    var enter_Original: Enter
    
    def handle(node: Any, parent: Unit, state: State, Info: Info): String
    /**
      * Call the configured handler for the given node.
      */
    def handle(node: Any, parent: Parent, state: State, Info: Info): String
    /**
      * Call the configured handler for the given node.
      */
    @JSName("handle")
    var handle_Original: Handle
    
    /**
      * Applied handlers.
      */
    var handlers: Handlers
    
    /**
      * Pad serialized markdown.
      */
    def indentLines(value: String, map: Map): String
    /**
      * Pad serialized markdown.
      */
    @JSName("indentLines")
    var indentLines_Original: IndentLines
    
    /**
      * Positions of child nodes in their parents.
      */
    var indexStack: js.Array[Double]
    
    /**
      * Applied join handlers.
      */
    var join: js.Array[Join]
    
    /**
      * Applied user configuration.
      */
    var options: Options
    
    /**
      * Serialize the children of a parent that contains flow children.
      */
    def safe(input: String, config: SafeConfig): String
    def safe(input: Null, config: SafeConfig): String
    def safe(input: Unit, config: SafeConfig): String
    /**
      * Serialize the children of a parent that contains flow children.
      */
    @JSName("safe")
    var safe_Original: Safe
    
    /**
      * Stack of constructs we’re in.
      */
    var stack: js.Array[ConstructName]
    
    /**
      * Applied unsafe patterns.
      */
    var unsafe: js.Array[Unsafe]
  }
  object State {
    
    inline def apply(
      associationId: /* node */ Association => String,
      containerFlow: (/* parent */ Parent & ChildrenArray, /* info */ TrackFields) => String,
      containerPhrasing: (/* parent */ Parent & Children, /* info */ Info) => String,
      createTracker: /* info */ TrackFields => Tracker,
      enter: /* name */ ConstructName => Exit,
      handle: (/* node */ Any, /* parent */ js.UndefOr[Parent], /* state */ State, /* Info */ Info) => String,
      handlers: Handlers,
      indentLines: (/* value */ String, /* map */ Map) => String,
      indexStack: js.Array[Double],
      join: js.Array[Join],
      options: Options,
      safe: (/* input */ js.UndefOr[String | Null], /* config */ SafeConfig) => String,
      stack: js.Array[ConstructName],
      unsafe: js.Array[Unsafe]
    ): State = {
      val __obj = js.Dynamic.literal(associationId = js.Any.fromFunction1(associationId), containerFlow = js.Any.fromFunction2(containerFlow), containerPhrasing = js.Any.fromFunction2(containerPhrasing), createTracker = js.Any.fromFunction1(createTracker), enter = js.Any.fromFunction1(enter), handle = js.Any.fromFunction4(handle), handlers = handlers.asInstanceOf[js.Any], indentLines = js.Any.fromFunction2(indentLines), indexStack = indexStack.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], safe = js.Any.fromFunction2(safe), stack = stack.asInstanceOf[js.Any], unsafe = unsafe.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setAssociationId(value: /* node */ Association => String): Self = StObject.set(x, "associationId", js.Any.fromFunction1(value))
      
      inline def setBulletCurrent(value: String): Self = StObject.set(x, "bulletCurrent", value.asInstanceOf[js.Any])
      
      inline def setBulletCurrentUndefined: Self = StObject.set(x, "bulletCurrent", js.undefined)
      
      inline def setBulletLastUsed(value: String): Self = StObject.set(x, "bulletLastUsed", value.asInstanceOf[js.Any])
      
      inline def setBulletLastUsedUndefined: Self = StObject.set(x, "bulletLastUsed", js.undefined)
      
      inline def setContainerFlow(value: (/* parent */ Parent & ChildrenArray, /* info */ TrackFields) => String): Self = StObject.set(x, "containerFlow", js.Any.fromFunction2(value))
      
      inline def setContainerPhrasing(value: (/* parent */ Parent & Children, /* info */ Info) => String): Self = StObject.set(x, "containerPhrasing", js.Any.fromFunction2(value))
      
      inline def setCreateTracker(value: /* info */ TrackFields => Tracker): Self = StObject.set(x, "createTracker", js.Any.fromFunction1(value))
      
      inline def setEnter(value: /* name */ ConstructName => Exit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setHandle(
        value: (/* node */ Any, /* parent */ js.UndefOr[Parent], /* state */ State, /* Info */ Info) => String
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setIndentLines(value: (/* value */ String, /* map */ Map) => String): Self = StObject.set(x, "indentLines", js.Any.fromFunction2(value))
      
      inline def setIndexStack(value: js.Array[Double]): Self = StObject.set(x, "indexStack", value.asInstanceOf[js.Any])
      
      inline def setIndexStackVarargs(value: Double*): Self = StObject.set(x, "indexStack", js.Array(value*))
      
      inline def setJoin(value: js.Array[Join]): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinVarargs(value: Join*): Self = StObject.set(x, "join", js.Array(value*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSafe(value: (/* input */ js.UndefOr[String | Null], /* config */ SafeConfig) => String): Self = StObject.set(x, "safe", js.Any.fromFunction2(value))
      
      inline def setStack(value: js.Array[ConstructName]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: ConstructName*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setUnsafe(value: js.Array[Unsafe]): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeVarargs(value: Unsafe*): Self = StObject.set(x, "unsafe", js.Array(value*))
    }
  }
  
  type TopLevelContent = typings.mdast.mod.TopLevelContent
  
  type TrackCurrent = js.Function0[TrackFields]
  
  trait TrackFields extends StObject {
    
    /**
      * Number of columns each line will be shifted by wrapping nodes.
      */
    var lineShift: Double
    
    /**
      * Current point.
      */
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
  
  type TrackMove = js.Function1[/* value */ js.UndefOr[String | Null], String]
  
  type TrackShift = js.Function1[/* value */ Double, Unit]
  
  trait Tracker extends StObject {
    
    /**
      * Get the current tracked info.
      */
    def current(): TrackFields
    /**
      * Get the current tracked info.
      */
    @JSName("current")
    var current_Original: TrackCurrent
    
    /**
      * Move past some generated markdown.
      */
    def move(): String
    def move(value: String): String
    /**
      * Move past some generated markdown.
      */
    @JSName("move")
    var move_Original: TrackMove
    
    /**
      * Define an increased line shift (the typical indent for lines).
      */
    def shift(value: Double): Unit
    /**
      * Define an increased line shift (the typical indent for lines).
      */
    @JSName("shift")
    var shift_Original: TrackShift
  }
  object Tracker {
    
    inline def apply(
      current: () => TrackFields,
      move: /* value */ js.UndefOr[String | Null] => String,
      shift: /* value */ Double => Unit
    ): Tracker = {
      val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), move = js.Any.fromFunction1(move), shift = js.Any.fromFunction1(shift))
      __obj.asInstanceOf[Tracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tracker] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: () => TrackFields): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      inline def setMove(value: /* value */ js.UndefOr[String | Null] => String): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setShift(value: /* value */ Double => Unit): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
    }
  }
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  trait Unsafe extends StObject {
    
    /**
      * The unsafe pattern (this whole object) compiled as a regex.
      *
      * This is internal and must not be defined.
      */
    var _compiled: js.UndefOr[js.RegExp | Null] = js.undefined
    
    /**
      * `character` is bad when this is after it.
      */
    var after: js.UndefOr[String | Null] = js.undefined
    
    /**
      * `character` is bad at a break (cannot be used together with `before`).
      */
    var atBreak: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * `character` is bad when this is before it (cannot be used together with
      * `atBreak`).
      */
    var before: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Single unsafe character.
      */
    var character: String
    
    /**
      * Constructs where this is bad.
      */
    var inConstruct: js.UndefOr[ConstructName | js.Array[ConstructName] | Null] = js.undefined
    
    /**
      * Constructs where this is fine again.
      */
    var notInConstruct: js.UndefOr[ConstructName | js.Array[ConstructName] | Null] = js.undefined
  }
  object Unsafe {
    
    inline def apply(character: String): Unsafe = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsafe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unsafe] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterNull: Self = StObject.set(x, "after", null)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAtBreak(value: Boolean): Self = StObject.set(x, "atBreak", value.asInstanceOf[js.Any])
      
      inline def setAtBreakNull: Self = StObject.set(x, "atBreak", null)
      
      inline def setAtBreakUndefined: Self = StObject.set(x, "atBreak", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeNull: Self = StObject.set(x, "before", null)
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setInConstruct(value: ConstructName | js.Array[ConstructName]): Self = StObject.set(x, "inConstruct", value.asInstanceOf[js.Any])
      
      inline def setInConstructNull: Self = StObject.set(x, "inConstruct", null)
      
      inline def setInConstructUndefined: Self = StObject.set(x, "inConstruct", js.undefined)
      
      inline def setInConstructVarargs(value: ConstructName*): Self = StObject.set(x, "inConstruct", js.Array(value*))
      
      inline def setNotInConstruct(value: ConstructName | js.Array[ConstructName]): Self = StObject.set(x, "notInConstruct", value.asInstanceOf[js.Any])
      
      inline def setNotInConstructNull: Self = StObject.set(x, "notInConstruct", null)
      
      inline def setNotInConstructUndefined: Self = StObject.set(x, "notInConstruct", js.undefined)
      
      inline def setNotInConstructVarargs(value: ConstructName*): Self = StObject.set(x, "notInConstruct", js.Array(value*))
      
      inline def set_compiled(value: js.RegExp): Self = StObject.set(x, "_compiled", value.asInstanceOf[js.Any])
      
      inline def set_compiledNull: Self = StObject.set(x, "_compiled", null)
      
      inline def set_compiledUndefined: Self = StObject.set(x, "_compiled", js.undefined)
    }
  }
}
