package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenPage extends StObject {
  
  // Name of the page
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A list of apps, folders, and web clips to appear on a page. This collection can contain a maximum of 500 elements.
  var icons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.undefined
}
object IosHomeScreenPage {
  
  inline def apply(): IosHomeScreenPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosHomeScreenPage] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIcons(value: js.Array[IosHomeScreenItem]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: IosHomeScreenItem*): Self = StObject.set(x, "icons", js.Array(value*))
  }
}
