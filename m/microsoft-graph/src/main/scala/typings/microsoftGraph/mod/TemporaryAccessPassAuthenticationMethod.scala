package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporaryAccessPassAuthenticationMethod
  extends StObject
     with Entity {
  
  // The date and time when the Temporary Access Pass was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state of the authentication method that indicates whether it's currently usable by the user.
  var isUsable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Determines whether the pass is limited to a one-time use. If true, the pass can be used once; if false, the pass can be
    * used multiple times within the Temporary Access Pass lifetime.
    */
  var isUsableOnce: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The lifetime of the Temporary Access Pass in minutes starting at startDateTime. Must be between 10 and 43200 inclusive
    * (equivalent to 30 days).
    */
  var lifetimeInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Details about the usability state (isUsable). Reasons can include: EnabledByPolicy, DisabledByPolicy, Expired,
    * NotYetValid, OneTimeUsed.
    */
  var methodUsabilityReason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time when the Temporary Access Pass becomes available to use and when isUsable is true is enforced.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Temporary Access Pass used to authenticate. Returned only on creation of a new
    * temporaryAccessPassAuthenticationMethod object; Hidden in subsequent read operations and returned as null with GET.
    */
  var temporaryAccessPass: js.UndefOr[NullableOption[String]] = js.undefined
}
object TemporaryAccessPassAuthenticationMethod {
  
  inline def apply(): TemporaryAccessPassAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporaryAccessPassAuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemporaryAccessPassAuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setIsUsable(value: NullableOption[Boolean]): Self = StObject.set(x, "isUsable", value.asInstanceOf[js.Any])
    
    inline def setIsUsableNull: Self = StObject.set(x, "isUsable", null)
    
    inline def setIsUsableOnce(value: NullableOption[Boolean]): Self = StObject.set(x, "isUsableOnce", value.asInstanceOf[js.Any])
    
    inline def setIsUsableOnceNull: Self = StObject.set(x, "isUsableOnce", null)
    
    inline def setIsUsableOnceUndefined: Self = StObject.set(x, "isUsableOnce", js.undefined)
    
    inline def setIsUsableUndefined: Self = StObject.set(x, "isUsable", js.undefined)
    
    inline def setLifetimeInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "lifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setLifetimeInMinutesNull: Self = StObject.set(x, "lifetimeInMinutes", null)
    
    inline def setLifetimeInMinutesUndefined: Self = StObject.set(x, "lifetimeInMinutes", js.undefined)
    
    inline def setMethodUsabilityReason(value: NullableOption[String]): Self = StObject.set(x, "methodUsabilityReason", value.asInstanceOf[js.Any])
    
    inline def setMethodUsabilityReasonNull: Self = StObject.set(x, "methodUsabilityReason", null)
    
    inline def setMethodUsabilityReasonUndefined: Self = StObject.set(x, "methodUsabilityReason", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTemporaryAccessPass(value: NullableOption[String]): Self = StObject.set(x, "temporaryAccessPass", value.asInstanceOf[js.Any])
    
    inline def setTemporaryAccessPassNull: Self = StObject.set(x, "temporaryAccessPass", null)
    
    inline def setTemporaryAccessPassUndefined: Self = StObject.set(x, "temporaryAccessPass", js.undefined)
  }
}
