package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StreamTrue extends js.Object {
  var stream: js.UndefOr[phinLib.phinLibNumbers.`true`] = js.undefined
}

object Anon_StreamTrue {
  @scala.inline
  def apply(stream: phinLib.phinLibNumbers.`true` = null): Anon_StreamTrue = {
    val __obj = js.Dynamic.literal()
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_StreamTrue]
  }
}

