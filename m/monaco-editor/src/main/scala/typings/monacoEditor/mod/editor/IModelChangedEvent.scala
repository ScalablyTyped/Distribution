package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelChangedEvent extends StObject {
  
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
  implicit class IModelChangedEventMutableBuilder[Self <: IModelChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewModelUrl(value: Uri): Self = StObject.set(x, "newModelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewModelUrlNull: Self = StObject.set(x, "newModelUrl", null)
    
    @scala.inline
    def setOldModelUrl(value: Uri): Self = StObject.set(x, "oldModelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldModelUrlNull: Self = StObject.set(x, "oldModelUrl", null)
  }
}
