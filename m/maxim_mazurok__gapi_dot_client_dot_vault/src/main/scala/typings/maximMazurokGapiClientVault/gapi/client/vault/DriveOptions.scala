package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveOptions extends js.Object {
  
  /** Set to true to include shared drive. */
  var includeSharedDrives: js.UndefOr[Boolean] = js.native
  
  /** Set to true to include Team Drive. */
  var includeTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Search the versions of the Drive file as of the reference date. These timestamps are in GMT and rounded down to the given date. */
  var versionDate: js.UndefOr[String] = js.native
}
object DriveOptions {
  
  @scala.inline
  def apply(): DriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveOptions]
  }
  
  @scala.inline
  implicit class DriveOptionsOps[Self <: DriveOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeSharedDrives(value: Boolean): Self = this.set("includeSharedDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSharedDrives: Self = this.set("includeSharedDrives", js.undefined)
    
    @scala.inline
    def setIncludeTeamDrives(value: Boolean): Self = this.set("includeTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTeamDrives: Self = this.set("includeTeamDrives", js.undefined)
    
    @scala.inline
    def setVersionDate(value: String): Self = this.set("versionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionDate: Self = this.set("versionDate", js.undefined)
  }
}
