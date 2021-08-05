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
}
object CodeActionContext {
  
  inline def apply(markers: js.Array[IMarkerData]): CodeActionContext = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  extension [Self <: CodeActionContext](x: Self) {
    
    inline def setMarkers(value: js.Array[IMarkerData]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: IMarkerData*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    inline def setOnly(value: String): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
  }
}
