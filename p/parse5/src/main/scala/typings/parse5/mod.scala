package typings.parse5

import typings.parse5.distCommonErrorCodesMod.ERR
import typings.parse5.distCommonHtmlMod.NS
import typings.parse5.distCommonHtmlMod.TAG_ID
import typings.parse5.distCommonTokenMod.Attribute
import typings.parse5.distCommonTokenMod.TagToken
import typings.parse5.distParserMod.ParserOptions
import typings.parse5.distSerializerMod.SerializerOptions
import typings.parse5.distTokenizerMod.TokenHandler
import typings.parse5.distTokenizerMod.TokenizerOptions
import typings.parse5.distTreeAdaptersDefaultMod.DefaultTreeAdapterMap
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.parse5.parse5Ints.`0`
import typings.parse5.parse5Ints.`1`
import typings.parse5.parse5Ints.`2`
import typings.parse5.parse5Ints.`3`
import typings.parse5.parse5Ints.`4`
import typings.parse5.parse5Ints.`68`
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("parse5", "ErrorCodes")
  @js.native
  object ErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ERR & String] = js.native
    
    /* "abandoned-head-element-child" */ val abandonedHeadElementChild: typings.parse5.distCommonErrorCodesMod.ERR.abandonedHeadElementChild & String = js.native
    
    /* "abrupt-closing-of-empty-comment" */ val abruptClosingOfEmptyComment: typings.parse5.distCommonErrorCodesMod.ERR.abruptClosingOfEmptyComment & String = js.native
    
    /* "abrupt-doctype-public-identifier" */ val abruptDoctypePublicIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.abruptDoctypePublicIdentifier & String = js.native
    
    /* "abrupt-doctype-system-identifier" */ val abruptDoctypeSystemIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.abruptDoctypeSystemIdentifier & String = js.native
    
    /* "absence-of-digits-in-numeric-character-reference" */ val absenceOfDigitsInNumericCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.absenceOfDigitsInNumericCharacterReference & String = js.native
    
    /* "cdata-in-html-content" */ val cdataInHtmlContent: typings.parse5.distCommonErrorCodesMod.ERR.cdataInHtmlContent & String = js.native
    
    /* "character-reference-outside-unicode-range" */ val characterReferenceOutsideUnicodeRange: typings.parse5.distCommonErrorCodesMod.ERR.characterReferenceOutsideUnicodeRange & String = js.native
    
    /* "closing-of-element-with-open-child-elements" */ val closingOfElementWithOpenChildElements: typings.parse5.distCommonErrorCodesMod.ERR.closingOfElementWithOpenChildElements & String = js.native
    
    /* "control-character-in-input-stream" */ val controlCharacterInInputStream: typings.parse5.distCommonErrorCodesMod.ERR.controlCharacterInInputStream & String = js.native
    
    /* "control-character-reference" */ val controlCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.controlCharacterReference & String = js.native
    
    /* "disallowed-content-in-noscript-in-head" */ val disallowedContentInNoscriptInHead: typings.parse5.distCommonErrorCodesMod.ERR.disallowedContentInNoscriptInHead & String = js.native
    
    /* "duplicate-attribute" */ val duplicateAttribute: typings.parse5.distCommonErrorCodesMod.ERR.duplicateAttribute & String = js.native
    
    /* "end-tag-with-attributes" */ val endTagWithAttributes: typings.parse5.distCommonErrorCodesMod.ERR.endTagWithAttributes & String = js.native
    
    /* "end-tag-with-trailing-solidus" */ val endTagWithTrailingSolidus: typings.parse5.distCommonErrorCodesMod.ERR.endTagWithTrailingSolidus & String = js.native
    
    /* "end-tag-without-matching-open-element" */ val endTagWithoutMatchingOpenElement: typings.parse5.distCommonErrorCodesMod.ERR.endTagWithoutMatchingOpenElement & String = js.native
    
    /* "eof-before-tag-name" */ val eofBeforeTagName: typings.parse5.distCommonErrorCodesMod.ERR.eofBeforeTagName & String = js.native
    
    /* "eof-in-cdata" */ val eofInCdata: typings.parse5.distCommonErrorCodesMod.ERR.eofInCdata & String = js.native
    
    /* "eof-in-comment" */ val eofInComment: typings.parse5.distCommonErrorCodesMod.ERR.eofInComment & String = js.native
    
    /* "eof-in-doctype" */ val eofInDoctype: typings.parse5.distCommonErrorCodesMod.ERR.eofInDoctype & String = js.native
    
    /* "eof-in-element-that-can-contain-only-text" */ val eofInElementThatCanContainOnlyText: typings.parse5.distCommonErrorCodesMod.ERR.eofInElementThatCanContainOnlyText & String = js.native
    
    /* "eof-in-script-html-comment-like-text" */ val eofInScriptHtmlCommentLikeText: typings.parse5.distCommonErrorCodesMod.ERR.eofInScriptHtmlCommentLikeText & String = js.native
    
    /* "eof-in-tag" */ val eofInTag: typings.parse5.distCommonErrorCodesMod.ERR.eofInTag & String = js.native
    
    /* "incorrectly-closed-comment" */ val incorrectlyClosedComment: typings.parse5.distCommonErrorCodesMod.ERR.incorrectlyClosedComment & String = js.native
    
    /* "incorrectly-opened-comment" */ val incorrectlyOpenedComment: typings.parse5.distCommonErrorCodesMod.ERR.incorrectlyOpenedComment & String = js.native
    
    /* "invalid-character-sequence-after-doctype-name" */ val invalidCharacterSequenceAfterDoctypeName: typings.parse5.distCommonErrorCodesMod.ERR.invalidCharacterSequenceAfterDoctypeName & String = js.native
    
    /* "invalid-first-character-of-tag-name" */ val invalidFirstCharacterOfTagName: typings.parse5.distCommonErrorCodesMod.ERR.invalidFirstCharacterOfTagName & String = js.native
    
    /* "misplaced-doctype" */ val misplacedDoctype: typings.parse5.distCommonErrorCodesMod.ERR.misplacedDoctype & String = js.native
    
    /* "misplaced-start-tag-for-head-element" */ val misplacedStartTagForHeadElement: typings.parse5.distCommonErrorCodesMod.ERR.misplacedStartTagForHeadElement & String = js.native
    
    /* "missing-attribute-value" */ val missingAttributeValue: typings.parse5.distCommonErrorCodesMod.ERR.missingAttributeValue & String = js.native
    
    /* "missing-doctype" */ val missingDoctype: typings.parse5.distCommonErrorCodesMod.ERR.missingDoctype & String = js.native
    
    /* "missing-doctype-name" */ val missingDoctypeName: typings.parse5.distCommonErrorCodesMod.ERR.missingDoctypeName & String = js.native
    
    /* "missing-doctype-public-identifier" */ val missingDoctypePublicIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.missingDoctypePublicIdentifier & String = js.native
    
    /* "missing-doctype-system-identifier" */ val missingDoctypeSystemIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.missingDoctypeSystemIdentifier & String = js.native
    
    /* "missing-end-tag-name" */ val missingEndTagName: typings.parse5.distCommonErrorCodesMod.ERR.missingEndTagName & String = js.native
    
    /* "missing-quote-before-doctype-public-identifier" */ val missingQuoteBeforeDoctypePublicIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.missingQuoteBeforeDoctypePublicIdentifier & String = js.native
    
    /* "missing-quote-before-doctype-system-identifier" */ val missingQuoteBeforeDoctypeSystemIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.missingQuoteBeforeDoctypeSystemIdentifier & String = js.native
    
    /* "missing-semicolon-after-character-reference" */ val missingSemicolonAfterCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.missingSemicolonAfterCharacterReference & String = js.native
    
    /* "missing-whitespace-after-doctype-public-keyword" */ val missingWhitespaceAfterDoctypePublicKeyword: typings.parse5.distCommonErrorCodesMod.ERR.missingWhitespaceAfterDoctypePublicKeyword & String = js.native
    
    /* "missing-whitespace-after-doctype-system-keyword" */ val missingWhitespaceAfterDoctypeSystemKeyword: typings.parse5.distCommonErrorCodesMod.ERR.missingWhitespaceAfterDoctypeSystemKeyword & String = js.native
    
    /* "missing-whitespace-before-doctype-name" */ val missingWhitespaceBeforeDoctypeName: typings.parse5.distCommonErrorCodesMod.ERR.missingWhitespaceBeforeDoctypeName & String = js.native
    
    /* "missing-whitespace-between-attributes" */ val missingWhitespaceBetweenAttributes: typings.parse5.distCommonErrorCodesMod.ERR.missingWhitespaceBetweenAttributes & String = js.native
    
    /* "missing-whitespace-between-doctype-public-and-system-identifiers" */ val missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers: typings.parse5.distCommonErrorCodesMod.ERR.missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers & String = js.native
    
    /* "nested-comment" */ val nestedComment: typings.parse5.distCommonErrorCodesMod.ERR.nestedComment & String = js.native
    
    /* "nested-noscript-in-head" */ val nestedNoscriptInHead: typings.parse5.distCommonErrorCodesMod.ERR.nestedNoscriptInHead & String = js.native
    
    /* "non-conforming-doctype" */ val nonConformingDoctype: typings.parse5.distCommonErrorCodesMod.ERR.nonConformingDoctype & String = js.native
    
    /* "non-void-html-element-start-tag-with-trailing-solidus" */ val nonVoidHtmlElementStartTagWithTrailingSolidus: typings.parse5.distCommonErrorCodesMod.ERR.nonVoidHtmlElementStartTagWithTrailingSolidus & String = js.native
    
    /* "noncharacter-character-reference" */ val noncharacterCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.noncharacterCharacterReference & String = js.native
    
    /* "noncharacter-in-input-stream" */ val noncharacterInInputStream: typings.parse5.distCommonErrorCodesMod.ERR.noncharacterInInputStream & String = js.native
    
    /* "null-character-reference" */ val nullCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.nullCharacterReference & String = js.native
    
    /* "open-elements-left-after-eof" */ val openElementsLeftAfterEof: typings.parse5.distCommonErrorCodesMod.ERR.openElementsLeftAfterEof & String = js.native
    
    /* "surrogate-character-reference" */ val surrogateCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.surrogateCharacterReference & String = js.native
    
    /* "surrogate-in-input-stream" */ val surrogateInInputStream: typings.parse5.distCommonErrorCodesMod.ERR.surrogateInInputStream & String = js.native
    
    /* "unexpected-character-after-doctype-system-identifier" */ val unexpectedCharacterAfterDoctypeSystemIdentifier: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedCharacterAfterDoctypeSystemIdentifier & String = js.native
    
    /* "unexpected-character-in-attribute-name" */ val unexpectedCharacterInAttributeName: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedCharacterInAttributeName & String = js.native
    
    /* "unexpected-character-in-unquoted-attribute-value" */ val unexpectedCharacterInUnquotedAttributeValue: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedCharacterInUnquotedAttributeValue & String = js.native
    
    /* "unexpected-equals-sign-before-attribute-name" */ val unexpectedEqualsSignBeforeAttributeName: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedEqualsSignBeforeAttributeName & String = js.native
    
    /* "unexpected-null-character" */ val unexpectedNullCharacter: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedNullCharacter & String = js.native
    
    /* "unexpected-question-mark-instead-of-tag-name" */ val unexpectedQuestionMarkInsteadOfTagName: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedQuestionMarkInsteadOfTagName & String = js.native
    
    /* "unexpected-solidus-in-tag" */ val unexpectedSolidusInTag: typings.parse5.distCommonErrorCodesMod.ERR.unexpectedSolidusInTag & String = js.native
    
    /* "unknown-named-character-reference" */ val unknownNamedCharacterReference: typings.parse5.distCommonErrorCodesMod.ERR.unknownNamedCharacterReference & String = js.native
  }
  
  @JSImport("parse5", "Parser")
  @js.native
  open class Parser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] ()
    extends typings.parse5.distParserMod.Parser[T] {
    def this(options: ParserOptions[T]) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("parse5", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): typings.parse5.distParserMod.Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")().asInstanceOf[typings.parse5.distParserMod.Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, options: ParserOptions[T]): typings.parse5.distParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.distParserMod.Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Unit, options: ParserOptions[T]): typings.parse5.distParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.distParserMod.Parser[T]]
    
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): typings.parse5.distParserMod.Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any]).asInstanceOf[typings.parse5.distParserMod.Parser[T]]
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      options: ParserOptions[T]
    ): typings.parse5.distParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.parse5.distParserMod.Parser[T]]
    
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  }
  
  object Token {
    
    @JSImport("parse5", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5", "Token.TokenType")
    @js.native
    object TokenType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.parse5.distCommonTokenMod.TokenType & Double] = js.native
      
      /* 0 */ val CHARACTER: typings.parse5.distCommonTokenMod.TokenType.CHARACTER & Double = js.native
      
      /* 5 */ val COMMENT: typings.parse5.distCommonTokenMod.TokenType.COMMENT & Double = js.native
      
      /* 6 */ val DOCTYPE: typings.parse5.distCommonTokenMod.TokenType.DOCTYPE & Double = js.native
      
      /* 4 */ val END_TAG: typings.parse5.distCommonTokenMod.TokenType.END_TAG & Double = js.native
      
      /* 7 */ val EOF: typings.parse5.distCommonTokenMod.TokenType.EOF & Double = js.native
      
      /* 8 */ val HIBERNATION: typings.parse5.distCommonTokenMod.TokenType.HIBERNATION & Double = js.native
      
      /* 1 */ val NULL_CHARACTER: typings.parse5.distCommonTokenMod.TokenType.NULL_CHARACTER & Double = js.native
      
      /* 3 */ val START_TAG: typings.parse5.distCommonTokenMod.TokenType.START_TAG & Double = js.native
      
      /* 2 */ val WHITESPACE_CHARACTER: typings.parse5.distCommonTokenMod.TokenType.WHITESPACE_CHARACTER & Double = js.native
    }
    
    inline def getTokenAttr(token: TagToken, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAttr")(token.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
  @JSImport("parse5", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends typings.parse5.distTokenizerMod.Tokenizer {
    def this(options: TokenizerOptions, handler: TokenHandler) = this()
  }
  
  object TokenizerMode {
    
    @JSImport("parse5", "TokenizerMode.CDATA_SECTION")
    @js.native
    val CDATA_SECTION: `68` = js.native
    
    @JSImport("parse5", "TokenizerMode.DATA")
    @js.native
    val DATA: `0` = js.native
    
    @JSImport("parse5", "TokenizerMode.PLAINTEXT")
    @js.native
    val PLAINTEXT: `4` = js.native
    
    @JSImport("parse5", "TokenizerMode.RAWTEXT")
    @js.native
    val RAWTEXT: `2` = js.native
    
    @JSImport("parse5", "TokenizerMode.RCDATA")
    @js.native
    val RCDATA: `1` = js.native
    
    @JSImport("parse5", "TokenizerMode.SCRIPT_DATA")
    @js.native
    val SCRIPT_DATA: `3` = js.native
  }
  
  @JSImport("parse5", "defaultTreeAdapter")
  @js.native
  val defaultTreeAdapter: TreeAdapter[DefaultTreeAdapterMap] = js.native
  
  object foreignContent {
    
    @JSImport("parse5", "foreignContent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5", "foreignContent.SVG_TAG_NAMES_ADJUSTMENT_MAP")
    @js.native
    val SVG_TAG_NAMES_ADJUSTMENT_MAP: Map[String, String] = js.native
    
    inline def adjustTokenMathMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenMathMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenSVGAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenSVGTagName(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGTagName")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenXMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenXMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def causesExit(startTagToken: TagToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("causesExit")(startTagToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute], foreignNS: NS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], foreignNS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object html {
    
    @JSImport("parse5", "html")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5", "html.ATTRS")
    @js.native
    object ATTRS extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.parse5.distCommonHtmlMod.ATTRS & String] = js.native
      
      /* "action" */ val ACTION: typings.parse5.distCommonHtmlMod.ATTRS.ACTION & String = js.native
      
      /* "color" */ val COLOR: typings.parse5.distCommonHtmlMod.ATTRS.COLOR & String = js.native
      
      /* "encoding" */ val ENCODING: typings.parse5.distCommonHtmlMod.ATTRS.ENCODING & String = js.native
      
      /* "face" */ val FACE: typings.parse5.distCommonHtmlMod.ATTRS.FACE & String = js.native
      
      /* "name" */ val NAME: typings.parse5.distCommonHtmlMod.ATTRS.NAME & String = js.native
      
      /* "prompt" */ val PROMPT: typings.parse5.distCommonHtmlMod.ATTRS.PROMPT & String = js.native
      
      /* "size" */ val SIZE: typings.parse5.distCommonHtmlMod.ATTRS.SIZE & String = js.native
      
      /* "type" */ val TYPE: typings.parse5.distCommonHtmlMod.ATTRS.TYPE & String = js.native
    }
    
    @JSImport("parse5", "html.DOCUMENT_MODE")
    @js.native
    object DOCUMENT_MODE extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.parse5.distCommonHtmlMod.DOCUMENT_MODE & String] = js.native
      
      /* "limited-quirks" */ val LIMITED_QUIRKS: typings.parse5.distCommonHtmlMod.DOCUMENT_MODE.LIMITED_QUIRKS & String = js.native
      
      /* "no-quirks" */ val NO_QUIRKS: typings.parse5.distCommonHtmlMod.DOCUMENT_MODE.NO_QUIRKS & String = js.native
      
      /* "quirks" */ val QUIRKS: typings.parse5.distCommonHtmlMod.DOCUMENT_MODE.QUIRKS & String = js.native
    }
    
    @JSImport("parse5", "html.NS")
    @js.native
    object NS extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.parse5.distCommonHtmlMod.NS & String] = js.native
      
      /* "http://www.w3.org/1999/xhtml" */ val HTML: typings.parse5.distCommonHtmlMod.NS.HTML & String = js.native
      
      /* "http://www.w3.org/1998/Math/MathML" */ val MATHML: typings.parse5.distCommonHtmlMod.NS.MATHML & String = js.native
      
      /* "http://www.w3.org/2000/svg" */ val SVG: typings.parse5.distCommonHtmlMod.NS.SVG & String = js.native
      
      /* "http://www.w3.org/1999/xlink" */ val XLINK: typings.parse5.distCommonHtmlMod.NS.XLINK & String = js.native
      
      /* "http://www.w3.org/XML/1998/namespace" */ val XML: typings.parse5.distCommonHtmlMod.NS.XML & String = js.native
      
      /* "http://www.w3.org/2000/xmlns/" */ val XMLNS: typings.parse5.distCommonHtmlMod.NS.XMLNS & String = js.native
    }
    
    @JSImport("parse5", "html.SPECIAL_ELEMENTS")
    @js.native
    val SPECIAL_ELEMENTS: Record[NS, Set[TAG_ID]] = js.native
    
    @JSImport("parse5", "html.TAG_ID")
    @js.native
    object TAG_ID extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.parse5.distCommonHtmlMod.TAG_ID & Double] = js.native
      
      /* 1 */ val A: typings.parse5.distCommonHtmlMod.TAG_ID.A & Double = js.native
      
      /* 2 */ val ADDRESS: typings.parse5.distCommonHtmlMod.TAG_ID.ADDRESS & Double = js.native
      
      /* 3 */ val ANNOTATION_XML: typings.parse5.distCommonHtmlMod.TAG_ID.ANNOTATION_XML & Double = js.native
      
      /* 4 */ val APPLET: typings.parse5.distCommonHtmlMod.TAG_ID.APPLET & Double = js.native
      
      /* 5 */ val AREA: typings.parse5.distCommonHtmlMod.TAG_ID.AREA & Double = js.native
      
      /* 6 */ val ARTICLE: typings.parse5.distCommonHtmlMod.TAG_ID.ARTICLE & Double = js.native
      
      /* 7 */ val ASIDE: typings.parse5.distCommonHtmlMod.TAG_ID.ASIDE & Double = js.native
      
      /* 8 */ val B: typings.parse5.distCommonHtmlMod.TAG_ID.B & Double = js.native
      
      /* 9 */ val BASE: typings.parse5.distCommonHtmlMod.TAG_ID.BASE & Double = js.native
      
      /* 10 */ val BASEFONT: typings.parse5.distCommonHtmlMod.TAG_ID.BASEFONT & Double = js.native
      
      /* 11 */ val BGSOUND: typings.parse5.distCommonHtmlMod.TAG_ID.BGSOUND & Double = js.native
      
      /* 12 */ val BIG: typings.parse5.distCommonHtmlMod.TAG_ID.BIG & Double = js.native
      
      /* 13 */ val BLOCKQUOTE: typings.parse5.distCommonHtmlMod.TAG_ID.BLOCKQUOTE & Double = js.native
      
      /* 14 */ val BODY: typings.parse5.distCommonHtmlMod.TAG_ID.BODY & Double = js.native
      
      /* 15 */ val BR: typings.parse5.distCommonHtmlMod.TAG_ID.BR & Double = js.native
      
      /* 16 */ val BUTTON: typings.parse5.distCommonHtmlMod.TAG_ID.BUTTON & Double = js.native
      
      /* 17 */ val CAPTION: typings.parse5.distCommonHtmlMod.TAG_ID.CAPTION & Double = js.native
      
      /* 18 */ val CENTER: typings.parse5.distCommonHtmlMod.TAG_ID.CENTER & Double = js.native
      
      /* 19 */ val CODE: typings.parse5.distCommonHtmlMod.TAG_ID.CODE & Double = js.native
      
      /* 20 */ val COL: typings.parse5.distCommonHtmlMod.TAG_ID.COL & Double = js.native
      
      /* 21 */ val COLGROUP: typings.parse5.distCommonHtmlMod.TAG_ID.COLGROUP & Double = js.native
      
      /* 22 */ val DD: typings.parse5.distCommonHtmlMod.TAG_ID.DD & Double = js.native
      
      /* 23 */ val DESC: typings.parse5.distCommonHtmlMod.TAG_ID.DESC & Double = js.native
      
      /* 24 */ val DETAILS: typings.parse5.distCommonHtmlMod.TAG_ID.DETAILS & Double = js.native
      
      /* 25 */ val DIALOG: typings.parse5.distCommonHtmlMod.TAG_ID.DIALOG & Double = js.native
      
      /* 26 */ val DIR: typings.parse5.distCommonHtmlMod.TAG_ID.DIR & Double = js.native
      
      /* 27 */ val DIV: typings.parse5.distCommonHtmlMod.TAG_ID.DIV & Double = js.native
      
      /* 28 */ val DL: typings.parse5.distCommonHtmlMod.TAG_ID.DL & Double = js.native
      
      /* 29 */ val DT: typings.parse5.distCommonHtmlMod.TAG_ID.DT & Double = js.native
      
      /* 30 */ val EM: typings.parse5.distCommonHtmlMod.TAG_ID.EM & Double = js.native
      
      /* 31 */ val EMBED: typings.parse5.distCommonHtmlMod.TAG_ID.EMBED & Double = js.native
      
      /* 32 */ val FIELDSET: typings.parse5.distCommonHtmlMod.TAG_ID.FIELDSET & Double = js.native
      
      /* 33 */ val FIGCAPTION: typings.parse5.distCommonHtmlMod.TAG_ID.FIGCAPTION & Double = js.native
      
      /* 34 */ val FIGURE: typings.parse5.distCommonHtmlMod.TAG_ID.FIGURE & Double = js.native
      
      /* 35 */ val FONT: typings.parse5.distCommonHtmlMod.TAG_ID.FONT & Double = js.native
      
      /* 36 */ val FOOTER: typings.parse5.distCommonHtmlMod.TAG_ID.FOOTER & Double = js.native
      
      /* 37 */ val FOREIGN_OBJECT: typings.parse5.distCommonHtmlMod.TAG_ID.FOREIGN_OBJECT & Double = js.native
      
      /* 38 */ val FORM: typings.parse5.distCommonHtmlMod.TAG_ID.FORM & Double = js.native
      
      /* 39 */ val FRAME: typings.parse5.distCommonHtmlMod.TAG_ID.FRAME & Double = js.native
      
      /* 40 */ val FRAMESET: typings.parse5.distCommonHtmlMod.TAG_ID.FRAMESET & Double = js.native
      
      /* 41 */ val H1: typings.parse5.distCommonHtmlMod.TAG_ID.H1 & Double = js.native
      
      /* 42 */ val H2: typings.parse5.distCommonHtmlMod.TAG_ID.H2 & Double = js.native
      
      /* 43 */ val H3: typings.parse5.distCommonHtmlMod.TAG_ID.H3 & Double = js.native
      
      /* 44 */ val H4: typings.parse5.distCommonHtmlMod.TAG_ID.H4 & Double = js.native
      
      /* 45 */ val H5: typings.parse5.distCommonHtmlMod.TAG_ID.H5 & Double = js.native
      
      /* 46 */ val H6: typings.parse5.distCommonHtmlMod.TAG_ID.H6 & Double = js.native
      
      /* 47 */ val HEAD: typings.parse5.distCommonHtmlMod.TAG_ID.HEAD & Double = js.native
      
      /* 48 */ val HEADER: typings.parse5.distCommonHtmlMod.TAG_ID.HEADER & Double = js.native
      
      /* 49 */ val HGROUP: typings.parse5.distCommonHtmlMod.TAG_ID.HGROUP & Double = js.native
      
      /* 50 */ val HR: typings.parse5.distCommonHtmlMod.TAG_ID.HR & Double = js.native
      
      /* 51 */ val HTML: typings.parse5.distCommonHtmlMod.TAG_ID.HTML & Double = js.native
      
      /* 52 */ val I: typings.parse5.distCommonHtmlMod.TAG_ID.I & Double = js.native
      
      /* 56 */ val IFRAME: typings.parse5.distCommonHtmlMod.TAG_ID.IFRAME & Double = js.native
      
      /* 54 */ val IMAGE: typings.parse5.distCommonHtmlMod.TAG_ID.IMAGE & Double = js.native
      
      /* 53 */ val IMG: typings.parse5.distCommonHtmlMod.TAG_ID.IMG & Double = js.native
      
      /* 55 */ val INPUT: typings.parse5.distCommonHtmlMod.TAG_ID.INPUT & Double = js.native
      
      /* 57 */ val KEYGEN: typings.parse5.distCommonHtmlMod.TAG_ID.KEYGEN & Double = js.native
      
      /* 58 */ val LABEL: typings.parse5.distCommonHtmlMod.TAG_ID.LABEL & Double = js.native
      
      /* 59 */ val LI: typings.parse5.distCommonHtmlMod.TAG_ID.LI & Double = js.native
      
      /* 60 */ val LINK: typings.parse5.distCommonHtmlMod.TAG_ID.LINK & Double = js.native
      
      /* 61 */ val LISTING: typings.parse5.distCommonHtmlMod.TAG_ID.LISTING & Double = js.native
      
      /* 62 */ val MAIN: typings.parse5.distCommonHtmlMod.TAG_ID.MAIN & Double = js.native
      
      /* 63 */ val MALIGNMARK: typings.parse5.distCommonHtmlMod.TAG_ID.MALIGNMARK & Double = js.native
      
      /* 64 */ val MARQUEE: typings.parse5.distCommonHtmlMod.TAG_ID.MARQUEE & Double = js.native
      
      /* 65 */ val MATH: typings.parse5.distCommonHtmlMod.TAG_ID.MATH & Double = js.native
      
      /* 66 */ val MENU: typings.parse5.distCommonHtmlMod.TAG_ID.MENU & Double = js.native
      
      /* 67 */ val META: typings.parse5.distCommonHtmlMod.TAG_ID.META & Double = js.native
      
      /* 68 */ val MGLYPH: typings.parse5.distCommonHtmlMod.TAG_ID.MGLYPH & Double = js.native
      
      /* 69 */ val MI: typings.parse5.distCommonHtmlMod.TAG_ID.MI & Double = js.native
      
      /* 71 */ val MN: typings.parse5.distCommonHtmlMod.TAG_ID.MN & Double = js.native
      
      /* 70 */ val MO: typings.parse5.distCommonHtmlMod.TAG_ID.MO & Double = js.native
      
      /* 72 */ val MS: typings.parse5.distCommonHtmlMod.TAG_ID.MS & Double = js.native
      
      /* 73 */ val MTEXT: typings.parse5.distCommonHtmlMod.TAG_ID.MTEXT & Double = js.native
      
      /* 74 */ val NAV: typings.parse5.distCommonHtmlMod.TAG_ID.NAV & Double = js.native
      
      /* 75 */ val NOBR: typings.parse5.distCommonHtmlMod.TAG_ID.NOBR & Double = js.native
      
      /* 77 */ val NOEMBED: typings.parse5.distCommonHtmlMod.TAG_ID.NOEMBED & Double = js.native
      
      /* 76 */ val NOFRAMES: typings.parse5.distCommonHtmlMod.TAG_ID.NOFRAMES & Double = js.native
      
      /* 78 */ val NOSCRIPT: typings.parse5.distCommonHtmlMod.TAG_ID.NOSCRIPT & Double = js.native
      
      /* 79 */ val OBJECT: typings.parse5.distCommonHtmlMod.TAG_ID.OBJECT & Double = js.native
      
      /* 80 */ val OL: typings.parse5.distCommonHtmlMod.TAG_ID.OL & Double = js.native
      
      /* 81 */ val OPTGROUP: typings.parse5.distCommonHtmlMod.TAG_ID.OPTGROUP & Double = js.native
      
      /* 82 */ val OPTION: typings.parse5.distCommonHtmlMod.TAG_ID.OPTION & Double = js.native
      
      /* 83 */ val P: typings.parse5.distCommonHtmlMod.TAG_ID.P & Double = js.native
      
      /* 84 */ val PARAM: typings.parse5.distCommonHtmlMod.TAG_ID.PARAM & Double = js.native
      
      /* 85 */ val PLAINTEXT: typings.parse5.distCommonHtmlMod.TAG_ID.PLAINTEXT & Double = js.native
      
      /* 86 */ val PRE: typings.parse5.distCommonHtmlMod.TAG_ID.PRE & Double = js.native
      
      /* 87 */ val RB: typings.parse5.distCommonHtmlMod.TAG_ID.RB & Double = js.native
      
      /* 88 */ val RP: typings.parse5.distCommonHtmlMod.TAG_ID.RP & Double = js.native
      
      /* 89 */ val RT: typings.parse5.distCommonHtmlMod.TAG_ID.RT & Double = js.native
      
      /* 90 */ val RTC: typings.parse5.distCommonHtmlMod.TAG_ID.RTC & Double = js.native
      
      /* 91 */ val RUBY: typings.parse5.distCommonHtmlMod.TAG_ID.RUBY & Double = js.native
      
      /* 92 */ val S: typings.parse5.distCommonHtmlMod.TAG_ID.S & Double = js.native
      
      /* 93 */ val SCRIPT: typings.parse5.distCommonHtmlMod.TAG_ID.SCRIPT & Double = js.native
      
      /* 94 */ val SECTION: typings.parse5.distCommonHtmlMod.TAG_ID.SECTION & Double = js.native
      
      /* 95 */ val SELECT: typings.parse5.distCommonHtmlMod.TAG_ID.SELECT & Double = js.native
      
      /* 97 */ val SMALL: typings.parse5.distCommonHtmlMod.TAG_ID.SMALL & Double = js.native
      
      /* 96 */ val SOURCE: typings.parse5.distCommonHtmlMod.TAG_ID.SOURCE & Double = js.native
      
      /* 98 */ val SPAN: typings.parse5.distCommonHtmlMod.TAG_ID.SPAN & Double = js.native
      
      /* 99 */ val STRIKE: typings.parse5.distCommonHtmlMod.TAG_ID.STRIKE & Double = js.native
      
      /* 100 */ val STRONG: typings.parse5.distCommonHtmlMod.TAG_ID.STRONG & Double = js.native
      
      /* 101 */ val STYLE: typings.parse5.distCommonHtmlMod.TAG_ID.STYLE & Double = js.native
      
      /* 102 */ val SUB: typings.parse5.distCommonHtmlMod.TAG_ID.SUB & Double = js.native
      
      /* 103 */ val SUMMARY: typings.parse5.distCommonHtmlMod.TAG_ID.SUMMARY & Double = js.native
      
      /* 104 */ val SUP: typings.parse5.distCommonHtmlMod.TAG_ID.SUP & Double = js.native
      
      /* 119 */ val SVG: typings.parse5.distCommonHtmlMod.TAG_ID.SVG & Double = js.native
      
      /* 105 */ val TABLE: typings.parse5.distCommonHtmlMod.TAG_ID.TABLE & Double = js.native
      
      /* 106 */ val TBODY: typings.parse5.distCommonHtmlMod.TAG_ID.TBODY & Double = js.native
      
      /* 110 */ val TD: typings.parse5.distCommonHtmlMod.TAG_ID.TD & Double = js.native
      
      /* 107 */ val TEMPLATE: typings.parse5.distCommonHtmlMod.TAG_ID.TEMPLATE & Double = js.native
      
      /* 108 */ val TEXTAREA: typings.parse5.distCommonHtmlMod.TAG_ID.TEXTAREA & Double = js.native
      
      /* 109 */ val TFOOT: typings.parse5.distCommonHtmlMod.TAG_ID.TFOOT & Double = js.native
      
      /* 111 */ val TH: typings.parse5.distCommonHtmlMod.TAG_ID.TH & Double = js.native
      
      /* 112 */ val THEAD: typings.parse5.distCommonHtmlMod.TAG_ID.THEAD & Double = js.native
      
      /* 113 */ val TITLE: typings.parse5.distCommonHtmlMod.TAG_ID.TITLE & Double = js.native
      
      /* 114 */ val TR: typings.parse5.distCommonHtmlMod.TAG_ID.TR & Double = js.native
      
      /* 115 */ val TRACK: typings.parse5.distCommonHtmlMod.TAG_ID.TRACK & Double = js.native
      
      /* 116 */ val TT: typings.parse5.distCommonHtmlMod.TAG_ID.TT & Double = js.native
      
      /* 117 */ val U: typings.parse5.distCommonHtmlMod.TAG_ID.U & Double = js.native
      
      /* 118 */ val UL: typings.parse5.distCommonHtmlMod.TAG_ID.UL & Double = js.native
      
      /* 0 */ val UNKNOWN: typings.parse5.distCommonHtmlMod.TAG_ID.UNKNOWN & Double = js.native
      
      /* 120 */ val VAR: typings.parse5.distCommonHtmlMod.TAG_ID.VAR & Double = js.native
      
      /* 121 */ val WBR: typings.parse5.distCommonHtmlMod.TAG_ID.WBR & Double = js.native
      
      /* 122 */ val XMP: typings.parse5.distCommonHtmlMod.TAG_ID.XMP & Double = js.native
    }
    
    @JSImport("parse5", "html.TAG_NAMES")
    @js.native
    object TAG_NAMES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.parse5.distCommonHtmlMod.TAG_NAMES & String] = js.native
      
      /* "a" */ val A: typings.parse5.distCommonHtmlMod.TAG_NAMES.A & String = js.native
      
      /* "address" */ val ADDRESS: typings.parse5.distCommonHtmlMod.TAG_NAMES.ADDRESS & String = js.native
      
      /* "annotation-xml" */ val ANNOTATION_XML: typings.parse5.distCommonHtmlMod.TAG_NAMES.ANNOTATION_XML & String = js.native
      
      /* "applet" */ val APPLET: typings.parse5.distCommonHtmlMod.TAG_NAMES.APPLET & String = js.native
      
      /* "area" */ val AREA: typings.parse5.distCommonHtmlMod.TAG_NAMES.AREA & String = js.native
      
      /* "article" */ val ARTICLE: typings.parse5.distCommonHtmlMod.TAG_NAMES.ARTICLE & String = js.native
      
      /* "aside" */ val ASIDE: typings.parse5.distCommonHtmlMod.TAG_NAMES.ASIDE & String = js.native
      
      /* "b" */ val B: typings.parse5.distCommonHtmlMod.TAG_NAMES.B & String = js.native
      
      /* "base" */ val BASE: typings.parse5.distCommonHtmlMod.TAG_NAMES.BASE & String = js.native
      
      /* "basefont" */ val BASEFONT: typings.parse5.distCommonHtmlMod.TAG_NAMES.BASEFONT & String = js.native
      
      /* "bgsound" */ val BGSOUND: typings.parse5.distCommonHtmlMod.TAG_NAMES.BGSOUND & String = js.native
      
      /* "big" */ val BIG: typings.parse5.distCommonHtmlMod.TAG_NAMES.BIG & String = js.native
      
      /* "blockquote" */ val BLOCKQUOTE: typings.parse5.distCommonHtmlMod.TAG_NAMES.BLOCKQUOTE & String = js.native
      
      /* "body" */ val BODY: typings.parse5.distCommonHtmlMod.TAG_NAMES.BODY & String = js.native
      
      /* "br" */ val BR: typings.parse5.distCommonHtmlMod.TAG_NAMES.BR & String = js.native
      
      /* "button" */ val BUTTON: typings.parse5.distCommonHtmlMod.TAG_NAMES.BUTTON & String = js.native
      
      /* "caption" */ val CAPTION: typings.parse5.distCommonHtmlMod.TAG_NAMES.CAPTION & String = js.native
      
      /* "center" */ val CENTER: typings.parse5.distCommonHtmlMod.TAG_NAMES.CENTER & String = js.native
      
      /* "code" */ val CODE: typings.parse5.distCommonHtmlMod.TAG_NAMES.CODE & String = js.native
      
      /* "col" */ val COL: typings.parse5.distCommonHtmlMod.TAG_NAMES.COL & String = js.native
      
      /* "colgroup" */ val COLGROUP: typings.parse5.distCommonHtmlMod.TAG_NAMES.COLGROUP & String = js.native
      
      /* "dd" */ val DD: typings.parse5.distCommonHtmlMod.TAG_NAMES.DD & String = js.native
      
      /* "desc" */ val DESC: typings.parse5.distCommonHtmlMod.TAG_NAMES.DESC & String = js.native
      
      /* "details" */ val DETAILS: typings.parse5.distCommonHtmlMod.TAG_NAMES.DETAILS & String = js.native
      
      /* "dialog" */ val DIALOG: typings.parse5.distCommonHtmlMod.TAG_NAMES.DIALOG & String = js.native
      
      /* "dir" */ val DIR: typings.parse5.distCommonHtmlMod.TAG_NAMES.DIR & String = js.native
      
      /* "div" */ val DIV: typings.parse5.distCommonHtmlMod.TAG_NAMES.DIV & String = js.native
      
      /* "dl" */ val DL: typings.parse5.distCommonHtmlMod.TAG_NAMES.DL & String = js.native
      
      /* "dt" */ val DT: typings.parse5.distCommonHtmlMod.TAG_NAMES.DT & String = js.native
      
      /* "em" */ val EM: typings.parse5.distCommonHtmlMod.TAG_NAMES.EM & String = js.native
      
      /* "embed" */ val EMBED: typings.parse5.distCommonHtmlMod.TAG_NAMES.EMBED & String = js.native
      
      /* "fieldset" */ val FIELDSET: typings.parse5.distCommonHtmlMod.TAG_NAMES.FIELDSET & String = js.native
      
      /* "figcaption" */ val FIGCAPTION: typings.parse5.distCommonHtmlMod.TAG_NAMES.FIGCAPTION & String = js.native
      
      /* "figure" */ val FIGURE: typings.parse5.distCommonHtmlMod.TAG_NAMES.FIGURE & String = js.native
      
      /* "font" */ val FONT: typings.parse5.distCommonHtmlMod.TAG_NAMES.FONT & String = js.native
      
      /* "footer" */ val FOOTER: typings.parse5.distCommonHtmlMod.TAG_NAMES.FOOTER & String = js.native
      
      /* "foreignObject" */ val FOREIGN_OBJECT: typings.parse5.distCommonHtmlMod.TAG_NAMES.FOREIGN_OBJECT & String = js.native
      
      /* "form" */ val FORM: typings.parse5.distCommonHtmlMod.TAG_NAMES.FORM & String = js.native
      
      /* "frame" */ val FRAME: typings.parse5.distCommonHtmlMod.TAG_NAMES.FRAME & String = js.native
      
      /* "frameset" */ val FRAMESET: typings.parse5.distCommonHtmlMod.TAG_NAMES.FRAMESET & String = js.native
      
      /* "h1" */ val H1: typings.parse5.distCommonHtmlMod.TAG_NAMES.H1 & String = js.native
      
      /* "h2" */ val H2: typings.parse5.distCommonHtmlMod.TAG_NAMES.H2 & String = js.native
      
      /* "h3" */ val H3: typings.parse5.distCommonHtmlMod.TAG_NAMES.H3 & String = js.native
      
      /* "h4" */ val H4: typings.parse5.distCommonHtmlMod.TAG_NAMES.H4 & String = js.native
      
      /* "h5" */ val H5: typings.parse5.distCommonHtmlMod.TAG_NAMES.H5 & String = js.native
      
      /* "h6" */ val H6: typings.parse5.distCommonHtmlMod.TAG_NAMES.H6 & String = js.native
      
      /* "head" */ val HEAD: typings.parse5.distCommonHtmlMod.TAG_NAMES.HEAD & String = js.native
      
      /* "header" */ val HEADER: typings.parse5.distCommonHtmlMod.TAG_NAMES.HEADER & String = js.native
      
      /* "hgroup" */ val HGROUP: typings.parse5.distCommonHtmlMod.TAG_NAMES.HGROUP & String = js.native
      
      /* "hr" */ val HR: typings.parse5.distCommonHtmlMod.TAG_NAMES.HR & String = js.native
      
      /* "html" */ val HTML: typings.parse5.distCommonHtmlMod.TAG_NAMES.HTML & String = js.native
      
      /* "i" */ val I: typings.parse5.distCommonHtmlMod.TAG_NAMES.I & String = js.native
      
      /* "iframe" */ val IFRAME: typings.parse5.distCommonHtmlMod.TAG_NAMES.IFRAME & String = js.native
      
      /* "image" */ val IMAGE: typings.parse5.distCommonHtmlMod.TAG_NAMES.IMAGE & String = js.native
      
      /* "img" */ val IMG: typings.parse5.distCommonHtmlMod.TAG_NAMES.IMG & String = js.native
      
      /* "input" */ val INPUT: typings.parse5.distCommonHtmlMod.TAG_NAMES.INPUT & String = js.native
      
      /* "keygen" */ val KEYGEN: typings.parse5.distCommonHtmlMod.TAG_NAMES.KEYGEN & String = js.native
      
      /* "label" */ val LABEL: typings.parse5.distCommonHtmlMod.TAG_NAMES.LABEL & String = js.native
      
      /* "li" */ val LI: typings.parse5.distCommonHtmlMod.TAG_NAMES.LI & String = js.native
      
      /* "link" */ val LINK: typings.parse5.distCommonHtmlMod.TAG_NAMES.LINK & String = js.native
      
      /* "listing" */ val LISTING: typings.parse5.distCommonHtmlMod.TAG_NAMES.LISTING & String = js.native
      
      /* "main" */ val MAIN: typings.parse5.distCommonHtmlMod.TAG_NAMES.MAIN & String = js.native
      
      /* "malignmark" */ val MALIGNMARK: typings.parse5.distCommonHtmlMod.TAG_NAMES.MALIGNMARK & String = js.native
      
      /* "marquee" */ val MARQUEE: typings.parse5.distCommonHtmlMod.TAG_NAMES.MARQUEE & String = js.native
      
      /* "math" */ val MATH: typings.parse5.distCommonHtmlMod.TAG_NAMES.MATH & String = js.native
      
      /* "menu" */ val MENU: typings.parse5.distCommonHtmlMod.TAG_NAMES.MENU & String = js.native
      
      /* "meta" */ val META: typings.parse5.distCommonHtmlMod.TAG_NAMES.META & String = js.native
      
      /* "mglyph" */ val MGLYPH: typings.parse5.distCommonHtmlMod.TAG_NAMES.MGLYPH & String = js.native
      
      /* "mi" */ val MI: typings.parse5.distCommonHtmlMod.TAG_NAMES.MI & String = js.native
      
      /* "mn" */ val MN: typings.parse5.distCommonHtmlMod.TAG_NAMES.MN & String = js.native
      
      /* "mo" */ val MO: typings.parse5.distCommonHtmlMod.TAG_NAMES.MO & String = js.native
      
      /* "ms" */ val MS: typings.parse5.distCommonHtmlMod.TAG_NAMES.MS & String = js.native
      
      /* "mtext" */ val MTEXT: typings.parse5.distCommonHtmlMod.TAG_NAMES.MTEXT & String = js.native
      
      /* "nav" */ val NAV: typings.parse5.distCommonHtmlMod.TAG_NAMES.NAV & String = js.native
      
      /* "nobr" */ val NOBR: typings.parse5.distCommonHtmlMod.TAG_NAMES.NOBR & String = js.native
      
      /* "noembed" */ val NOEMBED: typings.parse5.distCommonHtmlMod.TAG_NAMES.NOEMBED & String = js.native
      
      /* "noframes" */ val NOFRAMES: typings.parse5.distCommonHtmlMod.TAG_NAMES.NOFRAMES & String = js.native
      
      /* "noscript" */ val NOSCRIPT: typings.parse5.distCommonHtmlMod.TAG_NAMES.NOSCRIPT & String = js.native
      
      /* "object" */ val OBJECT: typings.parse5.distCommonHtmlMod.TAG_NAMES.OBJECT & String = js.native
      
      /* "ol" */ val OL: typings.parse5.distCommonHtmlMod.TAG_NAMES.OL & String = js.native
      
      /* "optgroup" */ val OPTGROUP: typings.parse5.distCommonHtmlMod.TAG_NAMES.OPTGROUP & String = js.native
      
      /* "option" */ val OPTION: typings.parse5.distCommonHtmlMod.TAG_NAMES.OPTION & String = js.native
      
      /* "p" */ val P: typings.parse5.distCommonHtmlMod.TAG_NAMES.P & String = js.native
      
      /* "param" */ val PARAM: typings.parse5.distCommonHtmlMod.TAG_NAMES.PARAM & String = js.native
      
      /* "plaintext" */ val PLAINTEXT: typings.parse5.distCommonHtmlMod.TAG_NAMES.PLAINTEXT & String = js.native
      
      /* "pre" */ val PRE: typings.parse5.distCommonHtmlMod.TAG_NAMES.PRE & String = js.native
      
      /* "rb" */ val RB: typings.parse5.distCommonHtmlMod.TAG_NAMES.RB & String = js.native
      
      /* "rp" */ val RP: typings.parse5.distCommonHtmlMod.TAG_NAMES.RP & String = js.native
      
      /* "rt" */ val RT: typings.parse5.distCommonHtmlMod.TAG_NAMES.RT & String = js.native
      
      /* "rtc" */ val RTC: typings.parse5.distCommonHtmlMod.TAG_NAMES.RTC & String = js.native
      
      /* "ruby" */ val RUBY: typings.parse5.distCommonHtmlMod.TAG_NAMES.RUBY & String = js.native
      
      /* "s" */ val S: typings.parse5.distCommonHtmlMod.TAG_NAMES.S & String = js.native
      
      /* "script" */ val SCRIPT: typings.parse5.distCommonHtmlMod.TAG_NAMES.SCRIPT & String = js.native
      
      /* "section" */ val SECTION: typings.parse5.distCommonHtmlMod.TAG_NAMES.SECTION & String = js.native
      
      /* "select" */ val SELECT: typings.parse5.distCommonHtmlMod.TAG_NAMES.SELECT & String = js.native
      
      /* "small" */ val SMALL: typings.parse5.distCommonHtmlMod.TAG_NAMES.SMALL & String = js.native
      
      /* "source" */ val SOURCE: typings.parse5.distCommonHtmlMod.TAG_NAMES.SOURCE & String = js.native
      
      /* "span" */ val SPAN: typings.parse5.distCommonHtmlMod.TAG_NAMES.SPAN & String = js.native
      
      /* "strike" */ val STRIKE: typings.parse5.distCommonHtmlMod.TAG_NAMES.STRIKE & String = js.native
      
      /* "strong" */ val STRONG: typings.parse5.distCommonHtmlMod.TAG_NAMES.STRONG & String = js.native
      
      /* "style" */ val STYLE: typings.parse5.distCommonHtmlMod.TAG_NAMES.STYLE & String = js.native
      
      /* "sub" */ val SUB: typings.parse5.distCommonHtmlMod.TAG_NAMES.SUB & String = js.native
      
      /* "summary" */ val SUMMARY: typings.parse5.distCommonHtmlMod.TAG_NAMES.SUMMARY & String = js.native
      
      /* "sup" */ val SUP: typings.parse5.distCommonHtmlMod.TAG_NAMES.SUP & String = js.native
      
      /* "svg" */ val SVG: typings.parse5.distCommonHtmlMod.TAG_NAMES.SVG & String = js.native
      
      /* "table" */ val TABLE: typings.parse5.distCommonHtmlMod.TAG_NAMES.TABLE & String = js.native
      
      /* "tbody" */ val TBODY: typings.parse5.distCommonHtmlMod.TAG_NAMES.TBODY & String = js.native
      
      /* "td" */ val TD: typings.parse5.distCommonHtmlMod.TAG_NAMES.TD & String = js.native
      
      /* "template" */ val TEMPLATE: typings.parse5.distCommonHtmlMod.TAG_NAMES.TEMPLATE & String = js.native
      
      /* "textarea" */ val TEXTAREA: typings.parse5.distCommonHtmlMod.TAG_NAMES.TEXTAREA & String = js.native
      
      /* "tfoot" */ val TFOOT: typings.parse5.distCommonHtmlMod.TAG_NAMES.TFOOT & String = js.native
      
      /* "th" */ val TH: typings.parse5.distCommonHtmlMod.TAG_NAMES.TH & String = js.native
      
      /* "thead" */ val THEAD: typings.parse5.distCommonHtmlMod.TAG_NAMES.THEAD & String = js.native
      
      /* "title" */ val TITLE: typings.parse5.distCommonHtmlMod.TAG_NAMES.TITLE & String = js.native
      
      /* "tr" */ val TR: typings.parse5.distCommonHtmlMod.TAG_NAMES.TR & String = js.native
      
      /* "track" */ val TRACK: typings.parse5.distCommonHtmlMod.TAG_NAMES.TRACK & String = js.native
      
      /* "tt" */ val TT: typings.parse5.distCommonHtmlMod.TAG_NAMES.TT & String = js.native
      
      /* "u" */ val U: typings.parse5.distCommonHtmlMod.TAG_NAMES.U & String = js.native
      
      /* "ul" */ val UL: typings.parse5.distCommonHtmlMod.TAG_NAMES.UL & String = js.native
      
      /* "var" */ val VAR: typings.parse5.distCommonHtmlMod.TAG_NAMES.VAR & String = js.native
      
      /* "wbr" */ val WBR: typings.parse5.distCommonHtmlMod.TAG_NAMES.WBR & String = js.native
      
      /* "xmp" */ val XMP: typings.parse5.distCommonHtmlMod.TAG_NAMES.XMP & String = js.native
    }
    
    inline def getTagID(tagName: String): TAG_ID = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagID")(tagName.asInstanceOf[js.Any]).asInstanceOf[TAG_ID]
    
    inline def hasUnescapedText(tn: String, scriptingEnabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasUnescapedText")(tn.asInstanceOf[js.Any], scriptingEnabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNumberedHeader(tn: TAG_ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberedHeader")(tn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  
  inline def parseFragment_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
    html: String,
    options: ParserOptions[T]
  ): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
