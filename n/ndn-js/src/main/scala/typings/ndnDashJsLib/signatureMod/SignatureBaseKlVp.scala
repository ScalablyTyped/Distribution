package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "SignatureBaseKlVp")
@js.native
class SignatureBaseKlVp[T /* <: Signature */] () extends SignatureBaseKl[T] {
  def getValidityPeriod(): ValidityPeriod = js.native
  def setValidityPeriod(): scala.Unit = js.native
  def setValidityPeriod(validity: ValidityPeriod): scala.Unit = js.native
}

