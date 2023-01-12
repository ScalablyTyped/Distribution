package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.editor.IMarkerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionContext extends StObject {
  
  /**
    * An array of diagnostics.
    */
  val markers: js.Array[IMarkerData]
  
  /**
    * Requested kind of actions to return.
    */
  val only: js.UndefOr[String] = js.undefined
  
  /**
    * The reason why code actions were requested.
    */
  val trigger: CodeActionTriggerType
}
object CodeActionContext {
  
  inline def apply(markers: js.Array[IMarkerData], trigger: CodeActionTriggerType): CodeActionContext = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    
    inline def setMarkers(value: js.Array[IMarkerData]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: IMarkerData*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setOnly(value: String): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setTrigger(value: CodeActionTriggerType): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
