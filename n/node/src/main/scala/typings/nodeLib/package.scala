package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeLib {
  // Buffer class
  type BufferEncoding = nodeLib.nodeLibStrings.ascii | nodeLib.nodeLibStrings.utf8 | nodeLib.nodeLibStrings.utf16le | nodeLib.nodeLibStrings.ucs2 | nodeLib.nodeLibStrings.base64 | nodeLib.nodeLibStrings.latin1 | nodeLib.nodeLibStrings.binary | nodeLib.nodeLibStrings.hex
  // TODO: change to `type NodeRequireFunction = (id: string) => any;` in next mayor version.
  type NodeRequireFunction = js.Function1[/* id */ java.lang.String, js.Any]
}
