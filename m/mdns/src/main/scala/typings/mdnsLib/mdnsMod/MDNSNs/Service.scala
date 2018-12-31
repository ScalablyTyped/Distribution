package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Services ---
trait Service extends js.Object {
  var addresses: js.Array[java.lang.String]
  var flags: scala.Double
  var fullname: java.lang.String
  var host: java.lang.String
  var interfaceIndex: scala.Double
  var name: js.UndefOr[java.lang.String] = js.undefined
  var networkInterface: java.lang.String
  var port: scala.Double
  var rawTxtRecord: js.UndefOr[nodeLib.Buffer] = js.undefined
  var replyDomain: java.lang.String
  var txtRecord: js.UndefOr[js.Any] = js.undefined
  var `type`: ServiceType
}

