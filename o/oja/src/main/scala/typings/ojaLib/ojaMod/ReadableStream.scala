package typings
package ojaLib.ojaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "ReadableStream")
@js.native
class ReadableStream ()
  extends nodeLib.streamMod.Readable
     with org.scalablytyped.runtime.Instantiable2[
      /* topic */ java.lang.String, 
      /* emitter */ nodeLib.eventsMod.EventEmitter, 
      ReadableStream
    ] {
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
}

