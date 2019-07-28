package typings.mergeDashStream.mergeDashStreamMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merge-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = js.native
}

