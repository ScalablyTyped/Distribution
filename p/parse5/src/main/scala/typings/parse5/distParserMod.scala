package typings.parse5

import typings.parse5.anon.Parent
import typings.parse5.commonErrorCodesMod.ERR
import typings.parse5.commonErrorCodesMod.ParserError
import typings.parse5.commonErrorCodesMod.ParserErrorHandler
import typings.parse5.commonHtmlMod.NS
import typings.parse5.commonHtmlMod.TAG_ID
import typings.parse5.commonTokenMod.CharacterToken
import typings.parse5.commonTokenMod.CommentToken
import typings.parse5.commonTokenMod.DoctypeToken
import typings.parse5.commonTokenMod.EOFToken
import typings.parse5.commonTokenMod.LocationWithAttributes
import typings.parse5.commonTokenMod.TagToken
import typings.parse5.commonTokenMod.Token
import typings.parse5.distTokenizerMod.TokenHandler
import typings.parse5.distTokenizerMod.Tokenizer
import typings.parse5.parse5Numbers.`0`
import typings.parse5.parse5Numbers.`1`
import typings.parse5.parse5Numbers.`2`
import typings.parse5.parse5Numbers.`3`
import typings.parse5.parse5Numbers.`4`
import typings.parse5.parse5Numbers.`68`
import typings.parse5.parserFormattingElementListMod.FormattingElementList
import typings.parse5.parserOpenElementStackMod.OpenElementStack
import typings.parse5.parserOpenElementStackMod.StackHandler
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  @js.native
  sealed trait InsertionMode extends StObject
  @JSImport("parse5/dist/parser", "InsertionMode")
  @js.native
  object InsertionMode extends StObject {
    
    @js.native
    sealed trait AFTER_AFTER_BODY
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait AFTER_AFTER_FRAMESET
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait AFTER_BODY
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait AFTER_FRAMESET
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait AFTER_HEAD
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait BEFORE_HEAD
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait BEFORE_HTML
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait INITIAL
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_BODY
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_CAPTION
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_CELL
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_COLUMN_GROUP
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_FRAMESET
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_HEAD
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_HEAD_NO_SCRIPT
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_ROW
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_SELECT
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_SELECT_IN_TABLE
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_TABLE
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_TABLE_BODY
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_TABLE_TEXT
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait IN_TEMPLATE
      extends StObject
         with InsertionMode
    
    @js.native
    sealed trait TEXT
      extends StObject
         with InsertionMode
  }
  
  @JSImport("parse5/dist/parser", "Parser")
  @js.native
  open class Parser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] ()
    extends StObject
       with TokenHandler
       with StackHandler[T] {
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
    
    @JSName("_adoptNodes")
    def _adoptNodes_parentNode(
      donor: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      recipient: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): Unit = js.native
    
    @JSName("_appendCommentNode")
    def _appendCommentNode_parentNode(
      token: CommentToken,
      parent: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): Unit = js.native
    
    def _appendElement(token: TagToken, namespaceURI: NS): Unit = js.native
    
    @JSName("_attachElementToTree")
    def _attachElementToTree_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Unit = js.native
    @JSName("_attachElementToTree")
    def _attachElementToTree_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      location: LocationWithAttributes
    ): Unit = js.native
    
    def _closePElement(): Unit = js.native
    
    def _closeTableCell(): Unit = js.native
    
    def _endTagOutsideForeignContent(token: TagToken): Unit = js.native
    
    def _err(token: Token, code: ERR): Unit = js.native
    def _err(token: Token, code: ERR, beforeToken: Boolean): Unit = js.native
    
    def _findFormInFragmentContext(): Unit = js.native
    
    def _findFosterParentingLocation(): Parent[T] = js.native
    
    @JSName("_fosterParentElement")
    def _fosterParentElement_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Unit = js.native
    
    def _getAdjustedCurrentElement(): /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any = js.native
    
    /* private */ var _initTokenizerForFragmentParsing: Any = js.native
    
    def _insertCharacters(token: CharacterToken): Unit = js.native
    
    def _insertElement(token: TagToken, namespaceURI: NS): Unit = js.native
    
    def _insertFakeElement(tagName: String, tagID: TAG_ID): Unit = js.native
    
    def _insertFakeRootElement(): Unit = js.native
    
    def _insertTemplate(token: TagToken): Unit = js.native
    
    def _isElementCausesFosterParenting(tn: TAG_ID): Boolean = js.native
    
    @JSName("_isIntegrationPoint")
    def _isIntegrationPoint_element(
      tid: TAG_ID,
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Boolean = js.native
    @JSName("_isIntegrationPoint")
    def _isIntegrationPoint_element(
      tid: TAG_ID,
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      foreignNS: NS
    ): Boolean = js.native
    
    @JSName("_isSpecialElement")
    def _isSpecialElement_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      id: TAG_ID
    ): Boolean = js.native
    
    /**
      * Processes a given start tag.
      *
      * `onStartTag` checks if a self-closing tag was recognized. When a token
      * is moved inbetween multiple insertion modes, this check for self-closing
      * could lead to false positives. To avoid this, `_processStartTag` is used
      * for nested calls.
      *
      * @param token The token to process.
      */
    def _processStartTag(token: TagToken): Unit = js.native
    
    def _processToken(token: Token): Unit = js.native
    
    def _reconstructActiveFormattingElements(): Unit = js.native
    
    def _resetInsertionMode(): Unit = js.native
    
    def _resetInsertionModeForSelect(selectIdx: Double): Unit = js.native
    
    /* private */ var _setContextModes: Any = js.native
    
    def _setDocumentType(token: DoctypeToken): Unit = js.native
    
    @JSName("_setEndLocation")
    def _setEndLocation_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      closingToken: Token
    ): Unit = js.native
    
    def _shouldFosterParentOnInsertion(): Boolean = js.native
    
    def _startTagOutsideForeignContent(token: TagToken): Unit = js.native
    
    def _switchToTextParsing(currentToken: TagToken, nextTokenizerState: `3` | `2` | `4` | `0` | `1` | `68`): Unit = js.native
    
    var activeFormattingElements: FormattingElementList[T] = js.native
    
    /** Indicates that the current node is not an element in the HTML namespace */
    /* private */ var currentNotInHTML: Any = js.native
    
    /* private */ var currentToken: Any = js.native
    
    var document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = js.native
    
    var formElement: Null | (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) = js.native
    
    var fosterParentingEnabled: Boolean = js.native
    
    var fragmentContext: (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) | Null = js.native
    
    var fragmentContextID: TAG_ID = js.native
    
    var framesetOk: Boolean = js.native
    
    def getFragment(): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = js.native
    
    var hasNonWhitespacePendingCharacterToken: Boolean = js.native
    
    var headElement: Null | (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) = js.native
    
    var insertionMode: InsertionMode = js.native
    
    /* CompleteClass */
    override def onCharacter(token: CharacterToken): Unit = js.native
    
    /* CompleteClass */
    override def onComment(token: CommentToken): Unit = js.native
    
    /* CompleteClass */
    override def onDoctype(token: DoctypeToken): Unit = js.native
    
    /* CompleteClass */
    override def onEndTag(token: TagToken): Unit = js.native
    
    /* CompleteClass */
    override def onEof(token: EOFToken): Unit = js.native
    
    /* CompleteClass */
    @JSName("onItemPop")
    override def onItemPop_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      isTop: Boolean
    ): Unit = js.native
    
    /* CompleteClass */
    @JSName("onItemPush")
    override def onItemPush_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      tid: Double,
      isTop: Boolean
    ): Unit = js.native
    
    /* CompleteClass */
    override def onNullCharacter(token: CharacterToken): Unit = js.native
    
    @JSName("onParseError")
    var onParseError_Parser: ParserErrorHandler | Null = js.native
    
    /* CompleteClass */
    override def onStartTag(token: TagToken): Unit = js.native
    
    /* CompleteClass */
    override def onWhitespaceCharacter(token: CharacterToken): Unit = js.native
    
    var openElements: OpenElementStack[T] = js.native
    
    var options: Required[ParserOptions[T]] = js.native
    
    var originalInsertionMode: InsertionMode = js.native
    
    var pendingCharacterTokens: js.Array[CharacterToken] = js.native
    
    var scriptHandler: Null | (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
        Unit
      ]) = js.native
    
    /* private */ var shouldProcessStartTagTokenInForeignContent: Any = js.native
    
    var skipNextNewLine: Boolean = js.native
    
    var stopped: Boolean = js.native
    
    def switchToPlaintextParsing(): Unit = js.native
    
    /**
      * The template insertion mode stack is maintained from the left.
      * Ie. the topmost element will always have index 0.
      */
    var tmplInsertionModeStack: js.Array[InsertionMode] = js.native
    
    var tokenizer: Tokenizer = js.native
    
    var treeAdapter: TreeAdapter[T] = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("parse5/dist/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")().asInstanceOf[Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, options: ParserOptions[T]): Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Unit, options: ParserOptions[T]): Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser[T]]
    
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any]).asInstanceOf[Parser[T]]
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      options: ParserOptions[T]
    ): Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser[T]]
    
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  }
  
  trait ParserOptions[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    /**
      * Callback for parse errors.
      *
      * @default `null`
      */
    var onParseError: js.UndefOr[ParserErrorHandler | Null] = js.undefined
    
    /**
      * The [scripting flag](https://html.spec.whatwg.org/multipage/parsing.html#scripting-flag). If set
      * to `true`, `noscript` element content will be parsed as text.
      *
      *  @default `true`
      */
    var scriptingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables source code location information. When enabled, each node (except the root node)
      * will have a `sourceCodeLocation` property. If the node is not an empty element, `sourceCodeLocation` will
      * be a {@link ElementLocation} object, otherwise it will be {@link Location}.
      * If the element was implicitly created by the parser (as part of
      * [tree correction](https://html.spec.whatwg.org/multipage/syntax.html#an-introduction-to-error-handling-and-strange-cases-in-the-parser)),
      * its `sourceCodeLocation` property will be `undefined`.
      *
      * @default `false`
      */
    var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the resulting tree format.
      *
      * @default `treeAdapters.default`
      */
    var treeAdapter: js.UndefOr[TreeAdapter[T]] = js.undefined
  }
  object ParserOptions {
    
    inline def apply[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): ParserOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions[T]]
    }
    
    extension [Self <: ParserOptions[?], T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & ParserOptions[T]) {
      
      inline def setOnParseError(value: /* error */ ParserError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorNull: Self = StObject.set(x, "onParseError", null)
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
      
      inline def setScriptingEnabled(value: Boolean): Self = StObject.set(x, "scriptingEnabled", value.asInstanceOf[js.Any])
      
      inline def setScriptingEnabledUndefined: Self = StObject.set(x, "scriptingEnabled", js.undefined)
      
      inline def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
      
      inline def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
      
      inline def setTreeAdapter(value: TreeAdapter[T]): Self = StObject.set(x, "treeAdapter", value.asInstanceOf[js.Any])
      
      inline def setTreeAdapterUndefined: Self = StObject.set(x, "treeAdapter", js.undefined)
    }
  }
}
