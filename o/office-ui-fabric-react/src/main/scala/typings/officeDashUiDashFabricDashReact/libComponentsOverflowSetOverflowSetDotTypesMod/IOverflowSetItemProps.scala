package typings.officeDashUiDashFabricDashReact.libComponentsOverflowSetOverflowSetDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowSetItemProps
  extends /**
  * Any additional properties to use when custom rendering menu items.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Unique id to identify the item.
    */
  var key: String
  /**
    * Optional keytip for the overflowSetItem.
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
}

object IOverflowSetItemProps {
  @scala.inline
  def apply(
    key: String,
    StringDictionary: /**
    * Any additional properties to use when custom rendering menu items.
    */
  /* propertyName */ StringDictionary[js.Any] = null,
    keytipProps: IKeytipProps = null
  ): IOverflowSetItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetItemProps]
  }
}

