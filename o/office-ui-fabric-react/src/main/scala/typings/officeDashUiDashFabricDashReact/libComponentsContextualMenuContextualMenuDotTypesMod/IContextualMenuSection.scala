package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuSection
  extends ClassAttributes[js.Any] {
  /**
    * If set to true, the section will display a divider at the bottom of the section.
    */
  var bottomDivider: js.UndefOr[Boolean] = js.undefined
  /**
    * The items to include inside the section.
    */
  var items: js.Array[IContextualMenuItem]
  /**
    * The optional section title.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * If set to true, the section will display a divider at the top of the section.
    */
  var topDivider: js.UndefOr[Boolean] = js.undefined
}

object IContextualMenuSection {
  @scala.inline
  def apply(
    items: js.Array[IContextualMenuItem],
    bottomDivider: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: LegacyRef[js.Any] = null,
    title: String = null,
    topDivider: js.UndefOr[Boolean] = js.undefined
  ): IContextualMenuSection = {
    val __obj = js.Dynamic.literal(items = items)
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider)
    __obj.asInstanceOf[IContextualMenuSection]
  }
}

