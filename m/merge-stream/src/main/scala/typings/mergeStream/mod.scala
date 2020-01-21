package typings.mergeStream

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merge-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MergedStream
    extends ReadableStream
       with WritableStream {
    def add(source: js.Array[ReadableStream]): MergedStream = js.native
    def add(source: ReadableStream): MergedStream = js.native
    def isEmpty(): Boolean = js.native
  }
  
  def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = js.native
}

