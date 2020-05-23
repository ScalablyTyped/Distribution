package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropName
  extends /* key */ StringDictionary[js.Any] {
  var fromCollapsible: typings.std.Element
  var toCollapsible: typings.std.Element
}

object DictpropName {
  @scala.inline
  def apply(
    fromCollapsible: typings.std.Element,
    toCollapsible: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropName]
  }
}

