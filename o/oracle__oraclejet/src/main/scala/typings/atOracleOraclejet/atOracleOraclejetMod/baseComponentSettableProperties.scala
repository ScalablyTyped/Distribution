package typings.atOracleOraclejet.atOracleOraclejetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseComponentSettableProperties extends JetSettableProperties {
  var translations: js.Object | Null
}

object baseComponentSettableProperties {
  @scala.inline
  def apply(translations: js.Object = null): baseComponentSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseComponentSettableProperties]
  }
}

