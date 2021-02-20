package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardAction extends StObject {
  
  def Activate(): Unit = js.native
  
  val Events: IEvents = js.native
  
  def GetExplanation(): String = js.native
  
  def GetName(): String = js.native
  
  def IsEnabled(): Boolean = js.native
  
  def IsVisible(): Boolean = js.native
}
object IMetadataCardAction {
  
  @scala.inline
  def apply(
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
  implicit class IMetadataCardActionMutableBuilder[Self <: IMetadataCardAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExplanation(value: () => String): Self = StObject.set(x, "GetExplanation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "GetName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "IsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "IsVisible", js.Any.fromFunction0(value))
  }
}
