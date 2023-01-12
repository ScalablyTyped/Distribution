package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArrayMetadata
  extends StObject
     with /* item */ StringDictionary[Any] {
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object IArrayMetadata {
  
  inline def apply(): IArrayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IArrayMetadata] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
