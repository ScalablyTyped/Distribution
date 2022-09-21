package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComparison
  extends StObject
     with /* item */ StringDictionary[Any] {
  
  var __count: js.UndefOr[Double] = js.undefined
  
  var __offset: js.UndefOr[Double] = js.undefined
  
  var __order: js.UndefOr[String] = js.undefined
}
object IComparison {
  
  inline def apply(): IComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComparison]
  }
  
  extension [Self <: IComparison](x: Self) {
    
    inline def set__count(value: Double): Self = StObject.set(x, "__count", value.asInstanceOf[js.Any])
    
    inline def set__countUndefined: Self = StObject.set(x, "__count", js.undefined)
    
    inline def set__offset(value: Double): Self = StObject.set(x, "__offset", value.asInstanceOf[js.Any])
    
    inline def set__offsetUndefined: Self = StObject.set(x, "__offset", js.undefined)
    
    inline def set__order(value: String): Self = StObject.set(x, "__order", value.asInstanceOf[js.Any])
    
    inline def set__orderUndefined: Self = StObject.set(x, "__order", js.undefined)
  }
}
