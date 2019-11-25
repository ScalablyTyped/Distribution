package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToken extends js.Object {
  var scopes: String
  var startIndex: Double
}

object IToken {
  @scala.inline
  def apply(scopes: String, startIndex: Double): IToken = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IToken]
  }
}

