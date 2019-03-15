package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseNoneParseStream extends js.Object {
  var parse: js.UndefOr[phinLib.phinLibStrings.none] = js.undefined
  var stream: phinLib.phinLibNumbers.`false`
}

object Anon_FalseNoneParseStream {
  @scala.inline
  def apply(stream: phinLib.phinLibNumbers.`false`, parse: phinLib.phinLibStrings.none = null): Anon_FalseNoneParseStream = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FalseNoneParseStream]
  }
}

