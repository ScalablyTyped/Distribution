package typings.parse5

import typings.parse5.distCjsCommonErrorCodesMod.ParserError
import typings.parse5.distCjsCommonErrorCodesMod.ParserErrorHandler
import typings.parse5.distCjsCommonTokenMod.CharacterToken
import typings.parse5.distCjsCommonTokenMod.CommentToken
import typings.parse5.distCjsCommonTokenMod.DoctypeToken
import typings.parse5.distCjsCommonTokenMod.EOFToken
import typings.parse5.distCjsCommonTokenMod.TagToken
import typings.parse5.distCjsTokenizerPreprocessorMod.Preprocessor
import typings.parse5.parse5Ints.`0`
import typings.parse5.parse5Ints.`10`
import typings.parse5.parse5Ints.`11`
import typings.parse5.parse5Ints.`12`
import typings.parse5.parse5Ints.`13`
import typings.parse5.parse5Ints.`14`
import typings.parse5.parse5Ints.`15`
import typings.parse5.parse5Ints.`16`
import typings.parse5.parse5Ints.`17`
import typings.parse5.parse5Ints.`18`
import typings.parse5.parse5Ints.`19`
import typings.parse5.parse5Ints.`1`
import typings.parse5.parse5Ints.`20`
import typings.parse5.parse5Ints.`21`
import typings.parse5.parse5Ints.`22`
import typings.parse5.parse5Ints.`23`
import typings.parse5.parse5Ints.`24`
import typings.parse5.parse5Ints.`25`
import typings.parse5.parse5Ints.`26`
import typings.parse5.parse5Ints.`27`
import typings.parse5.parse5Ints.`28`
import typings.parse5.parse5Ints.`29`
import typings.parse5.parse5Ints.`2`
import typings.parse5.parse5Ints.`30`
import typings.parse5.parse5Ints.`31`
import typings.parse5.parse5Ints.`32`
import typings.parse5.parse5Ints.`33`
import typings.parse5.parse5Ints.`34`
import typings.parse5.parse5Ints.`35`
import typings.parse5.parse5Ints.`36`
import typings.parse5.parse5Ints.`37`
import typings.parse5.parse5Ints.`38`
import typings.parse5.parse5Ints.`39`
import typings.parse5.parse5Ints.`3`
import typings.parse5.parse5Ints.`40`
import typings.parse5.parse5Ints.`41`
import typings.parse5.parse5Ints.`42`
import typings.parse5.parse5Ints.`43`
import typings.parse5.parse5Ints.`44`
import typings.parse5.parse5Ints.`45`
import typings.parse5.parse5Ints.`46`
import typings.parse5.parse5Ints.`47`
import typings.parse5.parse5Ints.`48`
import typings.parse5.parse5Ints.`49`
import typings.parse5.parse5Ints.`4`
import typings.parse5.parse5Ints.`50`
import typings.parse5.parse5Ints.`51`
import typings.parse5.parse5Ints.`52`
import typings.parse5.parse5Ints.`53`
import typings.parse5.parse5Ints.`54`
import typings.parse5.parse5Ints.`55`
import typings.parse5.parse5Ints.`56`
import typings.parse5.parse5Ints.`57`
import typings.parse5.parse5Ints.`58`
import typings.parse5.parse5Ints.`59`
import typings.parse5.parse5Ints.`5`
import typings.parse5.parse5Ints.`60`
import typings.parse5.parse5Ints.`61`
import typings.parse5.parse5Ints.`62`
import typings.parse5.parse5Ints.`63`
import typings.parse5.parse5Ints.`64`
import typings.parse5.parse5Ints.`65`
import typings.parse5.parse5Ints.`66`
import typings.parse5.parse5Ints.`67`
import typings.parse5.parse5Ints.`68`
import typings.parse5.parse5Ints.`69`
import typings.parse5.parse5Ints.`6`
import typings.parse5.parse5Ints.`70`
import typings.parse5.parse5Ints.`71`
import typings.parse5.parse5Ints.`72`
import typings.parse5.parse5Ints.`73`
import typings.parse5.parse5Ints.`74`
import typings.parse5.parse5Ints.`75`
import typings.parse5.parse5Ints.`76`
import typings.parse5.parse5Ints.`77`
import typings.parse5.parse5Ints.`78`
import typings.parse5.parse5Ints.`7`
import typings.parse5.parse5Ints.`8`
import typings.parse5.parse5Ints.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTokenizerMod {
  
  @JSImport("parse5/dist/cjs/tokenizer", "Tokenizer")
  @js.native
  open class Tokenizer protected () extends StObject {
    def this(options: TokenizerOptions, handler: TokenHandler) = this()
    
    /* private */ var _advanceBy: Any = js.native
    
    /* private */ var _appendCharToCurrentCharacterToken: Any = js.native
    
    /* private */ var _callState: Any = js.native
    
    /* private */ var _consume: Any = js.native
    
    /* private */ var _consumeSequenceIfMatch: Any = js.native
    
    /* private */ var _createAttr: Any = js.native
    
    /* private */ var _createCharacterToken: Any = js.native
    
    /* private */ var _createCommentToken: Any = js.native
    
    /* private */ var _createDoctypeToken: Any = js.native
    
    /* private */ var _createEndTagToken: Any = js.native
    
    /* private */ var _createStartTagToken: Any = js.native
    
    /* private */ var _emitChars: Any = js.native
    
    /* private */ var _emitCodePoint: Any = js.native
    
    /* private */ var _emitCurrentCharacterToken: Any = js.native
    
    /* private */ var _emitEOFToken: Any = js.native
    
    /* private */ var _ensureHibernation: Any = js.native
    
    /* private */ var _err: Any = js.native
    
    /* private */ var _flushCodePointConsumedAsCharacterReference: Any = js.native
    
    /* private */ var _isCharacterReferenceInAttribute: Any = js.native
    
    /* private */ var _leaveAttrName: Any = js.native
    
    /* private */ var _leaveAttrValue: Any = js.native
    
    /* private */ var _matchNamedCharacterReference: Any = js.native
    
    /* private */ var _reconsumeInState: Any = js.native
    
    /* private */ var _runParsingLoop: Any = js.native
    
    /* private */ var _stateAfterAttributeName: Any = js.native
    
    /* private */ var _stateAfterAttributeValueQuoted: Any = js.native
    
    /* private */ var _stateAfterDoctypeName: Any = js.native
    
    /* private */ var _stateAfterDoctypePublicIdentifier: Any = js.native
    
    /* private */ var _stateAfterDoctypePublicKeyword: Any = js.native
    
    /* private */ var _stateAfterDoctypeSystemIdentifier: Any = js.native
    
    /* private */ var _stateAfterDoctypeSystemKeyword: Any = js.native
    
    /* private */ var _stateAmbiguousAmpersand: Any = js.native
    
    /* private */ var _stateAttributeName: Any = js.native
    
    /* private */ var _stateAttributeValueDoubleQuoted: Any = js.native
    
    /* private */ var _stateAttributeValueSingleQuoted: Any = js.native
    
    /* private */ var _stateAttributeValueUnquoted: Any = js.native
    
    /* private */ var _stateBeforeAttributeName: Any = js.native
    
    /* private */ var _stateBeforeAttributeValue: Any = js.native
    
    /* private */ var _stateBeforeDoctypeName: Any = js.native
    
    /* private */ var _stateBeforeDoctypePublicIdentifier: Any = js.native
    
    /* private */ var _stateBeforeDoctypeSystemIdentifier: Any = js.native
    
    /* private */ var _stateBetweenDoctypePublicAndSystemIdentifiers: Any = js.native
    
    /* private */ var _stateBogusComment: Any = js.native
    
    /* private */ var _stateBogusDoctype: Any = js.native
    
    /* private */ var _stateCdataSection: Any = js.native
    
    /* private */ var _stateCdataSectionBracket: Any = js.native
    
    /* private */ var _stateCdataSectionEnd: Any = js.native
    
    /* private */ var _stateCharacterReference: Any = js.native
    
    /* private */ var _stateComment: Any = js.native
    
    /* private */ var _stateCommentEnd: Any = js.native
    
    /* private */ var _stateCommentEndBang: Any = js.native
    
    /* private */ var _stateCommentEndDash: Any = js.native
    
    /* private */ var _stateCommentLessThanSign: Any = js.native
    
    /* private */ var _stateCommentLessThanSignBang: Any = js.native
    
    /* private */ var _stateCommentLessThanSignBangDash: Any = js.native
    
    /* private */ var _stateCommentLessThanSignBangDashDash: Any = js.native
    
    /* private */ var _stateCommentStart: Any = js.native
    
    /* private */ var _stateCommentStartDash: Any = js.native
    
    /* private */ var _stateData: Any = js.native
    
    /* private */ var _stateDecimalCharacterReference: Any = js.native
    
    /* private */ var _stateDoctype: Any = js.native
    
    /* private */ var _stateDoctypeName: Any = js.native
    
    /* private */ var _stateDoctypePublicIdentifierDoubleQuoted: Any = js.native
    
    /* private */ var _stateDoctypePublicIdentifierSingleQuoted: Any = js.native
    
    /* private */ var _stateDoctypeSystemIdentifierDoubleQuoted: Any = js.native
    
    /* private */ var _stateDoctypeSystemIdentifierSingleQuoted: Any = js.native
    
    /* private */ var _stateEndTagOpen: Any = js.native
    
    /* private */ var _stateHexademicalCharacterReference: Any = js.native
    
    /* private */ var _stateHexademicalCharacterReferenceStart: Any = js.native
    
    /* private */ var _stateMarkupDeclarationOpen: Any = js.native
    
    /* private */ var _stateNamedCharacterReference: Any = js.native
    
    /* private */ var _stateNumericCharacterReference: Any = js.native
    
    /* private */ var _stateNumericCharacterReferenceEnd: Any = js.native
    
    /* private */ var _statePlaintext: Any = js.native
    
    /* private */ var _stateRawtext: Any = js.native
    
    /* private */ var _stateRawtextEndTagName: Any = js.native
    
    /* private */ var _stateRawtextEndTagOpen: Any = js.native
    
    /* private */ var _stateRawtextLessThanSign: Any = js.native
    
    /* private */ var _stateRcdata: Any = js.native
    
    /* private */ var _stateRcdataEndTagName: Any = js.native
    
    /* private */ var _stateRcdataEndTagOpen: Any = js.native
    
    /* private */ var _stateRcdataLessThanSign: Any = js.native
    
    /* private */ var _stateScriptData: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscapeEnd: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscapeStart: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscaped: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscapedDash: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscapedDashDash: Any = js.native
    
    /* private */ var _stateScriptDataDoubleEscapedLessThanSign: Any = js.native
    
    /* private */ var _stateScriptDataEndTagName: Any = js.native
    
    /* private */ var _stateScriptDataEndTagOpen: Any = js.native
    
    /* private */ var _stateScriptDataEscapeStart: Any = js.native
    
    /* private */ var _stateScriptDataEscapeStartDash: Any = js.native
    
    /* private */ var _stateScriptDataEscaped: Any = js.native
    
    /* private */ var _stateScriptDataEscapedDash: Any = js.native
    
    /* private */ var _stateScriptDataEscapedDashDash: Any = js.native
    
    /* private */ var _stateScriptDataEscapedEndTagName: Any = js.native
    
    /* private */ var _stateScriptDataEscapedEndTagOpen: Any = js.native
    
    /* private */ var _stateScriptDataEscapedLessThanSign: Any = js.native
    
    /* private */ var _stateScriptDataLessThanSign: Any = js.native
    
    /* private */ var _stateSelfClosingStartTag: Any = js.native
    
    /* private */ var _stateTagName: Any = js.native
    
    /* private */ var _stateTagOpen: Any = js.native
    
    /* private */ var _unconsume: Any = js.native
    
    var active: Boolean = js.native
    
    /* private */ var charRefCode: Any = js.native
    
    /* private */ var consumedAfterSnapshot: Any = js.native
    
    /* private */ var currentAttr: Any = js.native
    
    /* private */ var currentCharacterToken: Any = js.native
    
    /* private */ var currentLocation: Any = js.native
    
    /* private */ var currentToken: Any = js.native
    
    /* private */ var emitCurrentComment: Any = js.native
    
    /* private */ var emitCurrentDoctype: Any = js.native
    
    /* private */ var emitCurrentTagToken: Any = js.native
    
    /* private */ var getCurrentLocation: Any = js.native
    
    /* private */ var handleSpecialEndTag: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    /**
      * Indicates that the current adjusted node exists, is not an element in the HTML namespace,
      * and that it is not an integration point for either MathML or HTML.
      *
      * @see {@link https://html.spec.whatwg.org/multipage/parsing.html#tree-construction}
      */
    var inForeignNode: Boolean = js.native
    
    /** Ensures that the parsing loop isn't run multiple times at once. */
    /* private */ var inLoop: Any = js.native
    
    def insertHtmlAtCurrentPos(chunk: String): Unit = js.native
    
    var lastStartTagName: String = js.native
    
    /* private */ var options: Any = js.native
    
    def pause(): Unit = js.native
    
    /* private */ var paused: Any = js.native
    
    /* private */ var prepareToken: Any = js.native
    
    var preprocessor: Preprocessor = js.native
    
    def resume(): Unit = js.native
    def resume(writeCallback: js.Function0[Unit]): Unit = js.native
    
    /* private */ var returnState: Any = js.native
    
    var state: State = js.native
    
    def write(chunk: String, isLastChunk: Boolean): Unit = js.native
    def write(chunk: String, isLastChunk: Boolean, writeCallback: js.Function0[Unit]): Unit = js.native
  }
  
  object TokenizerMode {
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.CDATA_SECTION")
    @js.native
    val CDATA_SECTION: `68` = js.native
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.DATA")
    @js.native
    val DATA: `0` = js.native
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.PLAINTEXT")
    @js.native
    val PLAINTEXT: `4` = js.native
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.RAWTEXT")
    @js.native
    val RAWTEXT: `2` = js.native
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.RCDATA")
    @js.native
    val RCDATA: `1` = js.native
    
    @JSImport("parse5/dist/cjs/tokenizer", "TokenizerMode.SCRIPT_DATA")
    @js.native
    val SCRIPT_DATA: `3` = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.parse5Ints.`0`
    - typings.parse5.parse5Ints.`1`
    - typings.parse5.parse5Ints.`2`
    - typings.parse5.parse5Ints.`3`
    - typings.parse5.parse5Ints.`4`
    - typings.parse5.parse5Ints.`5`
    - typings.parse5.parse5Ints.`6`
    - typings.parse5.parse5Ints.`7`
    - typings.parse5.parse5Ints.`8`
    - typings.parse5.parse5Ints.`9`
    - typings.parse5.parse5Ints.`10`
    - typings.parse5.parse5Ints.`11`
    - typings.parse5.parse5Ints.`12`
    - typings.parse5.parse5Ints.`13`
    - typings.parse5.parse5Ints.`14`
    - typings.parse5.parse5Ints.`15`
    - typings.parse5.parse5Ints.`16`
    - typings.parse5.parse5Ints.`17`
    - typings.parse5.parse5Ints.`18`
    - typings.parse5.parse5Ints.`19`
    - typings.parse5.parse5Ints.`20`
    - typings.parse5.parse5Ints.`21`
    - typings.parse5.parse5Ints.`22`
    - typings.parse5.parse5Ints.`23`
    - typings.parse5.parse5Ints.`24`
    - typings.parse5.parse5Ints.`25`
    - typings.parse5.parse5Ints.`26`
    - typings.parse5.parse5Ints.`27`
    - typings.parse5.parse5Ints.`28`
    - typings.parse5.parse5Ints.`29`
    - typings.parse5.parse5Ints.`30`
    - typings.parse5.parse5Ints.`31`
    - typings.parse5.parse5Ints.`32`
    - typings.parse5.parse5Ints.`33`
    - typings.parse5.parse5Ints.`34`
    - typings.parse5.parse5Ints.`35`
    - typings.parse5.parse5Ints.`36`
    - typings.parse5.parse5Ints.`37`
    - typings.parse5.parse5Ints.`38`
    - typings.parse5.parse5Ints.`39`
    - typings.parse5.parse5Ints.`40`
    - typings.parse5.parse5Ints.`41`
    - typings.parse5.parse5Ints.`42`
    - typings.parse5.parse5Ints.`43`
    - typings.parse5.parse5Ints.`44`
    - typings.parse5.parse5Ints.`45`
    - typings.parse5.parse5Ints.`46`
    - typings.parse5.parse5Ints.`47`
    - typings.parse5.parse5Ints.`48`
    - typings.parse5.parse5Ints.`49`
    - typings.parse5.parse5Ints.`50`
    - typings.parse5.parse5Ints.`51`
    - typings.parse5.parse5Ints.`52`
    - typings.parse5.parse5Ints.`53`
    - typings.parse5.parse5Ints.`54`
    - typings.parse5.parse5Ints.`55`
    - typings.parse5.parse5Ints.`56`
    - typings.parse5.parse5Ints.`57`
    - typings.parse5.parse5Ints.`58`
    - typings.parse5.parse5Ints.`59`
    - typings.parse5.parse5Ints.`60`
    - typings.parse5.parse5Ints.`61`
    - typings.parse5.parse5Ints.`62`
    - typings.parse5.parse5Ints.`63`
    - typings.parse5.parse5Ints.`64`
    - typings.parse5.parse5Ints.`65`
    - typings.parse5.parse5Ints.`66`
    - typings.parse5.parse5Ints.`67`
    - typings.parse5.parse5Ints.`68`
    - typings.parse5.parse5Ints.`69`
    - typings.parse5.parse5Ints.`70`
    - typings.parse5.parse5Ints.`71`
    - typings.parse5.parse5Ints.`72`
    - typings.parse5.parse5Ints.`73`
    - typings.parse5.parse5Ints.`74`
    - typings.parse5.parse5Ints.`75`
    - typings.parse5.parse5Ints.`76`
    - typings.parse5.parse5Ints.`77`
    - typings.parse5.parse5Ints.`78`
  */
  trait State extends StObject
  object State {
    
    inline def AFTER_ATTRIBUTE_NAME: `33` = 33.asInstanceOf[`33`]
    
    inline def AFTER_ATTRIBUTE_VALUE_QUOTED: `38` = 38.asInstanceOf[`38`]
    
    inline def AFTER_DOCTYPE_NAME: `55` = 55.asInstanceOf[`55`]
    
    inline def AFTER_DOCTYPE_PUBLIC_IDENTIFIER: `60` = 60.asInstanceOf[`60`]
    
    inline def AFTER_DOCTYPE_PUBLIC_KEYWORD: `56` = 56.asInstanceOf[`56`]
    
    inline def AFTER_DOCTYPE_SYSTEM_IDENTIFIER: `66` = 66.asInstanceOf[`66`]
    
    inline def AFTER_DOCTYPE_SYSTEM_KEYWORD: `62` = 62.asInstanceOf[`62`]
    
    inline def AMBIGUOUS_AMPERSAND: `73` = 73.asInstanceOf[`73`]
    
    inline def ATTRIBUTE_NAME: `32` = 32.asInstanceOf[`32`]
    
    inline def ATTRIBUTE_VALUE_DOUBLE_QUOTED: `35` = 35.asInstanceOf[`35`]
    
    inline def ATTRIBUTE_VALUE_SINGLE_QUOTED: `36` = 36.asInstanceOf[`36`]
    
    inline def ATTRIBUTE_VALUE_UNQUOTED: `37` = 37.asInstanceOf[`37`]
    
    inline def BEFORE_ATTRIBUTE_NAME: `31` = 31.asInstanceOf[`31`]
    
    inline def BEFORE_ATTRIBUTE_VALUE: `34` = 34.asInstanceOf[`34`]
    
    inline def BEFORE_DOCTYPE_NAME: `53` = 53.asInstanceOf[`53`]
    
    inline def BEFORE_DOCTYPE_PUBLIC_IDENTIFIER: `57` = 57.asInstanceOf[`57`]
    
    inline def BEFORE_DOCTYPE_SYSTEM_IDENTIFIER: `63` = 63.asInstanceOf[`63`]
    
    inline def BETWEEN_DOCTYPE_PUBLIC_AND_SYSTEM_IDENTIFIERS: `61` = 61.asInstanceOf[`61`]
    
    inline def BOGUS_COMMENT: `40` = 40.asInstanceOf[`40`]
    
    inline def BOGUS_DOCTYPE: `67` = 67.asInstanceOf[`67`]
    
    inline def CDATA_SECTION: `68` = 68.asInstanceOf[`68`]
    
    inline def CDATA_SECTION_BRACKET: `69` = 69.asInstanceOf[`69`]
    
    inline def CDATA_SECTION_END: `70` = 70.asInstanceOf[`70`]
    
    inline def CHARACTER_REFERENCE: `71` = 71.asInstanceOf[`71`]
    
    inline def COMMENT: `44` = 44.asInstanceOf[`44`]
    
    inline def COMMENT_END: `50` = 50.asInstanceOf[`50`]
    
    inline def COMMENT_END_BANG: `51` = 51.asInstanceOf[`51`]
    
    inline def COMMENT_END_DASH: `49` = 49.asInstanceOf[`49`]
    
    inline def COMMENT_LESS_THAN_SIGN: `45` = 45.asInstanceOf[`45`]
    
    inline def COMMENT_LESS_THAN_SIGN_BANG: `46` = 46.asInstanceOf[`46`]
    
    inline def COMMENT_LESS_THAN_SIGN_BANG_DASH: `47` = 47.asInstanceOf[`47`]
    
    inline def COMMENT_LESS_THAN_SIGN_BANG_DASH_DASH: `48` = 48.asInstanceOf[`48`]
    
    inline def COMMENT_START: `42` = 42.asInstanceOf[`42`]
    
    inline def COMMENT_START_DASH: `43` = 43.asInstanceOf[`43`]
    
    inline def DATA: `0` = 0.asInstanceOf[`0`]
    
    inline def DECIMAL_CHARACTER_REFERENCE: `77` = 77.asInstanceOf[`77`]
    
    inline def DOCTYPE: `52` = 52.asInstanceOf[`52`]
    
    inline def DOCTYPE_NAME: `54` = 54.asInstanceOf[`54`]
    
    inline def DOCTYPE_PUBLIC_IDENTIFIER_DOUBLE_QUOTED: `58` = 58.asInstanceOf[`58`]
    
    inline def DOCTYPE_PUBLIC_IDENTIFIER_SINGLE_QUOTED: `59` = 59.asInstanceOf[`59`]
    
    inline def DOCTYPE_SYSTEM_IDENTIFIER_DOUBLE_QUOTED: `64` = 64.asInstanceOf[`64`]
    
    inline def DOCTYPE_SYSTEM_IDENTIFIER_SINGLE_QUOTED: `65` = 65.asInstanceOf[`65`]
    
    inline def END_TAG_OPEN: `6` = 6.asInstanceOf[`6`]
    
    inline def HEXADEMICAL_CHARACTER_REFERENCE: `76` = 76.asInstanceOf[`76`]
    
    inline def HEXADEMICAL_CHARACTER_REFERENCE_START: `75` = 75.asInstanceOf[`75`]
    
    inline def MARKUP_DECLARATION_OPEN: `41` = 41.asInstanceOf[`41`]
    
    inline def NAMED_CHARACTER_REFERENCE: `72` = 72.asInstanceOf[`72`]
    
    inline def NUMERIC_CHARACTER_REFERENCE: `74` = 74.asInstanceOf[`74`]
    
    inline def NUMERIC_CHARACTER_REFERENCE_END: `78` = 78.asInstanceOf[`78`]
    
    inline def PLAINTEXT: `4` = 4.asInstanceOf[`4`]
    
    inline def RAWTEXT: `2` = 2.asInstanceOf[`2`]
    
    inline def RAWTEXT_END_TAG_NAME: `13` = 13.asInstanceOf[`13`]
    
    inline def RAWTEXT_END_TAG_OPEN: `12` = 12.asInstanceOf[`12`]
    
    inline def RAWTEXT_LESS_THAN_SIGN: `11` = 11.asInstanceOf[`11`]
    
    inline def RCDATA: `1` = 1.asInstanceOf[`1`]
    
    inline def RCDATA_END_TAG_NAME: `10` = 10.asInstanceOf[`10`]
    
    inline def RCDATA_END_TAG_OPEN: `9` = 9.asInstanceOf[`9`]
    
    inline def RCDATA_LESS_THAN_SIGN: `8` = 8.asInstanceOf[`8`]
    
    inline def SCRIPT_DATA: `3` = 3.asInstanceOf[`3`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPED: `26` = 26.asInstanceOf[`26`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPED_DASH: `27` = 27.asInstanceOf[`27`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPED_DASH_DASH: `28` = 28.asInstanceOf[`28`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPED_LESS_THAN_SIGN: `29` = 29.asInstanceOf[`29`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPE_END: `30` = 30.asInstanceOf[`30`]
    
    inline def SCRIPT_DATA_DOUBLE_ESCAPE_START: `25` = 25.asInstanceOf[`25`]
    
    inline def SCRIPT_DATA_END_TAG_NAME: `16` = 16.asInstanceOf[`16`]
    
    inline def SCRIPT_DATA_END_TAG_OPEN: `15` = 15.asInstanceOf[`15`]
    
    inline def SCRIPT_DATA_ESCAPED: `19` = 19.asInstanceOf[`19`]
    
    inline def SCRIPT_DATA_ESCAPED_DASH: `20` = 20.asInstanceOf[`20`]
    
    inline def SCRIPT_DATA_ESCAPED_DASH_DASH: `21` = 21.asInstanceOf[`21`]
    
    inline def SCRIPT_DATA_ESCAPED_END_TAG_NAME: `24` = 24.asInstanceOf[`24`]
    
    inline def SCRIPT_DATA_ESCAPED_END_TAG_OPEN: `23` = 23.asInstanceOf[`23`]
    
    inline def SCRIPT_DATA_ESCAPED_LESS_THAN_SIGN: `22` = 22.asInstanceOf[`22`]
    
    inline def SCRIPT_DATA_ESCAPE_START: `17` = 17.asInstanceOf[`17`]
    
    inline def SCRIPT_DATA_ESCAPE_START_DASH: `18` = 18.asInstanceOf[`18`]
    
    inline def SCRIPT_DATA_LESS_THAN_SIGN: `14` = 14.asInstanceOf[`14`]
    
    inline def SELF_CLOSING_START_TAG: `39` = 39.asInstanceOf[`39`]
    
    inline def TAG_NAME: `7` = 7.asInstanceOf[`7`]
    
    inline def TAG_OPEN: `5` = 5.asInstanceOf[`5`]
  }
  
  trait TokenHandler extends StObject {
    
    def onCharacter(token: CharacterToken): Unit
    
    def onComment(token: CommentToken): Unit
    
    def onDoctype(token: DoctypeToken): Unit
    
    def onEndTag(token: TagToken): Unit
    
    def onEof(token: EOFToken): Unit
    
    def onNullCharacter(token: CharacterToken): Unit
    
    var onParseError: js.UndefOr[ParserErrorHandler | Null] = js.undefined
    
    def onStartTag(token: TagToken): Unit
    
    def onWhitespaceCharacter(token: CharacterToken): Unit
  }
  object TokenHandler {
    
    inline def apply(
      onCharacter: CharacterToken => Unit,
      onComment: CommentToken => Unit,
      onDoctype: DoctypeToken => Unit,
      onEndTag: TagToken => Unit,
      onEof: EOFToken => Unit,
      onNullCharacter: CharacterToken => Unit,
      onStartTag: TagToken => Unit,
      onWhitespaceCharacter: CharacterToken => Unit
    ): TokenHandler = {
      val __obj = js.Dynamic.literal(onCharacter = js.Any.fromFunction1(onCharacter), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onEndTag = js.Any.fromFunction1(onEndTag), onEof = js.Any.fromFunction1(onEof), onNullCharacter = js.Any.fromFunction1(onNullCharacter), onStartTag = js.Any.fromFunction1(onStartTag), onWhitespaceCharacter = js.Any.fromFunction1(onWhitespaceCharacter))
      __obj.asInstanceOf[TokenHandler]
    }
    
    extension [Self <: TokenHandler](x: Self) {
      
      inline def setOnCharacter(value: CharacterToken => Unit): Self = StObject.set(x, "onCharacter", js.Any.fromFunction1(value))
      
      inline def setOnComment(value: CommentToken => Unit): Self = StObject.set(x, "onComment", js.Any.fromFunction1(value))
      
      inline def setOnDoctype(value: DoctypeToken => Unit): Self = StObject.set(x, "onDoctype", js.Any.fromFunction1(value))
      
      inline def setOnEndTag(value: TagToken => Unit): Self = StObject.set(x, "onEndTag", js.Any.fromFunction1(value))
      
      inline def setOnEof(value: EOFToken => Unit): Self = StObject.set(x, "onEof", js.Any.fromFunction1(value))
      
      inline def setOnNullCharacter(value: CharacterToken => Unit): Self = StObject.set(x, "onNullCharacter", js.Any.fromFunction1(value))
      
      inline def setOnParseError(value: /* error */ ParserError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorNull: Self = StObject.set(x, "onParseError", null)
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
      
      inline def setOnStartTag(value: TagToken => Unit): Self = StObject.set(x, "onStartTag", js.Any.fromFunction1(value))
      
      inline def setOnWhitespaceCharacter(value: CharacterToken => Unit): Self = StObject.set(x, "onWhitespaceCharacter", js.Any.fromFunction1(value))
    }
  }
  
  trait TokenizerOptions extends StObject {
    
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
  }
  object TokenizerOptions {
    
    inline def apply(): TokenizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizerOptions]
    }
    
    extension [Self <: TokenizerOptions](x: Self) {
      
      inline def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
    }
  }
}
