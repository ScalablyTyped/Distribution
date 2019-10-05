package typings.mergeDashStream

import typings.mergeDashStream.mergeDashStreamMod.MergedStream
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("merge-stream", JSImport.Namespace)
@js.native
object mergeDashStreamMod extends js.Object {
  @js.native
  trait MergedStream extends ReadWriteStream {
    def add(source: js.Array[ReadableStream]): MergedStream = js.native
    def add(source: ReadableStream): MergedStream = js.native
    def isEmpty(): Boolean = js.native
  }
  
  def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = js.native
}

