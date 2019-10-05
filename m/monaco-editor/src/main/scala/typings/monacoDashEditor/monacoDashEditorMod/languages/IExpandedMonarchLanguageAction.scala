package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandedMonarchLanguageAction extends js.Object {
  /**
    * @open or @close
    */
  var bracket: js.UndefOr[String] = js.undefined
  /**
    * map from string to ILanguageAction
    */
  var cases: js.UndefOr[js.Object] = js.undefined
  /**
    * go back n characters in the stream
    */
  var goBack: js.UndefOr[Double] = js.undefined
  /**
    * array of actions for each parenthesized match group
    */
  var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.undefined
  /**
    * log a message to the browser console window
    */
  var log: js.UndefOr[String] = js.undefined
  /**
    * the next state to push, or "@push", "@pop", "@popall"
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * switch to embedded language (using the mimetype) or get out using "@pop"
    */
  var nextEmbedded: js.UndefOr[String] = js.undefined
  /**
    * switch to this state
    */
  var switchTo: js.UndefOr[String] = js.undefined
  /**
    * token class (ie. css class) (or "@brackets" or "@rematch")
    */
  var token: js.UndefOr[String] = js.undefined
}

object IExpandedMonarchLanguageAction {
  @scala.inline
  def apply(
    bracket: String = null,
    cases: js.Object = null,
    goBack: Int | Double = null,
    group: js.Array[IMonarchLanguageAction] = null,
    log: String = null,
    next: String = null,
    nextEmbedded: String = null,
    switchTo: String = null,
    token: String = null
  ): IExpandedMonarchLanguageAction = {
    val __obj = js.Dynamic.literal()
    if (bracket != null) __obj.updateDynamic("bracket")(bracket)
    if (cases != null) __obj.updateDynamic("cases")(cases)
    if (goBack != null) __obj.updateDynamic("goBack")(goBack.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (log != null) __obj.updateDynamic("log")(log)
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextEmbedded != null) __obj.updateDynamic("nextEmbedded")(nextEmbedded)
    if (switchTo != null) __obj.updateDynamic("switchTo")(switchTo)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[IExpandedMonarchLanguageAction]
  }
}

