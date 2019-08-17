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
    container: IStyle,
    header: IStyle,
    list: IStyle,
    root: IStyle,
    subComponentStyles: IContextualMenuSubComponentStyles,
    title: IStyle
  ): IContextualMenuStyles = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subComponentStyles = subComponentStyles, title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IContextualMenuStyles]
  }
}

