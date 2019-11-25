package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeZoneInformation extends js.Object {
  val StandardName: String
  def LoadTimeZoneByName(TimeZoneName: String): Unit
  def LoadWithCurrentTimeZone(): Unit
}

object ITimeZoneInformation {
  @scala.inline
  def apply(LoadTimeZoneByName: String => Unit, LoadWithCurrentTimeZone: () => Unit, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1(LoadTimeZoneByName), LoadWithCurrentTimeZone = js.Any.fromFunction0(LoadWithCurrentTimeZone), StandardName = StandardName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITimeZoneInformation]
  }
}

