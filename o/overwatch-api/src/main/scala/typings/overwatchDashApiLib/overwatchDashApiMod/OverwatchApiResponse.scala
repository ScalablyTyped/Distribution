package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwatchApiResponse extends js.Object {
  var level: scala.Double
  var portrait: java.lang.String
  var `private`: scala.Boolean
  var username: java.lang.String
}

object OverwatchApiResponse {
  @scala.inline
  def apply(
    level: scala.Double,
    portrait: java.lang.String,
    `private`: scala.Boolean,
    username: java.lang.String
  ): OverwatchApiResponse = {
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("portrait")(portrait)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[OverwatchApiResponse]
  }
}

