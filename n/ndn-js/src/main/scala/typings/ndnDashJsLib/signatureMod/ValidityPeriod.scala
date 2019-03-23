package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", "ValidityPeriod")
@js.native
class ValidityPeriod () extends js.Object {
  def this(validity: ValidityPeriod) = this()
  def this(notBefore: scala.Double, notAfter: scala.Double) = this()
  def clear(): scala.Unit = js.native
  def equals(other: ValidityPeriod): scala.Boolean = js.native
  def getNotAfter(): scala.Double = js.native
  def getNotBefore(): scala.Double = js.native
  def hasPeriod(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def isValid(time: scala.Double): scala.Boolean = js.native
}

