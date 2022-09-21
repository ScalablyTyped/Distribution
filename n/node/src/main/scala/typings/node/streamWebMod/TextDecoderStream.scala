package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderStream extends StObject {
  
  /** Returns encoding's name, lower cased. */
  val encoding: String = js.native
  
  /** Returns `true` if error mode is "fatal", and `false` otherwise. */
  val fatal: Boolean = js.native
  
  /** Returns `true` if ignore BOM flag is set, and `false` otherwise. */
  val ignoreBOM: Boolean = js.native
  
  val readable: ReadableStream[String] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
  
  val writable: WritableStream[BufferSource] = js.native
}
