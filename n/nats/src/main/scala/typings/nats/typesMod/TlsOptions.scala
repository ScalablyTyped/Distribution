package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsOptions extends StObject {
  
  var ca: js.UndefOr[String] = js.undefined
  
  var caFile: js.UndefOr[String] = js.undefined
  
  var cert: js.UndefOr[String] = js.undefined
  
  var certFile: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var keyFile: js.UndefOr[String] = js.undefined
}
object TlsOptions {
  
  inline def apply(): TlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsOptions]
  }
  
  extension [Self <: TlsOptions](x: Self) {
    
    inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
    
    inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
    
    inline def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
    
    inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
