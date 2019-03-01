package typings
package atOracleOraclejetLib.ojrefresherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRefresherSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var target: stdLib.Element
  var text: java.lang.String
  var threshold: scala.Double
  def refreshContent(): js.Promise[_]
}

object ojRefresherSettableProperties {
  @scala.inline
  def apply(
    refreshContent: js.Function0[js.Promise[_]],
    target: stdLib.Element,
    text: java.lang.String,
    threshold: scala.Double,
    translations: js.Object = null
  ): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refreshContent")(refreshContent)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("threshold")(threshold)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
}

