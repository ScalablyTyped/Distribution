package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardAction extends StObject {
  
  def Activate(): Unit
  
  val Events: IEvents
  
  def GetExplanation(): String
  
  def GetName(): String
  
  def IsEnabled(): Boolean
  
  def IsVisible(): Boolean
}
object IMetadataCardAction {
  
  inline def apply(
    Activate: () => Unit,
    Events: IEvents,
    GetExplanation: () => String,
    GetName: () => String,
    IsEnabled: () => Boolean,
    IsVisible: () => Boolean
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Events = Events.asInstanceOf[js.Any], GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible))
    __obj.asInstanceOf[IMetadataCardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardAction] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetExplanation(value: () => String): Self = StObject.set(x, "GetExplanation", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "IsEnabled", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "IsVisible", js.Any.fromFunction0(value))
  }
}
