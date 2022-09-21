package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltIn extends StObject {
  
  def decodeB(zhnum: String): String = js.native
  def decodeB(zhnum: String, options: Options): String = js.native
  
  def decodeS(zhnum: String): String = js.native
  def decodeS(zhnum: String, options: Options): String = js.native
  
  def encodeB(num: String): String = js.native
  def encodeB(num: String, options: Options): String = js.native
  def encodeB(num: Double): String = js.native
  def encodeB(num: Double, options: Options): String = js.native
  
  def encodeS(num: String): String = js.native
  def encodeS(num: String, options: Options): String = js.native
  def encodeS(num: Double): String = js.native
  def encodeS(num: Double, options: Options): String = js.native
  
  def toMoney(num: String): String = js.native
  def toMoney(num: String, options: ToMoneyOptions): String = js.native
  def toMoney(num: Double): String = js.native
  def toMoney(num: Double, options: ToMoneyOptions): String = js.native
}
