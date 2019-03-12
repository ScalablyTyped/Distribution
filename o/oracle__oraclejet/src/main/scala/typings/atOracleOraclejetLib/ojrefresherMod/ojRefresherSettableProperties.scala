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
    refreshContent: () => js.Promise[_],
    target: stdLib.Element,
    text: java.lang.String,
    threshold: scala.Double,
    translations: js.Object = null
  ): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target, text = text, threshold = threshold)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
}

