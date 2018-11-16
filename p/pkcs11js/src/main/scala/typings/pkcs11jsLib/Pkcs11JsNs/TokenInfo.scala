package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TokenInfo extends js.Object {
  var firmwareVersion: Version
  var flags: scala.Double
  var freePrivateMemory: scala.Double
  var freePublicMemory: scala.Double
  var hardwareVersion: Version
  var label: java.lang.String
  var manufacturerID: java.lang.String
  var maxPinLen: scala.Double
  var maxRwSessionCount: scala.Double
  var maxSessionCount: scala.Double
  var minPinLen: scala.Double
  var model: java.lang.String
  var rwSessionCount: scala.Double
  var serialNumber: java.lang.String
  var sessionCount: scala.Double
  var totalPrivateMemory: scala.Double
  var totalPublicMemory: scala.Double
  var utcTime: java.lang.String
}

