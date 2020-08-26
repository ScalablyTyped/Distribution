package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleInfo extends js.Object {
  var cryptokiVersion: Version = js.native
  var flags: Double = js.native
  var libraryDescription: String = js.native
  var libraryVersion: Version = js.native
  var manufacturerID: String = js.native
}

object ModuleInfo {
  @scala.inline
  def apply(
    cryptokiVersion: Version,
    flags: Double,
    libraryDescription: String,
    libraryVersion: Version,
    manufacturerID: String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(cryptokiVersion = cryptokiVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], libraryDescription = libraryDescription.asInstanceOf[js.Any], libraryVersion = libraryVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
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
    def setCryptokiVersion(value: Version): Self = this.set("cryptokiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibraryDescription(value: String): Self = this.set("libraryDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibraryVersion(value: Version): Self = this.set("libraryVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturerID(value: String): Self = this.set("manufacturerID", value.asInstanceOf[js.Any])
  }
  
}

