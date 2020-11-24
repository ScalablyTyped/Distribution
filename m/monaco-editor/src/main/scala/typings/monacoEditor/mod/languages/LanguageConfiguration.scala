package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.DocComment
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageConfiguration extends js.Object {
  
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
  implicit class LanguageConfigurationOps[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__electricCharacterSupport(value: DocComment): Self = this.set("__electricCharacterSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__electricCharacterSupport: Self = this.set("__electricCharacterSupport", js.undefined)
    
    @scala.inline
    def setAutoCloseBefore(value: String): Self = this.set("autoCloseBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseBefore: Self = this.set("autoCloseBefore", js.undefined)
    
    @scala.inline
    def setAutoClosingPairsVarargs(value: IAutoClosingPairConditional*): Self = this.set("autoClosingPairs", js.Array(value :_*))
    
    @scala.inline
    def setAutoClosingPairs(value: js.Array[IAutoClosingPairConditional]): Self = this.set("autoClosingPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClosingPairs: Self = this.set("autoClosingPairs", js.undefined)
    
    @scala.inline
    def setBracketsVarargs(value: CharacterPair*): Self = this.set("brackets", js.Array(value :_*))
    
    @scala.inline
    def setBrackets(value: js.Array[CharacterPair]): Self = this.set("brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrackets: Self = this.set("brackets", js.undefined)
    
    @scala.inline
    def setComments(value: CommentRule): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setFolding(value: FoldingRules): Self = this.set("folding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolding: Self = this.set("folding", js.undefined)
    
    @scala.inline
    def setIndentationRules(value: IndentationRule): Self = this.set("indentationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentationRules: Self = this.set("indentationRules", js.undefined)
    
    @scala.inline
    def setOnEnterRulesVarargs(value: OnEnterRule*): Self = this.set("onEnterRules", js.Array(value :_*))
    
    @scala.inline
    def setOnEnterRules(value: js.Array[OnEnterRule]): Self = this.set("onEnterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnterRules: Self = this.set("onEnterRules", js.undefined)
    
    @scala.inline
    def setSurroundingPairsVarargs(value: IAutoClosingPair*): Self = this.set("surroundingPairs", js.Array(value :_*))
    
    @scala.inline
    def setSurroundingPairs(value: js.Array[IAutoClosingPair]): Self = this.set("surroundingPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundingPairs: Self = this.set("surroundingPairs", js.undefined)
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = this.set("wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordPattern: Self = this.set("wordPattern", js.undefined)
  }
}
