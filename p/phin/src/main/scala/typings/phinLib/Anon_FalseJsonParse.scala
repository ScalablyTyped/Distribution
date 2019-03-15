package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJsonParse extends js.Object {
  var parse: js.UndefOr[phinLib.phinLibStrings.json] = js.undefined
  var stream: js.UndefOr[phinLib.phinLibNumbers.`false`] = js.undefined
}

object Anon_FalseJsonParse {
  @scala.inline
  def apply(parse: phinLib.phinLibStrings.json = null, stream: phinLib.phinLibNumbers.`false` = null): Anon_FalseJsonParse = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseJsonParse]
  }
}

