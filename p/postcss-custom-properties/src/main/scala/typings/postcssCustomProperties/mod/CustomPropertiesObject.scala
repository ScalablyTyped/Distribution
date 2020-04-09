package typings.postcssCustomProperties.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertiesObject extends js.Object {
  var `custom-properties`: js.UndefOr[StringDictionary[String]] = js.undefined
  var customProperties: js.UndefOr[StringDictionary[String]] = js.undefined
}

object CustomPropertiesObject {
  @scala.inline
  def apply(
    `custom-properties`: StringDictionary[String] = null,
    customProperties: StringDictionary[String] = null
  ): CustomPropertiesObject = {
    val __obj = js.Dynamic.literal()
    if (`custom-properties` != null) __obj.updateDynamic("custom-properties")(`custom-properties`.asInstanceOf[js.Any])
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertiesObject]
  }
}

