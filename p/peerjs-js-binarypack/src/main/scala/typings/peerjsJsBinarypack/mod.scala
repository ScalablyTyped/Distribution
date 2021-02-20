package typings.peerjsJsBinarypack

import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peerjs-js-binarypack", "pack")
  @js.native
  def pack(data: js.Any): Blob = js.native
  
  @JSImport("peerjs-js-binarypack", "unpack")
  @js.native
  def unpack(data: ArrayBuffer): js.Any = js.native
}
