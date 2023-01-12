package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLabelsResponse extends StObject {
  
  /** This is always drive#modifyLabelsResponse */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of labels which were added or updated by the request. */
  var modifiedLabels: js.UndefOr[js.Array[Label]] = js.undefined
}
object ModifyLabelsResponse {
  
  inline def apply(): ModifyLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLabelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyLabelsResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedLabels(value: js.Array[Label]): Self = StObject.set(x, "modifiedLabels", value.asInstanceOf[js.Any])
    
    inline def setModifiedLabelsUndefined: Self = StObject.set(x, "modifiedLabels", js.undefined)
    
    inline def setModifiedLabelsVarargs(value: Label*): Self = StObject.set(x, "modifiedLabels", js.Array(value*))
  }
}
