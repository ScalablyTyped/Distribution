package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indices extends StObject {
  
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object Indices {
  
  inline def apply(): Indices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indices] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
