package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Util extends js.Object {
  
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[Double]): String = js.native
  
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[Double]): String = js.native
  
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: String): js.Array[Double] = js.native
}
object Util {
  
  @scala.inline
  def apply(
    bytesToHexString: js.Array[Double] => String,
    bytesToString: js.Array[Double] => String,
    stringToBytes: String => js.Array[Double]
  ): Util = {
    val __obj = js.Dynamic.literal(bytesToHexString = js.Any.fromFunction1(bytesToHexString), bytesToString = js.Any.fromFunction1(bytesToString), stringToBytes = js.Any.fromFunction1(stringToBytes))
    __obj.asInstanceOf[Util]
  }
  
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesToHexString(value: js.Array[Double] => String): Self = this.set("bytesToHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBytesToString(value: js.Array[Double] => String): Self = this.set("bytesToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringToBytes(value: String => js.Array[Double]): Self = this.set("stringToBytes", js.Any.fromFunction1(value))
  }
}
