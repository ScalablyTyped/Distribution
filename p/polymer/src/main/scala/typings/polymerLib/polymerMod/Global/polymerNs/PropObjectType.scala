package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropObjectType extends js.Object {
  var computed: js.UndefOr[java.lang.String] = js.undefined
  @JSName("notify")
  var notify_FPropObjectType: js.UndefOr[scala.Boolean] = js.undefined
  var observer: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reflectToAttribute: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: PropConstructorType
  var value: js.UndefOr[scala.Boolean | scala.Double | java.lang.String | js.Function | js.Object] = js.undefined
}

object PropObjectType {
  @scala.inline
  def apply(
    `type`: PropConstructorType,
    computed: java.lang.String = null,
    notify: js.UndefOr[scala.Boolean] = js.undefined,
    observer: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reflectToAttribute: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Boolean | scala.Double | java.lang.String | js.Function | js.Object = null
  ): PropObjectType = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify)
    if (observer != null) __obj.updateDynamic("observer")(observer)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(reflectToAttribute)) __obj.updateDynamic("reflectToAttribute")(reflectToAttribute)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropObjectType]
  }
}

