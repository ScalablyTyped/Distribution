package typings.officeUiFabricReact.panelTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStyles extends js.Object {
  /**
    * Style for the close button IconButton element.
    * @deprecated Use `subComponentStyles.closeButton` instead.
    */
  var closeButton: js.UndefOr[IStyle] = js.undefined
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
    * Style for the header text div element.
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
  /**
    * Styling for subcomponents.
    */
  var subComponentStyles: IPanelSubComponentStyles
}

object IPanelStyles {
  @scala.inline
  def apply(
    subComponentStyles: IPanelSubComponentStyles,
    closeButton: js.UndefOr[Null | IStyle] = js.undefined,
    commands: js.UndefOr[Null | IStyle] = js.undefined,
    content: js.UndefOr[Null | IStyle] = js.undefined,
    contentInner: js.UndefOr[Null | IStyle] = js.undefined,
    footer: js.UndefOr[Null | IStyle] = js.undefined,
    footerInner: js.UndefOr[Null | IStyle] = js.undefined,
    header: js.UndefOr[Null | IStyle] = js.undefined,
    headerText: js.UndefOr[Null | IStyle] = js.undefined,
    hiddenPanel: js.UndefOr[Null | IStyle] = js.undefined,
    main: js.UndefOr[Null | IStyle] = js.undefined,
    navigation: js.UndefOr[Null | IStyle] = js.undefined,
    overlay: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    scrollableContent: js.UndefOr[Null | IStyle] = js.undefined
  ): IPanelStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(commands)) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(contentInner)) __obj.updateDynamic("contentInner")(contentInner.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(footerInner)) __obj.updateDynamic("footerInner")(footerInner.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headerText)) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenPanel)) __obj.updateDynamic("hiddenPanel")(hiddenPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollableContent)) __obj.updateDynamic("scrollableContent")(scrollableContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyles]
  }
}

