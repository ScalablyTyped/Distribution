package typings
package pkijsLib.srcSignedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var code: scala.Double
  var date: stdLib.Date
  var message: java.lang.String
  var signatureVerified: js.UndefOr[scala.Boolean] = js.undefined
  var signerCertificate: js.UndefOr[pkijsLib.srcCertificateMod.default] = js.undefined
  var signerCertificateVerified: js.UndefOr[scala.Boolean] = js.undefined
}

