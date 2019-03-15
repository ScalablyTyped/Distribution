package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_None extends js.Object {
  var parse: js.UndefOr[phinLib.phinLibStrings.none] = js.undefined
  var stream: phinLib.phinLibNumbers.`true`
}

object Anon_None {
  @scala.inline
  def apply(stream: phinLib.phinLibNumbers.`true`, parse: phinLib.phinLibStrings.none = null): Anon_None = {
    val __obj = js.Dynamic.literal(stream = stream)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_None]
  }
}

