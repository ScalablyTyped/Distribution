package typings.officeUiFabricReact.panelTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStyles extends js.Object {
  /**
    * Style for the close button IconButton element.
    */
  var closeButton: IStyle
  /**
    * Style for the navigation container element.
    */
  var commands: IStyle
  /**
    * Style for the body div element.
    */
  var content: IStyle
  /**
    * Style for the Body and Footer container element.
    */
  var contentInner: IStyle
  /**
    * Style for the footer div element.
    */
  var footer: IStyle
  /**
    * Style for the inner footer div element.
    */
  var footerInner: IStyle
  /**
    * Style for the header container div element.
    */
  var header: IStyle
  /**
    * Style for the header inner p element.
    */
  var headerText: IStyle
  /**
    * Style for the hidden element.
    */
  var hiddenPanel: IStyle
  /**
    * Style for the main section element.
    */
  var main: IStyle
  /**
    * Style for the close button container element.
    */
  var navigation: IStyle
  /**
    * Style for the overlay element.
    */
  var overlay: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
  /**
    * Style for the scrollable content area container element.
    */
  var scrollableContent: IStyle
}

object IPanelStyles {
  @scala.inline
  def apply(
    closeButton: IStyle = null,
    commands: IStyle = null,
    content: IStyle = null,
    contentInner: IStyle = null,
    footer: IStyle = null,
    footerInner: IStyle = null,
    header: IStyle = null,
    headerText: IStyle = null,
    hiddenPanel: IStyle = null,
    main: IStyle = null,
    navigation: IStyle = null,
    overlay: IStyle = null,
    root: IStyle = null,
    scrollableContent: IStyle = null
  ): IPanelStyles = {
    val __obj = js.Dynamic.literal()
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentInner != null) __obj.updateDynamic("contentInner")(contentInner.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerInner != null) __obj.updateDynamic("footerInner")(footerInner.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (hiddenPanel != null) __obj.updateDynamic("hiddenPanel")(hiddenPanel.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scrollableContent != null) __obj.updateDynamic("scrollableContent")(scrollableContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyles]
  }
}

