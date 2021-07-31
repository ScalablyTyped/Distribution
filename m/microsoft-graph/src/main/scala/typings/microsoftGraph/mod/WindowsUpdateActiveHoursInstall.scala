package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateActiveHoursInstall
  extends StObject
     with WindowsUpdateInstallScheduleType {
  
  // Active Hours End
  var activeHoursEnd: js.UndefOr[String] = js.undefined
  
  // Active Hours Start
  var activeHoursStart: js.UndefOr[String] = js.undefined
}
object WindowsUpdateActiveHoursInstall {
  
  @scala.inline
  def apply(): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
  
  @scala.inline
  implicit class WindowsUpdateActiveHoursInstallMutableBuilder[Self <: WindowsUpdateActiveHoursInstall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveHoursEnd(value: String): Self = StObject.set(x, "activeHoursEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHoursEndUndefined: Self = StObject.set(x, "activeHoursEnd", js.undefined)
    
    @scala.inline
    def setActiveHoursStart(value: String): Self = StObject.set(x, "activeHoursStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHoursStartUndefined: Self = StObject.set(x, "activeHoursStart", js.undefined)
  }
}
