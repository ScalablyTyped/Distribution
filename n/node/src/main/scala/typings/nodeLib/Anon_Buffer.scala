package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var encoding: nodeLib.nodeLibStrings.buffer | scala.Null
}

object Anon_Buffer {
  @scala.inline
  def apply(encoding: nodeLib.nodeLibStrings.buffer = null): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_Buffer]
  }
}

