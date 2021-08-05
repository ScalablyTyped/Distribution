package typings.node.fsMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEncodingOptions extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}
object BaseEncodingOptions {
  
  inline def apply(): BaseEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptions]
  }
  
  extension [Self <: BaseEncodingOptions](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
