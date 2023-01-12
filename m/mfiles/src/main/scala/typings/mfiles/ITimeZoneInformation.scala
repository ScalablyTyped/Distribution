package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeZoneInformation extends StObject {
  
  def LoadTimeZoneByName(TimeZoneName: String): Unit
  
  def LoadWithCurrentTimeZone(): Unit
  
  val StandardName: String
}
object ITimeZoneInformation {
  
  inline def apply(LoadTimeZoneByName: String => Unit, LoadWithCurrentTimeZone: () => Unit, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1(LoadTimeZoneByName), LoadWithCurrentTimeZone = js.Any.fromFunction0(LoadWithCurrentTimeZone), StandardName = StandardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeZoneInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITimeZoneInformation] (val x: Self) extends AnyVal {
    
    inline def setLoadTimeZoneByName(value: String => Unit): Self = StObject.set(x, "LoadTimeZoneByName", js.Any.fromFunction1(value))
    
    inline def setLoadWithCurrentTimeZone(value: () => Unit): Self = StObject.set(x, "LoadWithCurrentTimeZone", js.Any.fromFunction0(value))
    
    inline def setStandardName(value: String): Self = StObject.set(x, "StandardName", value.asInstanceOf[js.Any])
  }
}
