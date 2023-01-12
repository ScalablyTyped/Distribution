package typings.playcanvas.anon

import typings.playcanvas.mod.Ray
import typings.playcanvas.mod.XrHitTestSource
import typings.playcanvas.mod.XrHitTestStartCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetRay extends StObject {
  
  var callback: js.UndefOr[XrHitTestStartCallback] = js.undefined
  
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var offsetRay: js.UndefOr[Ray] = js.undefined
}
object OffsetRay {
  
  inline def apply(): OffsetRay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetRay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetRay] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: (/* err */ js.Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setOffsetRay(value: Ray): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    inline def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
  }
}
