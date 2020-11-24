package typings.peerjsJsBinarypack

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peerjs-js-binarypack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def pack(data: js.Any): Blob = js.native
  
  def unpack(data: ArrayBuffer): js.Any = js.native
}
