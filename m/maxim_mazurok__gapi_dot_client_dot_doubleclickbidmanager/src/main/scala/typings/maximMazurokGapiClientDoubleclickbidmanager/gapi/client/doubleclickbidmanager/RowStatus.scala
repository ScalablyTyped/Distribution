package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowStatus extends StObject {
  
  /** Whether the stored entity is changed as a result of upload. */
  var changed: js.UndefOr[Boolean] = js.undefined
  
  /** Entity Id. */
  var entityId: js.UndefOr[String] = js.undefined
  
  /** Entity name. */
  var entityName: js.UndefOr[String] = js.undefined
  
  /** Reasons why the entity can't be uploaded. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the entity is persisted. */
  var persisted: js.UndefOr[Boolean] = js.undefined
  
  /** Row number. */
  var rowNumber: js.UndefOr[Double] = js.undefined
}
object RowStatus {
  
  inline def apply(): RowStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowStatus]
  }
  
  extension [Self <: RowStatus](x: Self) {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    inline def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
    
    inline def setRowNumber(value: Double): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    inline def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
  }
}
