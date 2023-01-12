package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedCertificateTimestampListJson extends StObject {
  
  var timestamps: js.Array[SignedCertificateTimestampJson]
}
object SignedCertificateTimestampListJson {
  
  inline def apply(timestamps: js.Array[SignedCertificateTimestampJson]): SignedCertificateTimestampListJson = {
    val __obj = js.Dynamic.literal(timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedCertificateTimestampListJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignedCertificateTimestampListJson] (val x: Self) extends AnyVal {
    
    inline def setTimestamps(value: js.Array[SignedCertificateTimestampJson]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: SignedCertificateTimestampJson*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
