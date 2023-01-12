package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedPublisher extends StObject {
  
  // The timestamp when the verified publisher was first added or most recently updated.
  var addedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The verified publisher name from the app publisher's Partner Center account.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the verified publisher from the app publisher's Partner Center account.
  var verifiedPublisherId: js.UndefOr[NullableOption[String]] = js.undefined
}
object VerifiedPublisher {
  
  inline def apply(): VerifiedPublisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedPublisher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedPublisher] (val x: Self) extends AnyVal {
    
    inline def setAddedDateTime(value: NullableOption[String]): Self = StObject.set(x, "addedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAddedDateTimeNull: Self = StObject.set(x, "addedDateTime", null)
    
    inline def setAddedDateTimeUndefined: Self = StObject.set(x, "addedDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setVerifiedPublisherId(value: NullableOption[String]): Self = StObject.set(x, "verifiedPublisherId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedPublisherIdNull: Self = StObject.set(x, "verifiedPublisherId", null)
    
    inline def setVerifiedPublisherIdUndefined: Self = StObject.set(x, "verifiedPublisherId", js.undefined)
  }
}
