package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.DocComment
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageConfiguration extends StObject {
  
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated Will be replaced by a better API soon.
    */
  var __electricCharacterSupport: js.UndefOr[DocComment] = js.native
  
  /**
    * Defines what characters must be after the cursor for bracket or quote autoclosing to occur when using the \'languageDefined\' autoclosing setting.
    *
    * This is typically the set of characters which can not start an expression, such as whitespace, closing brackets, non-unary operators, etc.
    */
  var autoCloseBefore: js.UndefOr[String] = js.native
  
  /**
    * The language's auto closing pairs. The 'close' character is automatically inserted with the
    * 'open' character is typed. If not set, the configured brackets will be used.
    */
  var autoClosingPairs: js.UndefOr[js.Array[IAutoClosingPairConditional]] = js.native
  
  /**
    * The language's brackets.
    * This configuration implicitly affects pressing Enter around these brackets.
    */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.native
  
  /**
    * The language's comment settings.
    */
  var comments: js.UndefOr[CommentRule] = js.native
  
  /**
    * The language's folding rules.
    */
  var folding: js.UndefOr[FoldingRules] = js.native
  
  /**
    * The language's indentation settings.
    */
  var indentationRules: js.UndefOr[IndentationRule] = js.native
  
  /**
    * The language's rules to be evaluated when pressing Enter.
    */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.native
  
  /**
    * The language's surrounding pairs. When the 'open' character is typed on a selection, the
    * selected string is surrounded by the open and close characters. If not set, the autoclosing pairs
    * settings will be used.
    */
  var surroundingPairs: js.UndefOr[js.Array[IAutoClosingPair]] = js.native
  
  /**
    * The language's word definition.
    * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
    * to provide a word definition that uses exclusion of known separators.
    * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
    *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
    */
  var wordPattern: js.UndefOr[RegExp] = js.native
}
object LanguageConfiguration {
  
  @scala.inline
  def apply(): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfiguration]
  }
  
  @scala.inline
  implicit class LanguageConfigurationMutableBuilder[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCloseBefore(value: String): Self = StObject.set(x, "autoCloseBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseBeforeUndefined: Self = StObject.set(x, "autoCloseBefore", js.undefined)
    
    @scala.inline
    def setAutoClosingPairs(value: js.Array[IAutoClosingPairConditional]): Self = StObject.set(x, "autoClosingPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClosingPairsUndefined: Self = StObject.set(x, "autoClosingPairs", js.undefined)
    
    @scala.inline
    def setAutoClosingPairsVarargs(value: IAutoClosingPairConditional*): Self = StObject.set(x, "autoClosingPairs", js.Array(value :_*))
    
    @scala.inline
    def setBrackets(value: js.Array[CharacterPair]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    @scala.inline
    def setBracketsVarargs(value: CharacterPair*): Self = StObject.set(x, "brackets", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: CommentRule): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setFolding(value: FoldingRules): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingUndefined: Self = StObject.set(x, "folding", js.undefined)
    
    @scala.inline
    def setIndentationRules(value: IndentationRule): Self = StObject.set(x, "indentationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationRulesUndefined: Self = StObject.set(x, "indentationRules", js.undefined)
    
    @scala.inline
    def setOnEnterRules(value: js.Array[OnEnterRule]): Self = StObject.set(x, "onEnterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterRulesUndefined: Self = StObject.set(x, "onEnterRules", js.undefined)
    
    @scala.inline
    def setOnEnterRulesVarargs(value: OnEnterRule*): Self = StObject.set(x, "onEnterRules", js.Array(value :_*))
    
    @scala.inline
    def setSurroundingPairs(value: js.Array[IAutoClosingPair]): Self = StObject.set(x, "surroundingPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundingPairsUndefined: Self = StObject.set(x, "surroundingPairs", js.undefined)
    
    @scala.inline
    def setSurroundingPairsVarargs(value: IAutoClosingPair*): Self = StObject.set(x, "surroundingPairs", js.Array(value :_*))
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
    
    @scala.inline
    def set__electricCharacterSupport(value: DocComment): Self = StObject.set(x, "__electricCharacterSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__electricCharacterSupportUndefined: Self = StObject.set(x, "__electricCharacterSupport", js.undefined)
  }
}
