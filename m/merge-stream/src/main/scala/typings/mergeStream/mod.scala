package typings.mergeStream

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merge-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = js.native
  
  @js.native
  trait MergedStream
    extends ReadableStream
       with WritableStream {
    
    def add(source: js.Array[ReadableStream]): MergedStream = js.native
    def add(source: ReadableStream): MergedStream = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
