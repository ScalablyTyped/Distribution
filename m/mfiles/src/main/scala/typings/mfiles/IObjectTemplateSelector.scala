package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTemplateSelector extends StObject {
  
  val ClassSelector: IMetadataCardControl = js.native
  
  val Events: IEvents = js.native
  
  def GetObjectTypeIconURL(): String = js.native
  
  def GetObjectTypeId(): Double = js.native
  
  def GetObjectTypeName(): String = js.native
  
  def GetTemplateItems(): js.Any = js.native
  
  def SelectItem(itemID: String): Unit = js.native
}
object IObjectTemplateSelector {
  
  @scala.inline
  def apply(
    ClassSelector: IMetadataCardControl,
    Events: IEvents,
    GetObjectTypeIconURL: () => String,
    GetObjectTypeId: () => Double,
    GetObjectTypeName: () => String,
    GetTemplateItems: () => js.Any,
    SelectItem: String => Unit
  ): IObjectTemplateSelector = {
    val __obj = js.Dynamic.literal(ClassSelector = ClassSelector.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GetObjectTypeIconURL = js.Any.fromFunction0(GetObjectTypeIconURL), GetObjectTypeId = js.Any.fromFunction0(GetObjectTypeId), GetObjectTypeName = js.Any.fromFunction0(GetObjectTypeName), GetTemplateItems = js.Any.fromFunction0(GetTemplateItems), SelectItem = js.Any.fromFunction1(SelectItem))
    __obj.asInstanceOf[IObjectTemplateSelector]
  }
  
  @scala.inline
  implicit class IObjectTemplateSelectorMutableBuilder[Self <: IObjectTemplateSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassSelector(value: IMetadataCardControl): Self = StObject.set(x, "ClassSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectTypeIconURL(value: () => String): Self = StObject.set(x, "GetObjectTypeIconURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObjectTypeId(value: () => Double): Self = StObject.set(x, "GetObjectTypeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObjectTypeName(value: () => String): Self = StObject.set(x, "GetObjectTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplateItems(value: () => js.Any): Self = StObject.set(x, "GetTemplateItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectItem(value: String => Unit): Self = StObject.set(x, "SelectItem", js.Any.fromFunction1(value))
  }
}
