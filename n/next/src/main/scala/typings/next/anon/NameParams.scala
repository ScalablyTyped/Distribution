package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParams extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
}
object NameParams {
  
  inline def apply(): NameParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameParams]
  }
  
  extension [Self <: NameParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
