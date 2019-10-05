package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.Anon_DocComment
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageConfiguration extends js.Object {
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated Will be replaced by a better API soon.
    */
  var __electricCharacterSupport: js.UndefOr[Anon_DocComment] = js.undefined
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
  var wordPattern: js.UndefOr[RegExp] = js.undefined
}

object LanguageConfiguration {
  @scala.inline
  def apply(
    __electricCharacterSupport: Anon_DocComment = null,
    autoCloseBefore: String = null,
    autoClosingPairs: js.Array[IAutoClosingPairConditional] = null,
    brackets: js.Array[CharacterPair] = null,
    comments: CommentRule = null,
    folding: FoldingRules = null,
    indentationRules: IndentationRule = null,
    onEnterRules: js.Array[OnEnterRule] = null,
    surroundingPairs: js.Array[IAutoClosingPair] = null,
    wordPattern: RegExp = null
  ): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (__electricCharacterSupport != null) __obj.updateDynamic("__electricCharacterSupport")(__electricCharacterSupport)
    if (autoCloseBefore != null) __obj.updateDynamic("autoCloseBefore")(autoCloseBefore)
    if (autoClosingPairs != null) __obj.updateDynamic("autoClosingPairs")(autoClosingPairs)
    if (brackets != null) __obj.updateDynamic("brackets")(brackets)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (folding != null) __obj.updateDynamic("folding")(folding)
    if (indentationRules != null) __obj.updateDynamic("indentationRules")(indentationRules)
    if (onEnterRules != null) __obj.updateDynamic("onEnterRules")(onEnterRules)
    if (surroundingPairs != null) __obj.updateDynamic("surroundingPairs")(surroundingPairs)
    if (wordPattern != null) __obj.updateDynamic("wordPattern")(wordPattern)
    __obj.asInstanceOf[LanguageConfiguration]
  }
}

