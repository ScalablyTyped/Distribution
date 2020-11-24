package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectTemplateSelector extends js.Object {
  
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
  implicit class IObjectTemplateSelectorOps[Self <: IObjectTemplateSelector] (val x: Self) extends AnyVal {
    
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
    def setClassSelector(value: IMetadataCardControl): Self = this.set("ClassSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: IEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetObjectTypeIconURL(value: () => String): Self = this.set("GetObjectTypeIconURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObjectTypeId(value: () => Double): Self = this.set("GetObjectTypeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObjectTypeName(value: () => String): Self = this.set("GetObjectTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTemplateItems(value: () => js.Any): Self = this.set("GetTemplateItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectItem(value: String => Unit): Self = this.set("SelectItem", js.Any.fromFunction1(value))
  }
}
