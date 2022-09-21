package typings.peerjsJsBinarypack

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peerjs-js-binarypack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack(data: Any): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(data.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  inline def unpack(data: js.typedarray.ArrayBuffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
}
