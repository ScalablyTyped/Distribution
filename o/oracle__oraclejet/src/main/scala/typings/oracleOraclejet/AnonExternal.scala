package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternal[V]
  extends /* key */ StringDictionary[js.Any] {
  var previousValue: V
  var subproperty: AnonKey
  var updatedFrom: external | internal
  var value: V
}

object AnonExternal {
  @scala.inline
  def apply[V](
    previousValue: V,
    subproperty: AnonKey,
    updatedFrom: external | internal,
    value: V,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonExternal[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonExternal[V]]
  }
}

