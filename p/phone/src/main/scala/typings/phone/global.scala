package typings.phone

import typings.phone.mod.PhoneData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object phone {
    
    inline def apply(phoneNumber: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def apply(phoneNumber: String, countryCode: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def apply(phoneNumber: String, countryCode: String, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def apply(phoneNumber: String, countryCode: Unit, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSGlobal("phone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("phone.iso3166_data")
    @js.native
    val iso3166Data: js.Array[PhoneData] = js.native
  }
}
