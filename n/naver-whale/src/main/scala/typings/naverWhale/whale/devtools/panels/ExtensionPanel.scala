package typings.naverWhale.whale.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionPanel extends js.Object {
  
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): typings.chrome.chrome.devtools.panels.Button = js.native
  
  /** Fired when the user switches away from the panel. */
  var onHidden: typings.chrome.chrome.devtools.panels.PanelHiddenEvent = js.native
  
  /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
  var onSearch: typings.chrome.chrome.devtools.panels.PanelSearchEvent = js.native
  
  /** Fired when the user switches to the panel. */
  var onShown: typings.chrome.chrome.devtools.panels.PanelShownEvent = js.native
}
object ExtensionPanel {
  
  @scala.inline
  def apply(
    createStatusBarButton: (String, String, Boolean) => typings.chrome.chrome.devtools.panels.Button,
    onHidden: typings.chrome.chrome.devtools.panels.PanelHiddenEvent,
    onSearch: typings.chrome.chrome.devtools.panels.PanelSearchEvent,
    onShown: typings.chrome.chrome.devtools.panels.PanelShownEvent
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(createStatusBarButton = js.Any.fromFunction3(createStatusBarButton), onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPanel]
  }
  
  @scala.inline
  implicit class ExtensionPanelOps[Self <: ExtensionPanel] (val x: Self) extends AnyVal {
    
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
    def setCreateStatusBarButton(value: (String, String, Boolean) => typings.chrome.chrome.devtools.panels.Button): Self = this.set("createStatusBarButton", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnHidden(value: typings.chrome.chrome.devtools.panels.PanelHiddenEvent): Self = this.set("onHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearch(value: typings.chrome.chrome.devtools.panels.PanelSearchEvent): Self = this.set("onSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShown(value: typings.chrome.chrome.devtools.panels.PanelShownEvent): Self = this.set("onShown", value.asInstanceOf[js.Any])
  }
}
