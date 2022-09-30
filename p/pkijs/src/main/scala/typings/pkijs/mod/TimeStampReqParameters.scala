package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ITimeStampReq> */
trait TimeStampReqParameters extends StObject {
  
  var certReq: js.UndefOr[Boolean] = js.undefined
  
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var messageImprint: js.UndefOr[MessageImprint] = js.undefined
  
  var nonce: js.UndefOr[Integer] = js.undefined
  
  var reqPolicy: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object TimeStampReqParameters {
  
  inline def apply(): TimeStampReqParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeStampReqParameters]
  }
  
  extension [Self <: TimeStampReqParameters](x: Self) {
    
    inline def setCertReq(value: Boolean): Self = StObject.set(x, "certReq", value.asInstanceOf[js.Any])
    
    inline def setCertReqUndefined: Self = StObject.set(x, "certReq", js.undefined)
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMessageImprint(value: MessageImprint): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setMessageImprintUndefined: Self = StObject.set(x, "messageImprint", js.undefined)
    
    inline def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReqPolicy(value: String): Self = StObject.set(x, "reqPolicy", value.asInstanceOf[js.Any])
    
    inline def setReqPolicyUndefined: Self = StObject.set(x, "reqPolicy", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
