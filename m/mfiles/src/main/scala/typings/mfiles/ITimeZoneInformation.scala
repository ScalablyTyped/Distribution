package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeZoneInformation extends js.Object {
  
  def LoadTimeZoneByName(TimeZoneName: String): Unit = js.native
  
  def LoadWithCurrentTimeZone(): Unit = js.native
  
  val StandardName: String = js.native
}
object ITimeZoneInformation {
  
  @scala.inline
  def apply(LoadTimeZoneByName: String => Unit, LoadWithCurrentTimeZone: () => Unit, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1(LoadTimeZoneByName), LoadWithCurrentTimeZone = js.Any.fromFunction0(LoadWithCurrentTimeZone), StandardName = StandardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeZoneInformation]
  }
  
  @scala.inline
  implicit class ITimeZoneInformationOps[Self <: ITimeZoneInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadTimeZoneByName(value: String => Unit): Self = this.set("LoadTimeZoneByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadWithCurrentTimeZone(value: () => Unit): Self = this.set("LoadWithCurrentTimeZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStandardName(value: String): Self = this.set("StandardName", value.asInstanceOf[js.Any])
  }
}
