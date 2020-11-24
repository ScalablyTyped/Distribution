package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryVersionedPackage extends js.Object {
  
  /** The system architecture this package is intended for. */
  var architecture: js.UndefOr[String] = js.native
  
  /** The name of the package. */
  var packageName: js.UndefOr[String] = js.native
  
  /** The version of the package. */
  var version: js.UndefOr[String] = js.native
}
object InventoryVersionedPackage {
  
  @scala.inline
  def apply(): InventoryVersionedPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryVersionedPackage]
  }
  
  @scala.inline
  implicit class InventoryVersionedPackageOps[Self <: InventoryVersionedPackage] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
