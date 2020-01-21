package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Infinity = js.Any
  type Integer = scala.Double
  // Declare to fix type issue
  type NodeStream = typings.node.streamMod.^
  type ReadableStream[T] = js.Any
}
