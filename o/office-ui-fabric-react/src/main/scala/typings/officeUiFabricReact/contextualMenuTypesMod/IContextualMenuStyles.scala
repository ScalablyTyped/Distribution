package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuStyles extends js.Object {
  /**
    * Style for the container which parents all menu items.
    */
  var container: IStyle
  /**
    * Styles for the header item of a ContextualMenu
    */
  var header: IStyle
  /**
    * Styles for the list that contains all menuItems.
    */
  var list: IStyle
  /**
    * Base styles for the root element of all ContextualMenus.
    */
  var root: IStyle
  /**
    * SubComponent styles.
    */
  var subComponentStyles: IContextualMenuSubComponentStyles
  /**
    * Style override for the contextual menu title.
    */
  var title: IStyle
}

object IContextualMenuStyles {
  @scala.inline
  def apply(
    subComponentStyles: IContextualMenuSubComponentStyles,
    container: js.UndefOr[Null | IStyle] = js.undefined,
    header: js.UndefOr[Null | IStyle] = js.undefined,
    list: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    title: js.UndefOr[Null | IStyle] = js.undefined
  ): IContextualMenuStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuStyles]
  }
}

