package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelChangedEvent extends js.Object {
  
  /**
    * The `uri` of the new model or null.
    */
  val newModelUrl: Uri | Null = js.native
  
  /**
    * The `uri` of the previous model or null.
    */
  val oldModelUrl: Uri | Null = js.native
}
object IModelChangedEvent {
  
  @scala.inline
  def apply(): IModelChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelChangedEvent]
  }
  
  @scala.inline
  implicit class IModelChangedEventOps[Self <: IModelChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setNewModelUrl(value: Uri): Self = this.set("newModelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewModelUrlNull: Self = this.set("newModelUrl", null)
    
    @scala.inline
    def setOldModelUrl(value: Uri): Self = this.set("oldModelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldModelUrlNull: Self = this.set("oldModelUrl", null)
  }
}
