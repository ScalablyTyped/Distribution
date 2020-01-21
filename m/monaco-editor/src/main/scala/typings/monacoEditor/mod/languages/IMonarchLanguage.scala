package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonarchLanguage extends js.Object {
  /**
    * for example [['{','}','delimiter.curly']]
    */
  var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.undefined
  /**
    * if no match in the tokenizer assign this token class (default 'source')
    */
  var defaultToken: js.UndefOr[String] = js.undefined
  /**
    * is the language case insensitive?
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  /**
    * start symbol in the tokenizer (by default the first entry is used)
    */
  var start: js.UndefOr[String] = js.undefined
  /**
    * attach this to every token class (by default '.' + name)
    */
  var tokenPostfix: js.UndefOr[String] = js.undefined
  /**
    * map from string to ILanguageRule[]
    */
  var tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]
}

object IMonarchLanguage {
  @scala.inline
  def apply(
    tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]],
    brackets: js.Array[IMonarchLanguageBracket] = null,
    defaultToken: String = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    start: String = null,
    tokenPostfix: String = null
  ): IMonarchLanguage = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    if (brackets != null) __obj.updateDynamic("brackets")(brackets.asInstanceOf[js.Any])
    if (defaultToken != null) __obj.updateDynamic("defaultToken")(defaultToken.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (tokenPostfix != null) __obj.updateDynamic("tokenPostfix")(tokenPostfix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguage]
  }
}

