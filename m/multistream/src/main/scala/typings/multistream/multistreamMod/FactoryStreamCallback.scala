package typings.multistream.multistreamMod

import typings.node.NodeJSNs.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactoryStreamCallback extends js.Object {
  def apply(): js.Any = js.native
  def apply(err: Null, stream: ReadableStream): js.Any = js.native
  def apply(err: Error): js.Any = js.native
}

