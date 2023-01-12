package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawBytes extends StObject {
  
  /**
    * the scan result as a Uint8Array
    */
  var rawBytes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * the scan result as string
    */
  var text: js.UndefOr[String] = js.undefined
}
object RawBytes {
  
  inline def apply(): RawBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawBytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawBytes] (val x: Self) extends AnyVal {
    
    inline def setRawBytes(value: js.Object): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
    
    inline def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
