package typings.peerjsJsBinarypack

import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peerjs-js-binarypack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pack(data: js.Any): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(data.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  @scala.inline
  def unpack(data: ArrayBuffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
