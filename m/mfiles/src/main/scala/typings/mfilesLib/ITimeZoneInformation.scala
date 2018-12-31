package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeZoneInformation extends js.Object {
  val StandardName: java.lang.String
  def LoadTimeZoneByName(TimeZoneName: java.lang.String): scala.Unit
  def LoadWithCurrentTimeZone(): scala.Unit
}

