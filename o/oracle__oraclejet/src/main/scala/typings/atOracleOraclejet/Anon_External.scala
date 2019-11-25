package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.external
import typings.atOracleOraclejet.atOracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_External[V]
  extends /* key */ StringDictionary[js.Any] {
  var previousValue: V
  var subproperty: Anon_Key
  var updatedFrom: external | internal
  var value: V
}

object Anon_External {
  @scala.inline
  def apply[V](
    previousValue: V,
    subproperty: Anon_Key,
    updatedFrom: external | internal,
    value: V,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Anon_External[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_External[V]]
  }
}

