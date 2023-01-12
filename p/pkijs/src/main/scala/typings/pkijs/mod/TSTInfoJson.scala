package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTInfoJson extends StObject {
  
  var accuracy: js.UndefOr[AccuracyJson] = js.undefined
  
  var extensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var genTime: js.Date
  
  var messageImprint: MessageImprintJson
  
  var nonce: js.UndefOr[IntegerJson] = js.undefined
  
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  var policy: String
  
  var serialNumber: IntegerJson
  
  var tsa: js.UndefOr[GeneralNameJson] = js.undefined
  
  var version: Double
}
object TSTInfoJson {
  
  inline def apply(
    genTime: js.Date,
    messageImprint: MessageImprintJson,
    policy: String,
    serialNumber: IntegerJson,
    version: Double
  ): TSTInfoJson = {
    val __obj = js.Dynamic.literal(genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTInfoJson] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: AccuracyJson): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGenTime(value: js.Date): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
    
    inline def setMessageImprint(value: MessageImprintJson): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: IntegerJson): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setTsa(value: GeneralNameJson): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
    
    inline def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
