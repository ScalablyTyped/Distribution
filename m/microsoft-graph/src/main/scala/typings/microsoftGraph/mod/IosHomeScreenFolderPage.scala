package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenFolderPage extends StObject {
  
  // A list of apps to appear on a page within a folder. This collection can contain a maximum of 500 elements.
  var apps: js.UndefOr[js.Array[IosHomeScreenApp]] = js.undefined
  
  // Name of the folder page
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosHomeScreenFolderPage {
  
  @scala.inline
  def apply(): IosHomeScreenFolderPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolderPage]
  }
  
  @scala.inline
  implicit class IosHomeScreenFolderPageMutableBuilder[Self <: IosHomeScreenFolderPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: js.Array[IosHomeScreenApp]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: IosHomeScreenApp*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
