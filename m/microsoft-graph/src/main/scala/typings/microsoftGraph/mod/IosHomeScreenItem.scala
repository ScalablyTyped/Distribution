package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenItem extends StObject {
  
  // Name of the app
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosHomeScreenItem {
  
  @scala.inline
  def apply(): IosHomeScreenItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenItem]
  }
  
  @scala.inline
  implicit class IosHomeScreenItemMutableBuilder[Self <: IosHomeScreenItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
