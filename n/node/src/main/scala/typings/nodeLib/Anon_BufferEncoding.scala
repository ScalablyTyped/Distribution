package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncoding extends js.Object {
  var encoding: nodeLib.nodeLibStrings.buffer
}

object Anon_BufferEncoding {
  @scala.inline
  def apply(encoding: nodeLib.nodeLibStrings.buffer): Anon_BufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_BufferEncoding]
  }
}

