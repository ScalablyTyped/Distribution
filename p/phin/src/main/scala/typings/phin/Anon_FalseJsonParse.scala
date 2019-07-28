package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJsonParse extends js.Object {
  var parse: js.UndefOr[json] = js.undefined
  var stream: js.UndefOr[`false`] = js.undefined
}

object Anon_FalseJsonParse {
  @scala.inline
  def apply(parse: json = null, stream: `false` = null): Anon_FalseJsonParse = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseJsonParse]
  }
}

