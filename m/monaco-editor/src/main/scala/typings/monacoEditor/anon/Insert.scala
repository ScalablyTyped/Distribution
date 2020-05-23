package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert extends js.Object {
  var insert: IRange
  var replace: IRange
}

object Insert {
  @scala.inline
  def apply(insert: IRange, replace: IRange): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
}

