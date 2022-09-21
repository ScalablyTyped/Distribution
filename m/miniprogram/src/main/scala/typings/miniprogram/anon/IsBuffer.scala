package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBuffer extends StObject {
  
  var data: String
  
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}
object IsBuffer {
  
  inline def apply(data: String): IsBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBuffer]
  }
  
  extension [Self <: IsBuffer](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
  }
}
