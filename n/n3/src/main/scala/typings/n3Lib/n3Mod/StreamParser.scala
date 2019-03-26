package typings
package n3Lib.n3Mod

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
  override def `import`(stream: rdfDashJsLib.rdfDashJsMod.Stream[Q]): nodeLib.eventsMod.EventEmitter = js.native
}

