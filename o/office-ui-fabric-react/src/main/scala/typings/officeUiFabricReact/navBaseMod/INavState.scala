package typings.officeUiFabricReact.navBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavState extends js.Object {
  var isGroupCollapsed: StringDictionary[Boolean]
  var isLinkExpandStateChanged: js.UndefOr[Boolean] = js.undefined
  var selectedKey: js.UndefOr[String] = js.undefined
}

object INavState {
  @scala.inline
  def apply(
    isGroupCollapsed: StringDictionary[Boolean],
    isLinkExpandStateChanged: js.UndefOr[Boolean] = js.undefined,
    selectedKey: String = null
  ): INavState = {
    val __obj = js.Dynamic.literal(isGroupCollapsed = isGroupCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isLinkExpandStateChanged)) __obj.updateDynamic("isLinkExpandStateChanged")(isLinkExpandStateChanged.get.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavState]
  }
}

