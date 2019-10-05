package typings.polymer.polymerMod.Global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropObjectType extends js.Object {
  var computed: js.UndefOr[String] = js.undefined
  @JSName("notify")
  var notify_FPropObjectType: js.UndefOr[Boolean] = js.undefined
  var observer: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var reflectToAttribute: js.UndefOr[Boolean] = js.undefined
  var `type`: PropConstructorType
  var value: js.UndefOr[Boolean | Double | String | js.Function | js.Object] = js.undefined
}

object PropObjectType {
  @scala.inline
  def apply(
    `type`: PropConstructorType,
    computed: String = null,
    notify: js.UndefOr[Boolean] = js.undefined,
    observer: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reflectToAttribute: js.UndefOr[Boolean] = js.undefined,
    value: Boolean | Double | String | js.Function | js.Object = null
  ): PropObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify)
    if (observer != null) __obj.updateDynamic("observer")(observer)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(reflectToAttribute)) __obj.updateDynamic("reflectToAttribute")(reflectToAttribute)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropObjectType]
  }
}

