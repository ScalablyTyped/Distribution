package typings.n3.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "StreamParser")
@js.native
class StreamParser[Q /* <: BaseQuad */] () extends N3StreamParser[Q] {
  def this(options: ParserOptions) = this()
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
  override def `import`(stream: EventEmitter): Stream[Q] = js.native
}

@JSImport("n3", "StreamParser")
@js.native
object StreamParser extends TopLevel[StreamParserConstructor]

