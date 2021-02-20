package typings.mergeStream

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-stream", JSImport.Namespace)
  @js.native
  def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = js.native
  
  @js.native
  trait MergedStream extends ReadWriteStream {
    
    def add(source: js.Array[ReadableStream]): MergedStream = js.native
    def add(source: ReadableStream): MergedStream = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
