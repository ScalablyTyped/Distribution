package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseNone extends js.Object {
  var parse: phinLib.phinLibStrings.none
  var stream: js.UndefOr[phinLib.phinLibNumbers.`false`] = js.undefined
}

object Anon_FalseNone {
  @scala.inline
  def apply(parse: phinLib.phinLibStrings.none, stream: phinLib.phinLibNumbers.`false` = null): Anon_FalseNone = {
    val __obj = js.Dynamic.literal(parse = parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseNone]
  }
}

