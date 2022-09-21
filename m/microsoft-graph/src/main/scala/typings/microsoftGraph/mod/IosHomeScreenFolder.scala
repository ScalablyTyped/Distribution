package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenFolder
  extends StObject
     with IosHomeScreenItem {
  
  /**
    * Pages of Home Screen Layout Icons which must be applications or web clips. This collection can contain a maximum of 500
    * elements.
    */
  var pages: js.UndefOr[js.Array[IosHomeScreenFolderPage]] = js.undefined
}
object IosHomeScreenFolder {
  
  inline def apply(): IosHomeScreenFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolder]
  }
  
  extension [Self <: IosHomeScreenFolder](x: Self) {
    
    inline def setPages(value: js.Array[IosHomeScreenFolderPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: IosHomeScreenFolderPage*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
