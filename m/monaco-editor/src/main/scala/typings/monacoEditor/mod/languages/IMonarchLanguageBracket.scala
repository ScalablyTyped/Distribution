package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonarchLanguageBracket extends js.Object {
  /**
    * closing bracket
    */
  var close: String = js.native
  /**
    * open bracket
    */
  var open: String = js.native
  /**
    * token class
    */
  var token: String = js.native
}

object IMonarchLanguageBracket {
  @scala.inline
  def apply(close: String, open: String, token: String): IMonarchLanguageBracket = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguageBracket]
  }
  @scala.inline
  implicit class IMonarchLanguageBracketOps[Self <: IMonarchLanguageBracket] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

