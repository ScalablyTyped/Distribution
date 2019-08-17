package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuSubComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuClassNames extends js.Object {
  var container: String
  var header: String
  var list: String
  var root: String
  var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.undefined
  var title: String
}

object IContextualMenuClassNames {
  @scala.inline
  def apply(
    container: String,
    header: String,
    list: String,
    root: String,
    title: String,
    subComponentStyles: IContextualMenuSubComponentStyles = null
  ): IContextualMenuClassNames = {
    val __obj = js.Dynamic.literal(container = container, header = header, list = list, root = root, title = title)
    if (subComponentStyles != null) __obj.updateDynamic("subComponentStyles")(subComponentStyles)
    __obj.asInstanceOf[IContextualMenuClassNames]
  }
}

