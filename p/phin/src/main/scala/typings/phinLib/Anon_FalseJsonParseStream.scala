package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJsonParseStream extends js.Object {
  var parse: js.UndefOr[phinLib.phinLibStrings.json] = js.undefined
  var stream: phinLib.phinLibNumbers.`false`
}

object Anon_FalseJsonParseStream {
  @scala.inline
  def apply(stream: phinLib.phinLibNumbers.`false`, parse: phinLib.phinLibStrings.json = null): Anon_FalseJsonParseStream = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FalseJsonParseStream]
  }
}

