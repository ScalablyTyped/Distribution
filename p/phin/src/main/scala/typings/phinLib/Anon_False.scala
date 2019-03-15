package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var parse: js.UndefOr[phinLib.phinLibStrings.none] = js.undefined
  var stream: js.UndefOr[phinLib.phinLibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(parse: phinLib.phinLibStrings.none = null, stream: phinLib.phinLibNumbers.`false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_False]
  }
}

