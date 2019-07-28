package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJson extends js.Object {
  var parse: json
  var stream: js.UndefOr[`false`] = js.undefined
}

object Anon_FalseJson {
  @scala.inline
  def apply(parse: json, stream: `false` = null): Anon_FalseJson = {
    val __obj = js.Dynamic.literal(parse = parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseJson]
  }
}

