package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies changes to the ribbon, such as the enabled or disabled status of a button.
	 *
	 * @remarks
  *
  * **Requirement set**: Ribbon 1.1
  */
@js.native
trait RibbonUpdaterData extends js.Object {
  
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
  implicit class RibbonUpdaterDataOps[Self <: RibbonUpdaterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
