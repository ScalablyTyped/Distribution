package typings.phoneformatJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoneformat.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def cleanPhone(phoneNumber: String): String = js.native
  def countryCodeToName(countryCode: String): String = js.native
  def countryForE164Number(phoneNumber: String): String = js.native
  def exampleLandlineNumber(countryCode: String): String = js.native
  def exampleMobileNumber(countryCode: String): String = js.native
  def formatE164(countryCode: String, phoneNumber: String): String = js.native
  def formatInternational(countryCode: String, phoneNumber: String): String = js.native
  def formatLocal(countryCode: String, phoneNumber: String): String = js.native
  def formatNumberForMobileDialing(countryCode: String, phoneNumber: String): String = js.native
  def isValidNumber(phoneNumber: String, countryCode: String): Boolean = js.native
}

