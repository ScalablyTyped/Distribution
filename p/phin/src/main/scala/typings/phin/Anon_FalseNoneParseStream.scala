package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseNoneParseStream extends js.Object {
  var parse: js.UndefOr[none] = js.undefined
  var stream: `false`
}

object Anon_FalseNoneParseStream {
  @scala.inline
  def apply(stream: `false`, parse: none = null): Anon_FalseNoneParseStream = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FalseNoneParseStream]
  }
}

