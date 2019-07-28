package typings.memorystream

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memorystreamMod {
  type DataType = String | Buffer | Stream
  type MemoryStream = Duplex
}
