package typings.officeUiFabricReact.navBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavState extends js.Object {
  
  var isGroupCollapsed: StringDictionary[Boolean] = js.native
  
  var isLinkExpandStateChanged: js.UndefOr[Boolean] = js.native
  
  var selectedKey: js.UndefOr[String] = js.native
}
object INavState {
  
  @scala.inline
  def apply(isGroupCollapsed: StringDictionary[Boolean]): INavState = {
    val __obj = js.Dynamic.literal(isGroupCollapsed = isGroupCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavState]
  }
  
  @scala.inline
  implicit class INavStateOps[Self <: INavState] (val x: Self) extends AnyVal {
    
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
    def setIsGroupCollapsed(value: StringDictionary[Boolean]): Self = this.set("isGroupCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLinkExpandStateChanged(value: Boolean): Self = this.set("isLinkExpandStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLinkExpandStateChanged: Self = this.set("isLinkExpandStateChanged", js.undefined)
    
    @scala.inline
    def setSelectedKey(value: String): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
  }
}
