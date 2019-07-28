package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJsonParseStream extends js.Object {
  var parse: js.UndefOr[json] = js.undefined
  var stream: `false`
}

object Anon_FalseJsonParseStream {
  @scala.inline
  def apply(stream: `false`, parse: json = null): Anon_FalseJsonParseStream = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FalseJsonParseStream]
  }
}

