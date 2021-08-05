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
  
  inline def apply(): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
  
  extension [Self <: WindowsUpdateActiveHoursInstall](x: Self) {
    
    inline def setActiveHoursEnd(value: String): Self = StObject.set(x, "activeHoursEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveHoursEndUndefined: Self = StObject.set(x, "activeHoursEnd", js.undefined)
    
    inline def setActiveHoursStart(value: String): Self = StObject.set(x, "activeHoursStart", value.asInstanceOf[js.Any])
    
    inline def setActiveHoursStartUndefined: Self = StObject.set(x, "activeHoursStart", js.undefined)
  }
}
