package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1Progress extends StObject {
  
  /** The amount of work completed. */
  var completedWork: js.UndefOr[String] = js.undefined
  
  /** The amount of work estimated. */
  var estimatedWork: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1Progress {
  
  inline def apply(): GoogleFirestoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleFirestoreAdminV1Progress] (val x: Self) extends AnyVal {
    
    inline def setCompletedWork(value: String): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
    
    inline def setCompletedWorkUndefined: Self = StObject.set(x, "completedWork", js.undefined)
    
    inline def setEstimatedWork(value: String): Self = StObject.set(x, "estimatedWork", value.asInstanceOf[js.Any])
    
    inline def setEstimatedWorkUndefined: Self = StObject.set(x, "estimatedWork", js.undefined)
  }
}
