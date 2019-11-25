package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonarchLanguageBracket extends js.Object {
  /**
    * closing bracket
    */
  var close: String
  /**
    * open bracket
    */
  var open: String
  /**
    * token class
    */
  var token: String
}

object IMonarchLanguageBracket {
  @scala.inline
  def apply(close: String, open: String, token: String): IMonarchLanguageBracket = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMonarchLanguageBracket]
  }
}

