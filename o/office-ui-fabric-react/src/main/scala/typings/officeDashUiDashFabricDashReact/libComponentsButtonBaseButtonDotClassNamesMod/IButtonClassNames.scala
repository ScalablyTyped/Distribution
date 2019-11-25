package typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonDotClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonClassNames extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var flexContainer: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var menuIcon: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var screenReaderText: js.UndefOr[String] = js.undefined
  var textContainer: js.UndefOr[String] = js.undefined
}

object IButtonClassNames {
  @scala.inline
  def apply(
    description: String = null,
    flexContainer: String = null,
    icon: String = null,
    label: String = null,
    menuIcon: String = null,
    root: String = null,
    screenReaderText: String = null,
    textContainer: String = null
  ): IButtonClassNames = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    if (textContainer != null) __obj.updateDynamic("textContainer")(textContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonClassNames]
  }
}

