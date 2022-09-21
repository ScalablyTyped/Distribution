package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorsObject
  extends StObject
     with /* field */ StringDictionary[js.Array[String]] {
  
  var _query: js.UndefOr[Any] = js.undefined
}
object IErrorsObject {
  
  inline def apply(): IErrorsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorsObject]
  }
  
  extension [Self <: IErrorsObject](x: Self) {
    
    inline def set_query(value: Any): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    
    inline def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
  }
}
