package typings.phin

import typings.phin.phinNumbers.`false`
import typings.phin.phinStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var parse: js.UndefOr[none] = js.undefined
  var stream: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(parse: none = null, stream: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_False]
  }
}

