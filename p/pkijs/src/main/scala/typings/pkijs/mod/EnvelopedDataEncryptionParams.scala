package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopedDataEncryptionParams extends StObject {
  
  var kdfAlgorithm: String
  
  var kekEncryptionLength: Double
}
object EnvelopedDataEncryptionParams {
  
  inline def apply(kdfAlgorithm: String, kekEncryptionLength: Double): EnvelopedDataEncryptionParams = {
    val __obj = js.Dynamic.literal(kdfAlgorithm = kdfAlgorithm.asInstanceOf[js.Any], kekEncryptionLength = kekEncryptionLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedDataEncryptionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopedDataEncryptionParams] (val x: Self) extends AnyVal {
    
    inline def setKdfAlgorithm(value: String): Self = StObject.set(x, "kdfAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKekEncryptionLength(value: Double): Self = StObject.set(x, "kekEncryptionLength", value.asInstanceOf[js.Any])
  }
}
