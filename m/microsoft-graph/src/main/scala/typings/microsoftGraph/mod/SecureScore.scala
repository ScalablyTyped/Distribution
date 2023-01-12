package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureScore
  extends StObject
     with Entity {
  
  // Active user count of the given tenant.
  var activeUserCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Average score by different scopes (for example, average by industry, average by seating) and control category
    * (Identity, Data, Device, Apps, Infrastructure) within the scope.
    */
  var averageComparativeScores: js.UndefOr[NullableOption[js.Array[AverageComparativeScore]]] = js.undefined
  
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.undefined
  
  // Contains tenant scores for a set of controls.
  var controlScores: js.UndefOr[NullableOption[js.Array[ControlScore]]] = js.undefined
  
  // The date when the entity is created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Tenant current attained score on specified date.
  var currentScore: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
  var enabledServices: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Licensed user count of the given tenant.
  var licensedUserCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Tenant maximum possible score on specified date.
  var maxScore: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=SecureScore). Required.
    */
  var vendorInformation: js.UndefOr[NullableOption[SecurityVendorInformation]] = js.undefined
}
object SecureScore {
  
  inline def apply(): SecureScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecureScore] (val x: Self) extends AnyVal {
    
    inline def setActiveUserCount(value: NullableOption[Double]): Self = StObject.set(x, "activeUserCount", value.asInstanceOf[js.Any])
    
    inline def setActiveUserCountNull: Self = StObject.set(x, "activeUserCount", null)
    
    inline def setActiveUserCountUndefined: Self = StObject.set(x, "activeUserCount", js.undefined)
    
    inline def setAverageComparativeScores(value: NullableOption[js.Array[AverageComparativeScore]]): Self = StObject.set(x, "averageComparativeScores", value.asInstanceOf[js.Any])
    
    inline def setAverageComparativeScoresNull: Self = StObject.set(x, "averageComparativeScores", null)
    
    inline def setAverageComparativeScoresUndefined: Self = StObject.set(x, "averageComparativeScores", js.undefined)
    
    inline def setAverageComparativeScoresVarargs(value: AverageComparativeScore*): Self = StObject.set(x, "averageComparativeScores", js.Array(value*))
    
    inline def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    inline def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    inline def setControlScores(value: NullableOption[js.Array[ControlScore]]): Self = StObject.set(x, "controlScores", value.asInstanceOf[js.Any])
    
    inline def setControlScoresNull: Self = StObject.set(x, "controlScores", null)
    
    inline def setControlScoresUndefined: Self = StObject.set(x, "controlScores", js.undefined)
    
    inline def setControlScoresVarargs(value: ControlScore*): Self = StObject.set(x, "controlScores", js.Array(value*))
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCurrentScore(value: NullableOption[Double]): Self = StObject.set(x, "currentScore", value.asInstanceOf[js.Any])
    
    inline def setCurrentScoreNull: Self = StObject.set(x, "currentScore", null)
    
    inline def setCurrentScoreUndefined: Self = StObject.set(x, "currentScore", js.undefined)
    
    inline def setEnabledServices(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enabledServices", value.asInstanceOf[js.Any])
    
    inline def setEnabledServicesNull: Self = StObject.set(x, "enabledServices", null)
    
    inline def setEnabledServicesUndefined: Self = StObject.set(x, "enabledServices", js.undefined)
    
    inline def setEnabledServicesVarargs(value: String*): Self = StObject.set(x, "enabledServices", js.Array(value*))
    
    inline def setLicensedUserCount(value: NullableOption[Double]): Self = StObject.set(x, "licensedUserCount", value.asInstanceOf[js.Any])
    
    inline def setLicensedUserCountNull: Self = StObject.set(x, "licensedUserCount", null)
    
    inline def setLicensedUserCountUndefined: Self = StObject.set(x, "licensedUserCount", js.undefined)
    
    inline def setMaxScore(value: NullableOption[Double]): Self = StObject.set(x, "maxScore", value.asInstanceOf[js.Any])
    
    inline def setMaxScoreNull: Self = StObject.set(x, "maxScore", null)
    
    inline def setMaxScoreUndefined: Self = StObject.set(x, "maxScore", js.undefined)
    
    inline def setVendorInformation(value: NullableOption[SecurityVendorInformation]): Self = StObject.set(x, "vendorInformation", value.asInstanceOf[js.Any])
    
    inline def setVendorInformationNull: Self = StObject.set(x, "vendorInformation", null)
    
    inline def setVendorInformationUndefined: Self = StObject.set(x, "vendorInformation", js.undefined)
  }
}
