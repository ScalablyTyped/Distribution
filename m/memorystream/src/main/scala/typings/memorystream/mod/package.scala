package typings.memorystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataType = java.lang.String | typings.node.Buffer | typings.node.streamMod.Stream
  type MemoryStream = typings.node.streamMod.Duplex
}
