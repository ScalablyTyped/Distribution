package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTemplateSelector extends StObject {
  
  val ClassSelector: IMetadataCardControl
  
  val Events: IEvents
  
  def GetObjectTypeIconURL(): String
  
  def GetObjectTypeId(): Double
  
  def GetObjectTypeName(): String
  
  def GetTemplateItems(): Any
  
  def SelectItem(itemID: String): Unit
}
object IObjectTemplateSelector {
  
  inline def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: () => String,
    GetObjectTypeId: () => Double,
    GetObjectTypeName: () => String,
    GetTemplateItems: () => Any,
    SelectItem: String => Unit
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GetObjectTypeIconURL = js.Any.fromFunction0(GetObjectTypeIconURL), GetObjectTypeId = js.Any.fromFunction0(GetObjectTypeId), GetObjectTypeName = js.Any.fromFunction0(GetObjectTypeName), GetTemplateItems = js.Any.fromFunction0(GetTemplateItems), SelectItem = js.Any.fromFunction1(SelectItem))
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
  
  extension [Self <: IObjectTemplateSelector](x: Self) {
    
    inline def setClassSelector(value: IMetadataCardControl): Self = StObject.set(x, "ClassSelector", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetObjectTypeIconURL(value: () => String): Self = StObject.set(x, "GetObjectTypeIconURL", js.Any.fromFunction0(value))
    
    inline def setGetObjectTypeId(value: () => Double): Self = StObject.set(x, "GetObjectTypeId", js.Any.fromFunction0(value))
    
    inline def setGetObjectTypeName(value: () => String): Self = StObject.set(x, "GetObjectTypeName", js.Any.fromFunction0(value))
    
    inline def setGetTemplateItems(value: () => Any): Self = StObject.set(x, "GetTemplateItems", js.Any.fromFunction0(value))
    
    inline def setSelectItem(value: String => Unit): Self = StObject.set(x, "SelectItem", js.Any.fromFunction1(value))
  }
}
