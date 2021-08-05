package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardOption extends StObject {
  
  val Events: IEvents
  
  def GetExplanation(): String
  
  def GetName(): String
  
  def GetOptionValue(): js.Any
  
  def IsEnabled(): Boolean
  
  def IsVisible(): Boolean
  
  def SetOptionValue(value: js.Any): Unit
}
object IMetadataCardOption {
  
  inline def apply(
    Events: IEvents,
    GetExplanation: () => String,
    GetName: () => String,
    GetOptionValue: () => js.Any,
    IsEnabled: () => Boolean,
    IsVisible: () => Boolean,
    SetOptionValue: js.Any => Unit
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), GetOptionValue = js.Any.fromFunction0(GetOptionValue), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible), SetOptionValue = js.Any.fromFunction1(SetOptionValue))
    __obj.asInstanceOf[IMetadataCardOption]
  }
  
  extension [Self <: IMetadataCardOption](x: Self) {
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetExplanation(value: () => String): Self = StObject.set(x, "GetExplanation", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    inline def setGetOptionValue(value: () => js.Any): Self = StObject.set(x, "GetOptionValue", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "IsEnabled", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "IsVisible", js.Any.fromFunction0(value))
    
    inline def setSetOptionValue(value: js.Any => Unit): Self = StObject.set(x, "SetOptionValue", js.Any.fromFunction1(value))
  }
}
