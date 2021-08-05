package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /** When 'ACCOUNT' is chosen as search method, account_info needs to be specified. */
  var accountInfo: js.UndefOr[AccountInfo] = js.undefined
  
  /** The corpus to search. */
  var corpus: js.UndefOr[String] = js.undefined
  
  /** The data source to search from. */
  var dataScope: js.UndefOr[String] = js.undefined
  
  /** For Drive search, specify more options in this field. */
  var driveOptions: js.UndefOr[DriveOptions] = js.undefined
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only) */
  var hangoutsChatInfo: js.UndefOr[HangoutsChatInfo] = js.undefined
  
  /** For hangouts chat search, specify more options in this field. (read-only) */
  var hangoutsChatOptions: js.UndefOr[HangoutsChatOptions] = js.undefined
  
  /** For mail search, specify more options in this field. */
  var mailOptions: js.UndefOr[MailOptions] = js.undefined
  
  /**
    * The search method to use. This field is similar to the search_method field but is introduced to support shared drives. It supports all search method types. In case the search_method
    * is TEAM_DRIVE the response of this field will be SHARED_DRIVE only.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /** When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified. */
  var orgUnitInfo: js.UndefOr[OrgUnitInfo] = js.undefined
  
  /** The search method to use. */
  var searchMethod: js.UndefOr[String] = js.undefined
  
  /** When 'SHARED_DRIVE' is chosen as search method, shared_drive_info needs to be specified. */
  var sharedDriveInfo: js.UndefOr[SharedDriveInfo] = js.undefined
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified. */
  var teamDriveInfo: js.UndefOr[TeamDriveInfo] = js.undefined
  
  /** The corpus-specific search operators used to generate search results. */
  var terms: js.UndefOr[String] = js.undefined
  
  /** The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more information, see Time Zone. */
  var timeZone: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setAccountInfo(value: AccountInfo): Self = StObject.set(x, "accountInfo", value.asInstanceOf[js.Any])
    
    inline def setAccountInfoUndefined: Self = StObject.set(x, "accountInfo", js.undefined)
    
    inline def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    inline def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    inline def setDataScope(value: String): Self = StObject.set(x, "dataScope", value.asInstanceOf[js.Any])
    
    inline def setDataScopeUndefined: Self = StObject.set(x, "dataScope", js.undefined)
    
    inline def setDriveOptions(value: DriveOptions): Self = StObject.set(x, "driveOptions", value.asInstanceOf[js.Any])
    
    inline def setDriveOptionsUndefined: Self = StObject.set(x, "driveOptions", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHangoutsChatInfo(value: HangoutsChatInfo): Self = StObject.set(x, "hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatInfoUndefined: Self = StObject.set(x, "hangoutsChatInfo", js.undefined)
    
    inline def setHangoutsChatOptions(value: HangoutsChatOptions): Self = StObject.set(x, "hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    inline def setHangoutsChatOptionsUndefined: Self = StObject.set(x, "hangoutsChatOptions", js.undefined)
    
    inline def setMailOptions(value: MailOptions): Self = StObject.set(x, "mailOptions", value.asInstanceOf[js.Any])
    
    inline def setMailOptionsUndefined: Self = StObject.set(x, "mailOptions", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrgUnitInfo(value: OrgUnitInfo): Self = StObject.set(x, "orgUnitInfo", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitInfoUndefined: Self = StObject.set(x, "orgUnitInfo", js.undefined)
    
    inline def setSearchMethod(value: String): Self = StObject.set(x, "searchMethod", value.asInstanceOf[js.Any])
    
    inline def setSearchMethodUndefined: Self = StObject.set(x, "searchMethod", js.undefined)
    
    inline def setSharedDriveInfo(value: SharedDriveInfo): Self = StObject.set(x, "sharedDriveInfo", value.asInstanceOf[js.Any])
    
    inline def setSharedDriveInfoUndefined: Self = StObject.set(x, "sharedDriveInfo", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTeamDriveInfo(value: TeamDriveInfo): Self = StObject.set(x, "teamDriveInfo", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveInfoUndefined: Self = StObject.set(x, "teamDriveInfo", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
