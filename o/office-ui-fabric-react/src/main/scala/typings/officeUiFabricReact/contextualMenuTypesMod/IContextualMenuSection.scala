package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
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
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined,
    title: String = null,
    topDivider: js.UndefOr[Boolean] = js.undefined
  ): IContextualMenuSection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomDivider)) __obj.updateDynamic("bottomDivider")(bottomDivider.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(topDivider)) __obj.updateDynamic("topDivider")(topDivider.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSection]
  }
}

