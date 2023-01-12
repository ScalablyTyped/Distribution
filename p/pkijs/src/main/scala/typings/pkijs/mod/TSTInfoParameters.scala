package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ITSTInfo> */
trait TSTInfoParameters extends StObject {
  
  var accuracy: js.UndefOr[Accuracy] = js.undefined
  
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var genTime: js.UndefOr[js.Date] = js.undefined
  
  var messageImprint: js.UndefOr[MessageImprint] = js.undefined
  
  var nonce: js.UndefOr[Integer] = js.undefined
  
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
  
  var tsa: js.UndefOr[GeneralName] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object TSTInfoParameters {
  
  inline def apply(): TSTInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSTInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Accuracy): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGenTime(value: js.Date): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
    
    inline def setGenTimeUndefined: Self = StObject.set(x, "genTime", js.undefined)
    
    inline def setMessageImprint(value: MessageImprint): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setMessageImprintUndefined: Self = StObject.set(x, "messageImprint", js.undefined)
    
    inline def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setTsa(value: GeneralName): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
    
    inline def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
