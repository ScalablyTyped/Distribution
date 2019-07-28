package typings.ndnDashJs.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "ValidityPeriod")
@js.native
class ValidityPeriod () extends js.Object {
  def this(validity: ValidityPeriod) = this()
  def this(notBefore: Double, notAfter: Double) = this()
  def clear(): Unit = js.native
  def equals(other: ValidityPeriod): Boolean = js.native
  def getNotAfter(): Double = js.native
  def getNotBefore(): Double = js.native
  def hasPeriod(): Boolean = js.native
  def isValid(): Boolean = js.native
  def isValid(time: Double): Boolean = js.native
}

