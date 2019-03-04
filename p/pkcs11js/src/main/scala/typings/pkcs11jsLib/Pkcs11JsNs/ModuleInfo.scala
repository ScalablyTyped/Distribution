package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  var cryptokiVersion: Version
  var flags: scala.Double
  var libraryDescription: java.lang.String
  var libraryVersion: Version
  var manufacturerID: java.lang.String
}

object ModuleInfo {
  @scala.inline
  def apply(
    cryptokiVersion: Version,
    flags: scala.Double,
    libraryDescription: java.lang.String,
    libraryVersion: Version,
    manufacturerID: java.lang.String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(cryptokiVersion = cryptokiVersion, flags = flags, libraryDescription = libraryDescription, libraryVersion = libraryVersion, manufacturerID = manufacturerID)
  
    __obj.asInstanceOf[ModuleInfo]
  }
}

