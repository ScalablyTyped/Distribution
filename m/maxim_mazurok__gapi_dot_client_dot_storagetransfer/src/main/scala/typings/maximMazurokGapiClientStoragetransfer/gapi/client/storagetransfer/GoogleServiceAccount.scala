package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleServiceAccount extends StObject {
  
  /** Email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the service account. */
  var subjectId: js.UndefOr[String] = js.undefined
}
object GoogleServiceAccount {
  
  inline def apply(): GoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleServiceAccount]
  }
  
  extension [Self <: GoogleServiceAccount](x: Self) {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
    
    inline def setSubjectId(value: String): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
