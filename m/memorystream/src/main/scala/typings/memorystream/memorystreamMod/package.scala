package typings.memorystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memorystreamMod {
  import typings.node.Buffer
  import typings.node.streamMod.Duplex
  import typings.node.streamMod.Stream

  type DataType = String | Buffer | Stream
  type MemoryStream = Duplex
}
