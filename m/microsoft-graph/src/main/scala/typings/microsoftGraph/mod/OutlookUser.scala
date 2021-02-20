package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookUser extends Entity {
  
  // A list of categories defined for the user.
  var masterCategories: js.UndefOr[NullableOption[js.Array[OutlookCategory]]] = js.native
}
object OutlookUser {
  
  @scala.inline
  def apply(): OutlookUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookUser]
  }
  
  @scala.inline
  implicit class OutlookUserMutableBuilder[Self <: OutlookUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterCategories(value: NullableOption[js.Array[OutlookCategory]]): Self = StObject.set(x, "masterCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterCategoriesNull: Self = StObject.set(x, "masterCategories", null)
    
    @scala.inline
    def setMasterCategoriesUndefined: Self = StObject.set(x, "masterCategories", js.undefined)
    
    @scala.inline
    def setMasterCategoriesVarargs(value: OutlookCategory*): Self = StObject.set(x, "masterCategories", js.Array(value :_*))
  }
}
