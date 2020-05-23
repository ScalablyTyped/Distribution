package typings.pgFormat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var pattern: Ident
}

object Pattern {
  @scala.inline
  def apply(pattern: Ident): Pattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

