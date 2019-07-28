package typings.ndnDashJs.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "SignatureBaseKlVp")
@js.native
class SignatureBaseKlVp[T /* <: Signature */] () extends SignatureBaseKl[T] {
  def getValidityPeriod(): ValidityPeriod = js.native
  def setValidityPeriod(): Unit = js.native
  def setValidityPeriod(validity: ValidityPeriod): Unit = js.native
}

