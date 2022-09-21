package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope extends StObject {
  
  /** the dsn options */
  var dsn: js.UndefOr[DSNOptions] = js.undefined
  
  /** includes an address object or is set to false */
  var from: String | `false`
  
  /** an optional value of the predicted size of the message in bytes. This value is used if the server supports the SIZE extension (RFC1870) */
  var size: js.UndefOr[Double] = js.undefined
  
  /** the recipient address or an array of addresses */
  var to: String | js.Array[String]
  
  /** if true then inform the server that this message might contain bytes outside 7bit ascii range */
  var use8BitMime: js.UndefOr[Boolean] = js.undefined
}
object Envelope {
  
  inline def apply(from: String | `false`, to: String | js.Array[String]): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
  
  extension [Self <: Envelope](x: Self) {
    
    inline def setDsn(value: DSNOptions): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
    
    inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    
    inline def setFrom(value: String | `false`): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTo(value: String | js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
    
    inline def setUse8BitMime(value: Boolean): Self = StObject.set(x, "use8BitMime", value.asInstanceOf[js.Any])
    
    inline def setUse8BitMimeUndefined: Self = StObject.set(x, "use8BitMime", js.undefined)
  }
}
