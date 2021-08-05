package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookUser
  extends StObject
     with Entity {
  
  // A list of categories defined for the user.
  var masterCategories: js.UndefOr[NullableOption[js.Array[OutlookCategory]]] = js.undefined
}
object OutlookUser {
  
  inline def apply(): OutlookUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookUser]
  }
  
  extension [Self <: OutlookUser](x: Self) {
    
    inline def setMasterCategories(value: NullableOption[js.Array[OutlookCategory]]): Self = StObject.set(x, "masterCategories", value.asInstanceOf[js.Any])
    
    inline def setMasterCategoriesNull: Self = StObject.set(x, "masterCategories", null)
    
    inline def setMasterCategoriesUndefined: Self = StObject.set(x, "masterCategories", js.undefined)
    
    inline def setMasterCategoriesVarargs(value: OutlookCategory*): Self = StObject.set(x, "masterCategories", js.Array(value :_*))
  }
}
