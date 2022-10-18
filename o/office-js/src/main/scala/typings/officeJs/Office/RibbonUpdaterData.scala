package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies changes to the ribbon, such as the enabled or disabled status of a button.
  *
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/ribbon-api-requirement-sets | RibbonApi 1.1}
  */
trait RibbonUpdaterData extends StObject {
  
  /**
    * Collection of tabs whose state is set with the call of `requestUpdate`.
    */
  var tabs: js.Array[Tab]
}
object RibbonUpdaterData {
  
  inline def apply(tabs: js.Array[Tab]): RibbonUpdaterData = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonUpdaterData]
  }
  
  extension [Self <: RibbonUpdaterData](x: Self) {
    
    inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
  }
}
