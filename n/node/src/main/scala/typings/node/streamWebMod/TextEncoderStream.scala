package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderStream extends StObject {
  
  /** Returns "utf-8". */
  val encoding: "utf-8" = js.native
  
  val readable: ReadableStream[js.typedarray.Uint8Array] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
  
  val writable: WritableStream[String] = js.native
}
