package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies changes to the ribbon, such as the enabled or disabled status of a button.
  */
@js.native
trait RibbonUpdaterData extends StObject {
  
  /**
    * Collection of tabs whose state is set with the call of `requestUpdate`.
    */
  var tabs: js.Array[Tab] = js.native
}
object RibbonUpdaterData {
  
  @scala.inline
  def apply(tabs: js.Array[Tab]): RibbonUpdaterData = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonUpdaterData]
  }
  
  @scala.inline
  implicit class RibbonUpdaterDataMutableBuilder[Self <: RibbonUpdaterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
  }
}
