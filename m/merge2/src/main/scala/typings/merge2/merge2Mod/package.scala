package typings.merge2

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object merge2Mod {
  type StreamType = ReadableStream | Merge2Stream
  type Streams = StreamType | js.Array[StreamType]
}
