package typings.n3.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "StreamWriter")
@js.native
class StreamWriter[Q /* <: typings.rdfJs.mod.BaseQuad */] () extends N3StreamWriter[Q] {
  def this(fd: js.Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: js.Any, options: WriterOptions) = this()
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  /* CompleteClass */
  override def `import`(stream: Stream[Q]): EventEmitter = js.native
}

@JSImport("n3", "StreamWriter")
@js.native
object StreamWriter extends TopLevel[StreamWriterConstructor]

