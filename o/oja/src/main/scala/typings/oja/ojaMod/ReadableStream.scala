package typings.oja.ojaMod

import org.scalablytyped.runtime.Instantiable2
import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "ReadableStream")
@js.native
class ReadableStream ()
  extends Readable
     with Instantiable2[/* topic */ String, /* emitter */ EventEmitter, ReadableStream] {
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

