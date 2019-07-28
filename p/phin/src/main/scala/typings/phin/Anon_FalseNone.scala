package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseNone extends js.Object {
  var parse: none
  var stream: js.UndefOr[`false`] = js.undefined
}

object Anon_FalseNone {
  @scala.inline
  def apply(parse: none, stream: `false` = null): Anon_FalseNone = {
    val __obj = js.Dynamic.literal(parse = parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseNone]
  }
}

