package typings
package merge2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object merge2Mod {
  type StreamType = nodeLib.NodeJSNs.ReadableStream | Merge2Stream
  type Streams = StreamType | js.Array[StreamType]
}
