package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.libMod.Node
import typings.mdastUtilToMarkdown.libTypesMod.Info
import typings.mdastUtilToMarkdown.libTypesMod.Options
import typings.mdastUtilToMarkdown.libTypesMod.State
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.autolink
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.blockquote
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFenced
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangGraveAccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangTilde
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaGraveAccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaTilde
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeIndented
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.definition
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationLiteral
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationRaw
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.emphasis
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingAtx
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingSetext
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.image
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.imageReference
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.label
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.link
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.linkReference
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.list
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.listItem
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.paragraph
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.phrasing
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.reference
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.strong
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleApostrophe
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleQuote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown.ConstructNameMap[keyof mdast-util-to-markdown.mdast-util-to-markdown.ConstructNameMap] */
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
  
  trait ConstructNameMap extends StObject {
    
    /**
      * Whole autolink.
      *
      * ```markdown
      * > | <https://example.com> and <admin@example.com>
      *     ^^^^^^^^^^^^^^^^^^^^^     ^^^^^^^^^^^^^^^^^^^
      * ```
      */
    var autolink: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.autolink
    
    /**
      * Whole block quote.
      *
      * ```markdown
      * > | > a
      *     ^^^
      * > | b
      *     ^
      * ```
      */
    var blockquote: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.blockquote
    
    /**
      * Whole code (fenced).
      *
      * ````markdown
      * > | ```js
      *     ^^^^^
      * > | console.log(1)
      *     ^^^^^^^^^^^^^^
      * > | ```
      *     ^^^
      * ````
      */
    var codeFenced: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFenced
    
    /**
      * Code (fenced) language, when fenced with grave accents.
      *
      * ````markdown
      * > | ```js
      *        ^^
      *   | console.log(1)
      *   | ```
      * ````
      */
    var codeFencedLangGraveAccent: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangGraveAccent
    
    /**
      * Code (fenced) language, when fenced with tildes.
      *
      * ````markdown
      * > | ~~~js
      *        ^^
      *   | console.log(1)
      *   | ~~~
      * ````
      */
    var codeFencedLangTilde: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedLangTilde
    
    /**
      * Code (fenced) meta string, when fenced with grave accents.
      *
      * ````markdown
      * > | ```js eval
      *           ^^^^
      *   | console.log(1)
      *   | ```
      * ````
      */
    var codeFencedMetaGraveAccent: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaGraveAccent
    
    /**
      * Code (fenced) meta string, when fenced with tildes.
      *
      * ````markdown
      * > | ~~~js eval
      *           ^^^^
      *   | console.log(1)
      *   | ~~~
      * ````
      */
    var codeFencedMetaTilde: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeFencedMetaTilde
    
    /**
      * Whole code (indented).
      *
      * ```markdown
      * ␠␠␠␠console.log(1)
      * ^^^^^^^^^^^^^^^^^^
      * ```
      */
    var codeIndented: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.codeIndented
    
    /**
      * Whole definition.
      *
      * ```markdown
      * > | [a]: b "c"
      *     ^^^^^^^^^^
      * ```
      */
    var definition: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.definition
    
    /**
      * Destination (literal) (occurs in definition, image, link).
      *
      * ```markdown
      * > | [a]: <b> "c"
      *          ^^^
      * > | a ![b](<c> "d") e
      *            ^^^
      * ```
      */
    var destinationLiteral: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationLiteral
    
    /**
      * Destination (raw) (occurs in definition, image, link).
      *
      * ```markdown
      * > | [a]: b "c"
      *          ^
      * > | a ![b](c "d") e
      *            ^
      * ```
      */
    var destinationRaw: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.destinationRaw
    
    /**
      * Emphasis.
      *
      * ```markdown
      * > | *a*
      *     ^^^
      * ```
      */
    var emphasis: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.emphasis
    
    /**
      * Whole heading (atx).
      *
      * ```markdown
      * > | # alpha
      *     ^^^^^^^
      * ```
      */
    var headingAtx: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingAtx
    
    /**
      * Whole heading (setext).
      *
      * ```markdown
      * > | alpha
      *     ^^^^^
      * > | =====
      *     ^^^^^
      * ```
      */
    var headingSetext: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.headingSetext
    
    /**
      * Whole image.
      *
      * ```markdown
      * > | ![a](b)
      *     ^^^^^^^
      * > | ![c]
      *     ^^^^
      * ```
      */
    var image: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.image
    
    /**
      * Whole image reference.
      *
      * ```markdown
      * > | ![a]
      *     ^^^^
      * ```
      */
    var imageReference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.imageReference
    
    /**
      * Label (occurs in definitions, image reference, image, link reference,
      * link).
      *
      * ```markdown
      * > | [a]: b "c"
      *     ^^^
      * > | a [b] c
      *       ^^^
      * > | a ![b][c] d
      *       ^^^^
      * > | a [b](c) d
      *       ^^^
      * ```
      */
    var label: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.label
    
    /**
      * Whole link.
      *
      * ```markdown
      * > | [a](b)
      *     ^^^^^^
      * > | [c]
      *     ^^^
      * ```
      */
    var link: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.link
    
    /**
      * Whole link reference.
      *
      * ```markdown
      * > | [a]
      *     ^^^
      * ```
      */
    var linkReference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.linkReference
    
    /**
      * List.
      *
      * ```markdown
      * > | * a
      *     ^^^
      * > | 1. b
      *     ^^^^
      * ```
      */
    var list: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.list
    
    /**
      * List item.
      *
      * ```markdown
      * > | * a
      *     ^^^
      * > | 1. b
      *     ^^^^
      * ```
      */
    var listItem: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.listItem
    
    /**
      * Paragraph.
      *
      * ```markdown
      * > | a b
      *     ^^^
      * > | c.
      *     ^^
      * ```
      */
    var paragraph: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.paragraph
    
    /**
      * Phrasing (occurs in headings, paragraphs, etc).
      *
      * ```markdown
      * > | a
      *     ^
      * ```
      */
    var phrasing: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.phrasing
    
    /**
      * Reference (occurs in image, link).
      *
      * ```markdown
      * > | [a][]
      *        ^^
      * ```
      */
    var reference: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.reference
    
    /**
      * Strong.
      *
      * ```markdown
      * > | **a**
      *     ^^^^^
      * ```
      */
    var strong: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.strong
    
    /**
      * Title using single quotes (occurs in definition, image, link).
      *
      * ```markdown
      * > | [a](b 'c')
      *           ^^^
      * ```
      */
    var titleApostrophe: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleApostrophe
    
    /**
      * Title using double quotes (occurs in definition, image, link).
      *
      * ```markdown
      * > | [a](b "c")
      *           ^^^
      * ```
      */
    var titleQuote: typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.titleQuote
  }
  object ConstructNameMap {
    
    inline def apply(): ConstructNameMap = {
      val __obj = js.Dynamic.literal(autolink = "autolink", blockquote = "blockquote", codeFenced = "codeFenced", codeFencedLangGraveAccent = "codeFencedLangGraveAccent", codeFencedLangTilde = "codeFencedLangTilde", codeFencedMetaGraveAccent = "codeFencedMetaGraveAccent", codeFencedMetaTilde = "codeFencedMetaTilde", codeIndented = "codeIndented", definition = "definition", destinationLiteral = "destinationLiteral", destinationRaw = "destinationRaw", emphasis = "emphasis", headingAtx = "headingAtx", headingSetext = "headingSetext", image = "image", imageReference = "imageReference", label = "label", link = "link", linkReference = "linkReference", list = "list", listItem = "listItem", paragraph = "paragraph", phrasing = "phrasing", reference = "reference", strong = "strong", titleApostrophe = "titleApostrophe", titleQuote = "titleQuote")
      __obj.asInstanceOf[ConstructNameMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructNameMap] (val x: Self) extends AnyVal {
      
      inline def setAutolink(value: autolink): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      inline def setBlockquote(value: blockquote): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setCodeFenced(value: codeFenced): Self = StObject.set(x, "codeFenced", value.asInstanceOf[js.Any])
      
      inline def setCodeFencedLangGraveAccent(value: codeFencedLangGraveAccent): Self = StObject.set(x, "codeFencedLangGraveAccent", value.asInstanceOf[js.Any])
      
      inline def setCodeFencedLangTilde(value: codeFencedLangTilde): Self = StObject.set(x, "codeFencedLangTilde", value.asInstanceOf[js.Any])
      
      inline def setCodeFencedMetaGraveAccent(value: codeFencedMetaGraveAccent): Self = StObject.set(x, "codeFencedMetaGraveAccent", value.asInstanceOf[js.Any])
      
      inline def setCodeFencedMetaTilde(value: codeFencedMetaTilde): Self = StObject.set(x, "codeFencedMetaTilde", value.asInstanceOf[js.Any])
      
      inline def setCodeIndented(value: codeIndented): Self = StObject.set(x, "codeIndented", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDestinationLiteral(value: destinationLiteral): Self = StObject.set(x, "destinationLiteral", value.asInstanceOf[js.Any])
      
      inline def setDestinationRaw(value: destinationRaw): Self = StObject.set(x, "destinationRaw", value.asInstanceOf[js.Any])
      
      inline def setEmphasis(value: emphasis): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setHeadingAtx(value: headingAtx): Self = StObject.set(x, "headingAtx", value.asInstanceOf[js.Any])
      
      inline def setHeadingSetext(value: headingSetext): Self = StObject.set(x, "headingSetext", value.asInstanceOf[js.Any])
      
      inline def setImage(value: image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageReference(value: imageReference): Self = StObject.set(x, "imageReference", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLink(value: link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkReference(value: linkReference): Self = StObject.set(x, "linkReference", value.asInstanceOf[js.Any])
      
      inline def setList(value: list): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListItem(value: listItem): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setParagraph(value: paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setPhrasing(value: phrasing): Self = StObject.set(x, "phrasing", value.asInstanceOf[js.Any])
      
      inline def setReference(value: reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setTitleApostrophe(value: titleApostrophe): Self = StObject.set(x, "titleApostrophe", value.asInstanceOf[js.Any])
      
      inline def setTitleQuote(value: titleQuote): Self = StObject.set(x, "titleQuote", value.asInstanceOf[js.Any])
    }
  }
  
  type Context = State
  
  type SafeOptions = Info
}
