package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpandedMonarchLanguageAction extends js.Object {
  /**
    * @open or @close
    */
  var bracket: js.UndefOr[String] = js.native
  /**
    * map from string to ILanguageAction
    */
  var cases: js.UndefOr[js.Object] = js.native
  /**
    * go back n characters in the stream
    */
  var goBack: js.UndefOr[Double] = js.native
  /**
    * array of actions for each parenthesized match group
    */
  var group: js.UndefOr[js.Array[IMonarchLanguageAction]] = js.native
  /**
    * log a message to the browser console window
    */
  var log: js.UndefOr[String] = js.native
  /**
    * the next state to push, or "@push", "@pop", "@popall"
    */
  var next: js.UndefOr[String] = js.native
  /**
    * switch to embedded language (using the mimetype) or get out using "@pop"
    */
  var nextEmbedded: js.UndefOr[String] = js.native
  /**
    * switch to this state
    */
  var switchTo: js.UndefOr[String] = js.native
  /**
    * token class (ie. css class) (or "@brackets" or "@rematch")
    */
  var token: js.UndefOr[String] = js.native
}

object IExpandedMonarchLanguageAction {
  @scala.inline
  def apply(): IExpandedMonarchLanguageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageAction]
  }
  @scala.inline
  implicit class IExpandedMonarchLanguageActionOps[Self <: IExpandedMonarchLanguageAction] (val x: Self) extends AnyVal {
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
    def setBracket(value: String): Self = this.set("bracket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBracket: Self = this.set("bracket", js.undefined)
    @scala.inline
    def setCases(value: js.Object): Self = this.set("cases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCases: Self = this.set("cases", js.undefined)
    @scala.inline
    def setGoBack(value: Double): Self = this.set("goBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoBack: Self = this.set("goBack", js.undefined)
    @scala.inline
    def setGroupVarargs(value: IMonarchLanguageAction*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[IMonarchLanguageAction]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNextEmbedded(value: String): Self = this.set("nextEmbedded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextEmbedded: Self = this.set("nextEmbedded", js.undefined)
    @scala.inline
    def setSwitchTo(value: String): Self = this.set("switchTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchTo: Self = this.set("switchTo", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

