package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookSessionInfo extends StObject {
  
  // Id of the workbook session.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // true for persistent session. false for non-persistent session (view mode)
  var persistChanges: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object WorkbookSessionInfo {
  
  inline def apply(): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
  
  extension [Self <: WorkbookSessionInfo](x: Self) {
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPersistChanges(value: NullableOption[Boolean]): Self = StObject.set(x, "persistChanges", value.asInstanceOf[js.Any])
    
    inline def setPersistChangesNull: Self = StObject.set(x, "persistChanges", null)
    
    inline def setPersistChangesUndefined: Self = StObject.set(x, "persistChanges", js.undefined)
  }
}
