package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseJson extends js.Object {
  var parse: phinLib.phinLibStrings.json
  var stream: js.UndefOr[phinLib.phinLibNumbers.`false`] = js.undefined
}

object Anon_FalseJson {
  @scala.inline
  def apply(parse: phinLib.phinLibStrings.json, stream: phinLib.phinLibNumbers.`false` = null): Anon_FalseJson = {
    val __obj = js.Dynamic.literal(parse = parse)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_FalseJson]
  }
}

