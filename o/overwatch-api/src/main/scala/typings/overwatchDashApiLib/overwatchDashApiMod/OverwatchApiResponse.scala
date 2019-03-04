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
    val __obj = js.Dynamic.literal(level = level, portrait = portrait, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[OverwatchApiResponse]
  }
}

