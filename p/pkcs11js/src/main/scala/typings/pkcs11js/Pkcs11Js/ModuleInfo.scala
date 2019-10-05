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
    val __obj = js.Dynamic.literal(cryptokiVersion = cryptokiVersion, flags = flags, libraryDescription = libraryDescription, libraryVersion = libraryVersion, manufacturerID = manufacturerID)
  
    __obj.asInstanceOf[ModuleInfo]
  }
}

