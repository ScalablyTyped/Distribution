package typings.npmProfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileFetchOptions extends js.Object {
  
  /** passed through to prompter */
  var creds: js.UndefOr[ProfileCredentials] = js.native
  
  /**
    * the hostname of the current machine, to show the user during the WebAuth flow.
    * @default os.hostname()
    */
  var hostname: js.UndefOr[String] = js.native
}
object ProfileFetchOptions {
  
  @scala.inline
  def apply(): ProfileFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileFetchOptions]
  }
  
  @scala.inline
  implicit class ProfileFetchOptionsOps[Self <: ProfileFetchOptions] (val x: Self) extends AnyVal {
    
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
    def setCreds(value: ProfileCredentials): Self = this.set("creds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreds: Self = this.set("creds", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
  }
}
