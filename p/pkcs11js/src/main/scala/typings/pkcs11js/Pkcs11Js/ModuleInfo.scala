package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  var cryptokiVersion: Version
  var flags: Double
  var libraryDescription: String
  var libraryVersion: Version
  var manufacturerID: String
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
}

