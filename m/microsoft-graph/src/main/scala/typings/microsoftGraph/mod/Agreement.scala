package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agreement
  extends StObject
     with Entity {
  
  // Read-only. Information about acceptances of this agreement.
  var acceptances: js.UndefOr[NullableOption[js.Array[AgreementAcceptance]]] = js.undefined
  
  /**
    * Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end
    * users who view the agreement. Supports $filter (eq).
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Default PDF linked to this agreement.
  var file: js.UndefOr[NullableOption[AgreementFile]] = js.undefined
  
  /**
    * PDFs linked to this agreement. This property is in the process of being deprecated. Use the file property instead.
    * Supports $expand.
    */
  var files: js.UndefOr[NullableOption[js.Array[AgreementFileLocalization]]] = js.undefined
  
  /**
    * Indicates whether end users are required to accept this agreement on every device that they access it from. The end
    * user is required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
    */
  var isPerDeviceAcceptanceRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
  var isViewingBeforeAcceptanceRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
  var termsExpiration: js.UndefOr[NullableOption[TermsExpiration]] = js.undefined
  
  /**
    * The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for
    * durations. Supports $filter (eq).
    */
  var userReacceptRequiredFrequency: js.UndefOr[NullableOption[String]] = js.undefined
}
object Agreement {
  
  inline def apply(): Agreement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agreement]
  }
  
  extension [Self <: Agreement](x: Self) {
    
    inline def setAcceptances(value: NullableOption[js.Array[AgreementAcceptance]]): Self = StObject.set(x, "acceptances", value.asInstanceOf[js.Any])
    
    inline def setAcceptancesNull: Self = StObject.set(x, "acceptances", null)
    
    inline def setAcceptancesUndefined: Self = StObject.set(x, "acceptances", js.undefined)
    
    inline def setAcceptancesVarargs(value: AgreementAcceptance*): Self = StObject.set(x, "acceptances", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFile(value: NullableOption[AgreementFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFiles(value: NullableOption[js.Array[AgreementFileLocalization]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesNull: Self = StObject.set(x, "files", null)
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: AgreementFileLocalization*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setIsPerDeviceAcceptanceRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isPerDeviceAcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setIsPerDeviceAcceptanceRequiredNull: Self = StObject.set(x, "isPerDeviceAcceptanceRequired", null)
    
    inline def setIsPerDeviceAcceptanceRequiredUndefined: Self = StObject.set(x, "isPerDeviceAcceptanceRequired", js.undefined)
    
    inline def setIsViewingBeforeAcceptanceRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isViewingBeforeAcceptanceRequired", value.asInstanceOf[js.Any])
    
    inline def setIsViewingBeforeAcceptanceRequiredNull: Self = StObject.set(x, "isViewingBeforeAcceptanceRequired", null)
    
    inline def setIsViewingBeforeAcceptanceRequiredUndefined: Self = StObject.set(x, "isViewingBeforeAcceptanceRequired", js.undefined)
    
    inline def setTermsExpiration(value: NullableOption[TermsExpiration]): Self = StObject.set(x, "termsExpiration", value.asInstanceOf[js.Any])
    
    inline def setTermsExpirationNull: Self = StObject.set(x, "termsExpiration", null)
    
    inline def setTermsExpirationUndefined: Self = StObject.set(x, "termsExpiration", js.undefined)
    
    inline def setUserReacceptRequiredFrequency(value: NullableOption[String]): Self = StObject.set(x, "userReacceptRequiredFrequency", value.asInstanceOf[js.Any])
    
    inline def setUserReacceptRequiredFrequencyNull: Self = StObject.set(x, "userReacceptRequiredFrequency", null)
    
    inline def setUserReacceptRequiredFrequencyUndefined: Self = StObject.set(x, "userReacceptRequiredFrequency", js.undefined)
  }
}
