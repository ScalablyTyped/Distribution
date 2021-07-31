package typings.phone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(phoneNumber: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(phoneNumber: String, countryCode: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(phoneNumber: String, countryCode: String, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(phoneNumber: String, countryCode: Unit, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("phone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
