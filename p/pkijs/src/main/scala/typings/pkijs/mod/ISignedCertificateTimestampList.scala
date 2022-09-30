package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignedCertificateTimestampList extends StObject {
  
  var timestamps: js.Array[SignedCertificateTimestamp]
}
object ISignedCertificateTimestampList {
  
  inline def apply(timestamps: js.Array[SignedCertificateTimestamp]): ISignedCertificateTimestampList = {
    val __obj = js.Dynamic.literal(timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignedCertificateTimestampList]
  }
  
  extension [Self <: ISignedCertificateTimestampList](x: Self) {
    
    inline def setTimestamps(value: js.Array[SignedCertificateTimestamp]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: SignedCertificateTimestamp*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
