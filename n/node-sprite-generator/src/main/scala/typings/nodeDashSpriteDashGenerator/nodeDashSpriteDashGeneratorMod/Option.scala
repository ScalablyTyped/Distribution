package typings.nodeDashSpriteDashGenerator.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.undefined
  var compositorOptions: js.UndefOr[CompositorOption] = js.undefined
  var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.undefined
  var layoutOptions: js.UndefOr[LayoutOption] = js.undefined
  var spritePath: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[js.Array[String]] = js.undefined
  var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.undefined
  var stylesheetOptions: js.UndefOr[StylesheetOption] = js.undefined
  var stylesheetPath: js.UndefOr[String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    compositor: BuiltinCompositors | Compositor = null,
    compositorOptions: CompositorOption = null,
    layout: BuiltinLayouts | LayoutFunc = null,
    layoutOptions: LayoutOption = null,
    spritePath: String = null,
    src: js.Array[String] = null,
    stylesheet: BuiltinStylesheetFormats | StylesheetFunc | String = null,
    stylesheetOptions: StylesheetOption = null,
    stylesheetPath: String = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (compositor != null) __obj.updateDynamic("compositor")(compositor.asInstanceOf[js.Any])
    if (compositorOptions != null) __obj.updateDynamic("compositorOptions")(compositorOptions)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutOptions != null) __obj.updateDynamic("layoutOptions")(layoutOptions)
    if (spritePath != null) __obj.updateDynamic("spritePath")(spritePath)
    if (src != null) __obj.updateDynamic("src")(src)
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (stylesheetOptions != null) __obj.updateDynamic("stylesheetOptions")(stylesheetOptions)
    if (stylesheetPath != null) __obj.updateDynamic("stylesheetPath")(stylesheetPath)
    __obj.asInstanceOf[Option]
  }
}

