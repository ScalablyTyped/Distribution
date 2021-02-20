package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureScore extends Entity {
  
  // Active user count of the given tenant.
  var activeUserCount: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Average score by different scopes (for example, average by industry, average by seating) and control category
    * (Identity, Data, Device, Apps, Infrastructure) within the scope.
    */
  var averageComparativeScores: js.UndefOr[NullableOption[js.Array[AverageComparativeScore]]] = js.native
  
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  
  // Contains tenant scores for a set of controls.
  var controlScores: js.UndefOr[NullableOption[js.Array[ControlScore]]] = js.native
  
  // The date when the entity is created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Tenant current attained score on specified date.
  var currentScore: js.UndefOr[NullableOption[Double]] = js.native
  
  // Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint).
  var enabledServices: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Licensed user count of the given tenant.
  var licensedUserCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Tenant maximum possible score on specified date.
  var maxScore: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=SecureScore). Required.
    */
  var vendorInformation: js.UndefOr[NullableOption[SecurityVendorInformation]] = js.native
}
object SecureScore {
  
  @scala.inline
  def apply(): SecureScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScore]
  }
  
  @scala.inline
  implicit class SecureScoreMutableBuilder[Self <: SecureScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveUserCount(value: NullableOption[Double]): Self = StObject.set(x, "activeUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUserCountNull: Self = StObject.set(x, "activeUserCount", null)
    
    @scala.inline
    def setActiveUserCountUndefined: Self = StObject.set(x, "activeUserCount", js.undefined)
    
    @scala.inline
    def setAverageComparativeScores(value: NullableOption[js.Array[AverageComparativeScore]]): Self = StObject.set(x, "averageComparativeScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageComparativeScoresNull: Self = StObject.set(x, "averageComparativeScores", null)
    
    @scala.inline
    def setAverageComparativeScoresUndefined: Self = StObject.set(x, "averageComparativeScores", js.undefined)
    
    @scala.inline
    def setAverageComparativeScoresVarargs(value: AverageComparativeScore*): Self = StObject.set(x, "averageComparativeScores", js.Array(value :_*))
    
    @scala.inline
    def setAzureTenantId(value: String): Self = StObject.set(x, "azureTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureTenantIdUndefined: Self = StObject.set(x, "azureTenantId", js.undefined)
    
    @scala.inline
    def setControlScores(value: NullableOption[js.Array[ControlScore]]): Self = StObject.set(x, "controlScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlScoresNull: Self = StObject.set(x, "controlScores", null)
    
    @scala.inline
    def setControlScoresUndefined: Self = StObject.set(x, "controlScores", js.undefined)
    
    @scala.inline
    def setControlScoresVarargs(value: ControlScore*): Self = StObject.set(x, "controlScores", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCurrentScore(value: NullableOption[Double]): Self = StObject.set(x, "currentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentScoreNull: Self = StObject.set(x, "currentScore", null)
    
    @scala.inline
    def setCurrentScoreUndefined: Self = StObject.set(x, "currentScore", js.undefined)
    
    @scala.inline
    def setEnabledServices(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "enabledServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledServicesNull: Self = StObject.set(x, "enabledServices", null)
    
    @scala.inline
    def setEnabledServicesUndefined: Self = StObject.set(x, "enabledServices", js.undefined)
    
    @scala.inline
    def setEnabledServicesVarargs(value: String*): Self = StObject.set(x, "enabledServices", js.Array(value :_*))
    
    @scala.inline
    def setLicensedUserCount(value: NullableOption[Double]): Self = StObject.set(x, "licensedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensedUserCountNull: Self = StObject.set(x, "licensedUserCount", null)
    
    @scala.inline
    def setLicensedUserCountUndefined: Self = StObject.set(x, "licensedUserCount", js.undefined)
    
    @scala.inline
    def setMaxScore(value: NullableOption[Double]): Self = StObject.set(x, "maxScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScoreNull: Self = StObject.set(x, "maxScore", null)
    
    @scala.inline
    def setMaxScoreUndefined: Self = StObject.set(x, "maxScore", js.undefined)
    
    @scala.inline
    def setVendorInformation(value: NullableOption[SecurityVendorInformation]): Self = StObject.set(x, "vendorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorInformationNull: Self = StObject.set(x, "vendorInformation", null)
    
    @scala.inline
    def setVendorInformationUndefined: Self = StObject.set(x, "vendorInformation", js.undefined)
  }
}
