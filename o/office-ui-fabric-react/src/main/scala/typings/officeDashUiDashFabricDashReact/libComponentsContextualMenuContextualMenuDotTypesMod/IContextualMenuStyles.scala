package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    container: IStyle = null,
    header: IStyle = null,
    list: IStyle = null,
    root: IStyle = null,
    title: IStyle = null
  ): IContextualMenuStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuStyles]
  }
}

