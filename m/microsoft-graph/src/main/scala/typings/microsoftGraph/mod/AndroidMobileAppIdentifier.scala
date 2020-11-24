package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidMobileAppIdentifier extends MobileAppIdentifier {
  
  // The identifier for an app, as specified in the play store.
  var packageId: js.UndefOr[String] = js.native
}
object AndroidMobileAppIdentifier {
  
  @scala.inline
  def apply(): AndroidMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMobileAppIdentifier]
  }
  
  @scala.inline
  implicit class AndroidMobileAppIdentifierOps[Self <: AndroidMobileAppIdentifier] (val x: Self) extends AnyVal {
    
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
    def setPackageId(value: String): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
  }
}
