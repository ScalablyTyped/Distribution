package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueRange[T] extends StObject {
  
  var max: js.UndefOr[T] = js.undefined
  
  var min: js.UndefOr[T] = js.undefined
}
object ValueRange {
  
  inline def apply[T](): ValueRange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueRange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueRange[?], T] (val x: Self & ValueRange[T]) extends AnyVal {
    
    inline def setMax(value: T): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: T): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
