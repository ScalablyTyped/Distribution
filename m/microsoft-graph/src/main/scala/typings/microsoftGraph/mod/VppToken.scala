package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VppToken
  extends StObject
     with Entity {
  
  // The apple Id associated with the given Apple Volume Purchase Program Token.
  var appleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether or not apps for the VPP token will be automatically updated.
  var automaticallyUpdateApps: js.UndefOr[Boolean] = js.undefined
  
  // Whether or not apps for the VPP token will be automatically updated.
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expiration date time of the Apple Volume Purchase Program Token.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  // Last modification date time associated with the Apple Volume Purchase Program Token.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The last time when an application sync was done with the Apple volume purchase program service using the the Apple
    * Volume Purchase Program Token.
    */
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token.
    * Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
    */
  var lastSyncStatus: js.UndefOr[VppTokenSyncStatus] = js.undefined
  
  // The organization associated with the Apple Volume Purchase Program Token
  var organizationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid,
    * assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
    */
  var state: js.UndefOr[VppTokenState] = js.undefined
  
  // The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
  var token: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.undefined
}
object VppToken {
  
  inline def apply(): VppToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppToken]
  }
  
  extension [Self <: VppToken](x: Self) {
    
    inline def setAppleId(value: NullableOption[String]): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    inline def setAppleIdNull: Self = StObject.set(x, "appleId", null)
    
    inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    inline def setAutomaticallyUpdateApps(value: Boolean): Self = StObject.set(x, "automaticallyUpdateApps", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyUpdateAppsUndefined: Self = StObject.set(x, "automaticallyUpdateApps", js.undefined)
    
    inline def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    inline def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    inline def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    inline def setLastSyncStatus(value: VppTokenSyncStatus): Self = StObject.set(x, "lastSyncStatus", value.asInstanceOf[js.Any])
    
    inline def setLastSyncStatusUndefined: Self = StObject.set(x, "lastSyncStatus", js.undefined)
    
    inline def setOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNameNull: Self = StObject.set(x, "organizationName", null)
    
    inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
    
    inline def setState(value: VppTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setToken(value: NullableOption[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setVppTokenAccountType(value: VppTokenAccountType): Self = StObject.set(x, "vppTokenAccountType", value.asInstanceOf[js.Any])
    
    inline def setVppTokenAccountTypeUndefined: Self = StObject.set(x, "vppTokenAccountType", js.undefined)
  }
}
