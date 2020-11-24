package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUniversalAppX extends MobileLobApp {
  
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.native
  
  /**
    * The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic,
    * team.
    */
  var applicableDeviceTypes: js.UndefOr[WindowsDeviceType] = js.native
  
  // The Identity Name.
  var identityName: js.UndefOr[NullableOption[String]] = js.native
  
  // The Identity Publisher Hash.
  var identityPublisherHash: js.UndefOr[String] = js.native
  
  // The Identity Resource Identifier.
  var identityResourceIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity version.
  var identityVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether or not the app is a bundle.
  var isBundle: js.UndefOr[Boolean] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.native
}
object WindowsUniversalAppX {
  
  @scala.inline
  def apply(): WindowsUniversalAppX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppX]
  }
  
  @scala.inline
  implicit class WindowsUniversalAppXOps[Self <: WindowsUniversalAppX] (val x: Self) extends AnyVal {
    
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
    def setApplicableArchitectures(value: WindowsArchitecture): Self = this.set("applicableArchitectures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableArchitectures: Self = this.set("applicableArchitectures", js.undefined)
    
    @scala.inline
    def setApplicableDeviceTypes(value: WindowsDeviceType): Self = this.set("applicableDeviceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableDeviceTypes: Self = this.set("applicableDeviceTypes", js.undefined)
    
    @scala.inline
    def setIdentityName(value: NullableOption[String]): Self = this.set("identityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityName: Self = this.set("identityName", js.undefined)
    
    @scala.inline
    def setIdentityNameNull: Self = this.set("identityName", null)
    
    @scala.inline
    def setIdentityPublisherHash(value: String): Self = this.set("identityPublisherHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPublisherHash: Self = this.set("identityPublisherHash", js.undefined)
    
    @scala.inline
    def setIdentityResourceIdentifier(value: NullableOption[String]): Self = this.set("identityResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityResourceIdentifier: Self = this.set("identityResourceIdentifier", js.undefined)
    
    @scala.inline
    def setIdentityResourceIdentifierNull: Self = this.set("identityResourceIdentifier", null)
    
    @scala.inline
    def setIdentityVersion(value: NullableOption[String]): Self = this.set("identityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityVersion: Self = this.set("identityVersion", js.undefined)
    
    @scala.inline
    def setIdentityVersionNull: Self = this.set("identityVersion", null)
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = this.set("isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBundle: Self = this.set("isBundle", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: WindowsMinimumOperatingSystem): Self = this.set("minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedOperatingSystem: Self = this.set("minimumSupportedOperatingSystem", js.undefined)
  }
}
