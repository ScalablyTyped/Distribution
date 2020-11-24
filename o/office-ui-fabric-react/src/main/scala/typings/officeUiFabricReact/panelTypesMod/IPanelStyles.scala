package typings.officeUiFabricReact.panelTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelStyles extends js.Object {
  
  /**
    * Style for the close button IconButton element.
    * @deprecated Use `subComponentStyles.closeButton` instead.
    */
  var closeButton: js.UndefOr[IStyle] = js.native
  
  /**
    * Style for the navigation container element.
    */
  var commands: IStyle = js.native
  
  /**
    * Style for the body div element.
    */
  var content: IStyle = js.native
  
  /**
    * Style for the Body and Footer container element.
    */
  var contentInner: IStyle = js.native
  
  /**
    * Style for the footer div element.
    */
  var footer: IStyle = js.native
  
  /**
    * Style for the inner footer div element.
    */
  var footerInner: IStyle = js.native
  
  /**
    * Style for the header container div element.
    */
  var header: IStyle = js.native
  
  /**
    * Style for the header text div element.
    */
  var headerText: IStyle = js.native
  
  /**
    * Style for the hidden element.
    */
  var hiddenPanel: IStyle = js.native
  
  /**
    * Style for the main section element.
    */
  var main: IStyle = js.native
  
  /**
    * Style for the close button container element.
    */
  var navigation: IStyle = js.native
  
  /**
    * Style for the overlay element.
    */
  var overlay: IStyle = js.native
  
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  
  /**
    * Style for the scrollable content area container element.
    */
  var scrollableContent: IStyle = js.native
  
  /**
    * Styling for subcomponents.
    */
  var subComponentStyles: IPanelSubComponentStyles = js.native
}
object IPanelStyles {
  
  @scala.inline
  def apply(subComponentStyles: IPanelSubComponentStyles): IPanelStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyles]
  }
  
  @scala.inline
  implicit class IPanelStylesOps[Self <: IPanelStyles] (val x: Self) extends AnyVal {
    
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
    def setSubComponentStyles(value: IPanelSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButton(value: IStyle): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setCloseButtonNull: Self = this.set("closeButton", null)
    
    @scala.inline
    def setCommands(value: IStyle): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setCommandsNull: Self = this.set("commands", null)
    
    @scala.inline
    def setContent(value: IStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setContentInner(value: IStyle): Self = this.set("contentInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInner: Self = this.set("contentInner", js.undefined)
    
    @scala.inline
    def setContentInnerNull: Self = this.set("contentInner", null)
    
    @scala.inline
    def setFooter(value: IStyle): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterNull: Self = this.set("footer", null)
    
    @scala.inline
    def setFooterInner(value: IStyle): Self = this.set("footerInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterInner: Self = this.set("footerInner", js.undefined)
    
    @scala.inline
    def setFooterInnerNull: Self = this.set("footerInner", null)
    
    @scala.inline
    def setHeader(value: IStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setHeaderText(value: IStyle): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderTextNull: Self = this.set("headerText", null)
    
    @scala.inline
    def setHiddenPanel(value: IStyle): Self = this.set("hiddenPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenPanel: Self = this.set("hiddenPanel", js.undefined)
    
    @scala.inline
    def setHiddenPanelNull: Self = this.set("hiddenPanel", null)
    
    @scala.inline
    def setMain(value: IStyle): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setMainNull: Self = this.set("main", null)
    
    @scala.inline
    def setNavigation(value: IStyle): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setNavigationNull: Self = this.set("navigation", null)
    
    @scala.inline
    def setOverlay(value: IStyle): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayNull: Self = this.set("overlay", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setScrollableContent(value: IStyle): Self = this.set("scrollableContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollableContent: Self = this.set("scrollableContent", js.undefined)
    
    @scala.inline
    def setScrollableContentNull: Self = this.set("scrollableContent", null)
  }
}
