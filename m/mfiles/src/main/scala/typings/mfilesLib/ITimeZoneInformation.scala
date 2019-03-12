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

object ITimeZoneInformation {
  @scala.inline
  def apply(
    LoadTimeZoneByName: java.lang.String => scala.Unit,
    LoadWithCurrentTimeZone: () => scala.Unit,
    StandardName: java.lang.String
  ): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1(LoadTimeZoneByName), LoadWithCurrentTimeZone = js.Any.fromFunction0(LoadWithCurrentTimeZone), StandardName = StandardName)
  
    __obj.asInstanceOf[ITimeZoneInformation]
  }
}

