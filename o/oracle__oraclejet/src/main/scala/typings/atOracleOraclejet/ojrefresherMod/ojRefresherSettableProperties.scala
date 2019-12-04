package typings.atOracleOraclejet.ojrefresherMod

import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRefresherSettableProperties extends baseComponentSettableProperties {
  var target: Element
  var text: String
  var threshold: Double
  def refreshContent(): js.Promise[_]
}

object ojRefresherSettableProperties {
  @scala.inline
  def apply(
    refreshContent: () => js.Promise[_],
    target: Element,
    text: String,
    threshold: Double,
    translations: js.Object = null
  ): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
}

