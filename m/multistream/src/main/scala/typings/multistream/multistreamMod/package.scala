package typings.multistream

import typings.node.NodeJSNs.ReadableStream
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multistreamMod {
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, Unit]
  type LazyStream = js.Function0[Stream]
  type Streams = (js.Array[LazyStream | ReadableStream]) | FactoryStream
}
