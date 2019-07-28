package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwatchApiResponse extends js.Object {
  var level: Double
  var portrait: String
  var `private`: Boolean
  var username: String
}

object OverwatchApiResponse {
  @scala.inline
  def apply(level: Double, portrait: String, `private`: Boolean, username: String): OverwatchApiResponse = {
    val __obj = js.Dynamic.literal(level = level, portrait = portrait, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[OverwatchApiResponse]
  }
}

