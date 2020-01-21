package typings.merge2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StreamType = typings.node.NodeJS.ReadableStream | typings.merge2.mod.Merge2Stream
  type Streams = typings.merge2.mod.StreamType | js.Array[typings.merge2.mod.StreamType]
}
