package typings.n3.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.rdfjsTypes.streamMod.Sink
import typings.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
- typings.rdfjsTypes.streamMod.Stream because Inheritance from two classes. Inlined read */ @JSImport("n3", "StreamParser")
@js.native
open class StreamParser[Q /* <: BaseQuad */] ()
  extends Transform
     with Sink[EventEmitter, Stream[Q]]
     with typings.node.eventsMod.global.NodeJS.EventEmitter {
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
  
  /**
    * This method pulls a quad out of the internal buffer and returns it.
    * If there is no quad available, then it will return null.
    *
    * @return A quad from the internal buffer, or null if none is available.
    */
  def read(): Q | Null = js.native
}
