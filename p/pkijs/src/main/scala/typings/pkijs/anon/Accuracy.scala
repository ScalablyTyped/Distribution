package typings.pkijs.anon

import typings.pkijs.mod.AccuracySchema
import typings.pkijs.mod.ExtensionSchema
import typings.pkijs.mod.GeneralNameSchema
import typings.pkijs.mod.MessageImprintSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  var accuracy: js.UndefOr[AccuracySchema] = js.undefined
  
  var `extension`: js.UndefOr[ExtensionSchema] = js.undefined
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var genTime: js.UndefOr[String] = js.undefined
  
  var messageImprint: js.UndefOr[MessageImprintSchema] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var ordering: js.UndefOr[String] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
  
  var tsa: js.UndefOr[GeneralNameSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Accuracy {
  
  inline def apply(): Accuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accuracy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: AccuracySchema): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setExtension(value: ExtensionSchema): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setGenTime(value: String): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
    
    inline def setGenTimeUndefined: Self = StObject.set(x, "genTime", js.undefined)
    
    inline def setMessageImprint(value: MessageImprintSchema): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setMessageImprintUndefined: Self = StObject.set(x, "messageImprint", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setTsa(value: GeneralNameSchema): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
    
    inline def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
