package typings.oracleOraclejet.ojconveyorbeltMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojconveyorbelt.ojConveyorBeltSettableProperties> */
trait ojConveyorBeltSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var contentParent: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
}

object ojConveyorBeltSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    contentParent: String = null,
    orientation: horizontal | vertical = null,
    translations: js.Object = null
  ): ojConveyorBeltSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contentParent != null) __obj.updateDynamic("contentParent")(contentParent.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojConveyorBeltSettablePropertiesLenient]
  }
}

