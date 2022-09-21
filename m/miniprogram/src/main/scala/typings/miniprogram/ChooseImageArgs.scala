package typings.miniprogram

import typings.miniprogram.anon.ApFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageArgs
  extends StObject
     with AsyncCallback[ApFilePaths] {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var sizeType: js.UndefOr[js.Array[String]] = js.undefined
  
  var sourceType: js.UndefOr[js.Array[String]] = js.undefined
}
object ChooseImageArgs {
  
  inline def apply(): ChooseImageArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageArgs]
  }
  
  extension [Self <: ChooseImageArgs](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSourceType(value: js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value*))
  }
}
