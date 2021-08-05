package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelChangedEvent extends StObject {
  
  /**
    * The `uri` of the new model or null.
    */
  val newModelUrl: Uri | Null
  
  /**
    * The `uri` of the previous model or null.
    */
  val oldModelUrl: Uri | Null
}
object IModelChangedEvent {
  
  inline def apply(): IModelChangedEvent = {
    val __obj = js.Dynamic.literal(newModelUrl = null, oldModelUrl = null)
    __obj.asInstanceOf[IModelChangedEvent]
  }
  
  extension [Self <: IModelChangedEvent](x: Self) {
    
    inline def setNewModelUrl(value: Uri): Self = StObject.set(x, "newModelUrl", value.asInstanceOf[js.Any])
    
    inline def setNewModelUrlNull: Self = StObject.set(x, "newModelUrl", null)
    
    inline def setOldModelUrl(value: Uri): Self = StObject.set(x, "oldModelUrl", value.asInstanceOf[js.Any])
    
    inline def setOldModelUrlNull: Self = StObject.set(x, "oldModelUrl", null)
  }
}
