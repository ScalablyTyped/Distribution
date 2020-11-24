package typings.n3.mod

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "StreamWriter")
@js.native
class StreamWriter[Q /* <: typings.rdfJs.mod.BaseQuad */] ()
  extends Transform
     with Sink[Stream[Q], EventEmitter] {
  def this(fd: js.Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: js.Any, options: WriterOptions) = this()
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}
