package typings.node.fsMod

import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadAsyncOptions[TBuffer /* <: ArrayBufferView */]
  extends StObject
     with ReadSyncOptions {
  
  var buffer: js.UndefOr[TBuffer] = js.undefined
}
object ReadAsyncOptions {
  
  inline def apply[TBuffer /* <: ArrayBufferView */](): ReadAsyncOptions[TBuffer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadAsyncOptions[TBuffer]]
  }
  
  extension [Self <: ReadAsyncOptions[?], TBuffer /* <: ArrayBufferView */](x: Self & ReadAsyncOptions[TBuffer]) {
    
    inline def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
  }
}
