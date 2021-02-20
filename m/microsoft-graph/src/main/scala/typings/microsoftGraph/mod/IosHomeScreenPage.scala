package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosHomeScreenPage extends StObject {
  
  // Name of the page
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // A list of apps and folders to appear on a page. This collection can contain a maximum of 500 elements.
  var icons: js.UndefOr[js.Array[IosHomeScreenItem]] = js.native
}
object IosHomeScreenPage {
  
  @scala.inline
  def apply(): IosHomeScreenPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenPage]
  }
  
  @scala.inline
  implicit class IosHomeScreenPageMutableBuilder[Self <: IosHomeScreenPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Array[IosHomeScreenItem]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIconsVarargs(value: IosHomeScreenItem*): Self = StObject.set(x, "icons", js.Array(value :_*))
  }
}
