package typings.phoneformatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phoneformat.js", "cleanPhone")
  @js.native
  def cleanPhone(phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "countryCodeToName")
  @js.native
  def countryCodeToName(countryCode: String): String = js.native
  
  @JSImport("phoneformat.js", "countryForE164Number")
  @js.native
  def countryForE164Number(phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "exampleLandlineNumber")
  @js.native
  def exampleLandlineNumber(countryCode: String): String = js.native
  
  @JSImport("phoneformat.js", "exampleMobileNumber")
  @js.native
  def exampleMobileNumber(countryCode: String): String = js.native
  
  @JSImport("phoneformat.js", "formatE164")
  @js.native
  def formatE164(countryCode: String, phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "formatInternational")
  @js.native
  def formatInternational(countryCode: String, phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "formatLocal")
  @js.native
  def formatLocal(countryCode: String, phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "formatNumberForMobileDialing")
  @js.native
  def formatNumberForMobileDialing(countryCode: String, phoneNumber: String): String = js.native
  
  @JSImport("phoneformat.js", "isValidNumber")
  @js.native
  def isValidNumber(phoneNumber: String, countryCode: String): Boolean = js.native
}
