package typings.phin

import typings.phin.phinNumbers.`true`
import typings.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_None extends js.Object {
  var parse: js.UndefOr[none] = js.undefined
  var stream: `true`
}

object Anon_None {
  @scala.inline
  def apply(stream: `true`, parse: none = null): Anon_None = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_None]
  }
}

