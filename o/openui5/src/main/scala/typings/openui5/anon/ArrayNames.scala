package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayNames extends StObject {
  
  /**
    * Keys of arrays to be used for building the tree structure. If not specified, all arrays and objects in
    * the bound data will be used. Note that for arrays nested inside differently named arrays, you need to
    * add both to `arrayNames`. You always have to add the complete parent chain. If any array is ignored,
    * its child arrays will be ignored as well even if they have been added to `arrayNames`.
    */
  var arrayNames: js.UndefOr[js.Array[String]] = js.undefined
}
object ArrayNames {
  
  inline def apply(): ArrayNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayNames]
  }
  
  extension [Self <: ArrayNames](x: Self) {
    
    inline def setArrayNames(value: js.Array[String]): Self = StObject.set(x, "arrayNames", value.asInstanceOf[js.Any])
    
    inline def setArrayNamesUndefined: Self = StObject.set(x, "arrayNames", js.undefined)
    
    inline def setArrayNamesVarargs(value: String*): Self = StObject.set(x, "arrayNames", js.Array(value*))
  }
}
