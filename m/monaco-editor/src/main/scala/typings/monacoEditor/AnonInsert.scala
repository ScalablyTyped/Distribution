package typings.monacoEditor

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsert extends js.Object {
  var insert: IRange
  var replace: IRange
}

object AnonInsert {
  @scala.inline
  def apply(insert: IRange, replace: IRange): AnonInsert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsert]
  }
}

