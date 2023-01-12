package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxSizeMaxSize[MaxSize /* <: Double */] extends StObject {
  
  var maxSize: MaxSize
}
object MaxSizeMaxSize {
  
  inline def apply[MaxSize /* <: Double */](maxSize: MaxSize): MaxSizeMaxSize[MaxSize] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxSizeMaxSize[MaxSize]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxSizeMaxSize[?], MaxSize /* <: Double */] (val x: Self & MaxSizeMaxSize[MaxSize]) extends AnyVal {
    
    inline def setMaxSize(value: MaxSize): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
  }
}
