package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.DocComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageConfiguration extends StObject {
  
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated Will be replaced by a better API soon.
    */
  var __electricCharacterSupport: js.UndefOr[DocComment] = js.undefined
  
  /**
    * Defines what characters must be after the cursor for bracket or quote autoclosing to occur when using the \'languageDefined\' autoclosing setting.
    *
    * This is typically the set of characters which can not start an expression, such as whitespace, closing brackets, non-unary operators, etc.
    */
  var autoCloseBefore: js.UndefOr[String] = js.undefined
  
  /**
    * The language's auto closing pairs. The 'close' character is automatically inserted with the
    * 'open' character is typed. If not set, the configured brackets will be used.
    */
  var autoClosingPairs: js.UndefOr[js.Array[IAutoClosingPairConditional]] = js.undefined
  
  /**
    * The language's brackets.
    * This configuration implicitly affects pressing Enter around these brackets.
    */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.undefined
  
  /**
    * Defines a list of bracket pairs that are colorized depending on their nesting level.
    * If not set, the configured brackets will be used.
    */
  var colorizedBracketPairs: js.UndefOr[js.Array[CharacterPair]] = js.undefined
  
  /**
    * The language's comment settings.
    */
  var comments: js.UndefOr[CommentRule] = js.undefined
  
  /**
    * The language's folding rules.
    */
  var folding: js.UndefOr[FoldingRules] = js.undefined
  
  /**
    * The language's indentation settings.
    */
  var indentationRules: js.UndefOr[IndentationRule] = js.undefined
  
  /**
    * The language's rules to be evaluated when pressing Enter.
    */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.undefined
  
  /**
    * The language's surrounding pairs. When the 'open' character is typed on a selection, the
    * selected string is surrounded by the open and close characters. If not set, the autoclosing pairs
    * settings will be used.
    */
  var surroundingPairs: js.UndefOr[js.Array[IAutoClosingPair]] = js.undefined
  
  /**
    * The language's word definition.
    * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
    * to provide a word definition that uses exclusion of known separators.
    * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
    *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
    */
  var wordPattern: js.UndefOr[js.RegExp] = js.undefined
}
object LanguageConfiguration {
  
  inline def apply(): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfiguration]
  }
  
  extension [Self <: LanguageConfiguration](x: Self) {
    
    inline def setAutoCloseBefore(value: String): Self = StObject.set(x, "autoCloseBefore", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseBeforeUndefined: Self = StObject.set(x, "autoCloseBefore", js.undefined)
    
    inline def setAutoClosingPairs(value: js.Array[IAutoClosingPairConditional]): Self = StObject.set(x, "autoClosingPairs", value.asInstanceOf[js.Any])
    
    inline def setAutoClosingPairsUndefined: Self = StObject.set(x, "autoClosingPairs", js.undefined)
    
    inline def setAutoClosingPairsVarargs(value: IAutoClosingPairConditional*): Self = StObject.set(x, "autoClosingPairs", js.Array(value*))
    
    inline def setBrackets(value: js.Array[CharacterPair]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    inline def setBracketsVarargs(value: CharacterPair*): Self = StObject.set(x, "brackets", js.Array(value*))
    
    inline def setColorizedBracketPairs(value: js.Array[CharacterPair]): Self = StObject.set(x, "colorizedBracketPairs", value.asInstanceOf[js.Any])
    
    inline def setColorizedBracketPairsUndefined: Self = StObject.set(x, "colorizedBracketPairs", js.undefined)
    
    inline def setColorizedBracketPairsVarargs(value: CharacterPair*): Self = StObject.set(x, "colorizedBracketPairs", js.Array(value*))
    
    inline def setComments(value: CommentRule): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setFolding(value: FoldingRules): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    inline def setFoldingUndefined: Self = StObject.set(x, "folding", js.undefined)
    
    inline def setIndentationRules(value: IndentationRule): Self = StObject.set(x, "indentationRules", value.asInstanceOf[js.Any])
    
    inline def setIndentationRulesUndefined: Self = StObject.set(x, "indentationRules", js.undefined)
    
    inline def setOnEnterRules(value: js.Array[OnEnterRule]): Self = StObject.set(x, "onEnterRules", value.asInstanceOf[js.Any])
    
    inline def setOnEnterRulesUndefined: Self = StObject.set(x, "onEnterRules", js.undefined)
    
    inline def setOnEnterRulesVarargs(value: OnEnterRule*): Self = StObject.set(x, "onEnterRules", js.Array(value*))
    
    inline def setSurroundingPairs(value: js.Array[IAutoClosingPair]): Self = StObject.set(x, "surroundingPairs", value.asInstanceOf[js.Any])
    
    inline def setSurroundingPairsUndefined: Self = StObject.set(x, "surroundingPairs", js.undefined)
    
    inline def setSurroundingPairsVarargs(value: IAutoClosingPair*): Self = StObject.set(x, "surroundingPairs", js.Array(value*))
    
    inline def setWordPattern(value: js.RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    inline def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
    
    inline def set__electricCharacterSupport(value: DocComment): Self = StObject.set(x, "__electricCharacterSupport", value.asInstanceOf[js.Any])
    
    inline def set__electricCharacterSupportUndefined: Self = StObject.set(x, "__electricCharacterSupport", js.undefined)
  }
}
