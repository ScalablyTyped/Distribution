package typings.phoneformatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phoneformat.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cleanPhone(phoneNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPhone")(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def countryCodeToName(countryCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("countryCodeToName")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def countryForE164Number(phoneNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("countryForE164Number")(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def exampleLandlineNumber(countryCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exampleLandlineNumber")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def exampleMobileNumber(countryCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exampleMobileNumber")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatE164(countryCode: String, phoneNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatE164")(countryCode.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatInternational(countryCode: String, phoneNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatInternational")(countryCode.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatLocal(countryCode: String, phoneNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLocal")(countryCode.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumberForMobileDialing(countryCode: String, phoneNumber: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberForMobileDialing")(countryCode.asInstanceOf[js.Any], phoneNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isValidNumber(phoneNumber: String, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
