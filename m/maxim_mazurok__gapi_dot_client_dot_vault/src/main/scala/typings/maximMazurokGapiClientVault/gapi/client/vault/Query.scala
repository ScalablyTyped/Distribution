package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  /** When 'ACCOUNT' is chosen as search method, account_info needs to be specified. */
  var accountInfo: js.UndefOr[AccountInfo] = js.native
  
  /** The corpus to search. */
  var corpus: js.UndefOr[String] = js.native
  
  /** The data source to search from. */
  var dataScope: js.UndefOr[String] = js.native
  
  /** For Drive search, specify more options in this field. */
  var driveOptions: js.UndefOr[DriveOptions] = js.native
  
  /** The end time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var endTime: js.UndefOr[String] = js.native
  
  /** When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only) */
  var hangoutsChatInfo: js.UndefOr[HangoutsChatInfo] = js.native
  
  /** For hangouts chat search, specify more options in this field. (read-only) */
  var hangoutsChatOptions: js.UndefOr[HangoutsChatOptions] = js.native
  
  /** For mail search, specify more options in this field. */
  var mailOptions: js.UndefOr[MailOptions] = js.native
  
  /**
    * The search method to use. This field is similar to the search_method field but is introduced to support shared drives. It supports all search method types. In case the search_method
    * is TEAM_DRIVE the response of this field will be SHARED_DRIVE only.
    */
  var method: js.UndefOr[String] = js.native
  
  /** When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified. */
  var orgUnitInfo: js.UndefOr[OrgUnitInfo] = js.native
  
  /** The search method to use. */
  var searchMethod: js.UndefOr[String] = js.native
  
  /** When 'SHARED_DRIVE' is chosen as search method, shared_drive_info needs to be specified. */
  var sharedDriveInfo: js.UndefOr[SharedDriveInfo] = js.native
  
  /** The start time range for the search query. These timestamps are in GMT and rounded down to the start of the given date. */
  var startTime: js.UndefOr[String] = js.native
  
  /** When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified. */
  var teamDriveInfo: js.UndefOr[TeamDriveInfo] = js.native
  
  /** The corpus-specific search operators used to generate search results. */
  var terms: js.UndefOr[String] = js.native
  
  /** The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more information, see Time Zone. */
  var timeZone: js.UndefOr[String] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountInfo(value: AccountInfo): Self = this.set("accountInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountInfo: Self = this.set("accountInfo", js.undefined)
    
    @scala.inline
    def setCorpus(value: String): Self = this.set("corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorpus: Self = this.set("corpus", js.undefined)
    
    @scala.inline
    def setDataScope(value: String): Self = this.set("dataScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataScope: Self = this.set("dataScope", js.undefined)
    
    @scala.inline
    def setDriveOptions(value: DriveOptions): Self = this.set("driveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveOptions: Self = this.set("driveOptions", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setHangoutsChatInfo(value: HangoutsChatInfo): Self = this.set("hangoutsChatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatInfo: Self = this.set("hangoutsChatInfo", js.undefined)
    
    @scala.inline
    def setHangoutsChatOptions(value: HangoutsChatOptions): Self = this.set("hangoutsChatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatOptions: Self = this.set("hangoutsChatOptions", js.undefined)
    
    @scala.inline
    def setMailOptions(value: MailOptions): Self = this.set("mailOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailOptions: Self = this.set("mailOptions", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOrgUnitInfo(value: OrgUnitInfo): Self = this.set("orgUnitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitInfo: Self = this.set("orgUnitInfo", js.undefined)
    
    @scala.inline
    def setSearchMethod(value: String): Self = this.set("searchMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchMethod: Self = this.set("searchMethod", js.undefined)
    
    @scala.inline
    def setSharedDriveInfo(value: SharedDriveInfo): Self = this.set("sharedDriveInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDriveInfo: Self = this.set("sharedDriveInfo", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTeamDriveInfo(value: TeamDriveInfo): Self = this.set("teamDriveInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDriveInfo: Self = this.set("teamDriveInfo", js.undefined)
    
    @scala.inline
    def setTerms(value: String): Self = this.set("terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerms: Self = this.set("terms", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
