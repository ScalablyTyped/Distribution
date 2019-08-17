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
    if (description != null) __obj.updateDynamic("description")(description)
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (menuIcon != null) __obj.updateDynamic("menuIcon")(menuIcon)
    if (root != null) __obj.updateDynamic("root")(root)
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText)
    if (textContainer != null) __obj.updateDynamic("textContainer")(textContainer)
    __obj.asInstanceOf[IButtonClassNames]
  }
}

