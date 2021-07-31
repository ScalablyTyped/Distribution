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
  
  @scala.inline
  def apply(): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
  
  @scala.inline
  implicit class WorkbookSessionInfoMutableBuilder[Self <: WorkbookSessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPersistChanges(value: NullableOption[Boolean]): Self = StObject.set(x, "persistChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistChangesNull: Self = StObject.set(x, "persistChanges", null)
    
    @scala.inline
    def setPersistChangesUndefined: Self = StObject.set(x, "persistChanges", js.undefined)
  }
}
