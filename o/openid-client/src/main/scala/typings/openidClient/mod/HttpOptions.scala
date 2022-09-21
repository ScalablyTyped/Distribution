package typings.openidClient.mod

import typings.node.bufferMod.global.Buffer
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.LookupFunction
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<node.https.RequestOptions, 'agent' | 'ca' | 'cert' | 'crl' | 'headers' | 'key' | 'lookup' | 'passphrase' | 'pfx' | 'timeout'>> */
trait HttpOptions extends StObject {
  
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
  
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object HttpOptions {
  
  inline def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  
  extension [Self <: HttpOptions](x: Self) {
    
    inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
    
    inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
    
    inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
    
    inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
    
    inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[
          /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
          /* address */ String, 
          /* family */ Double, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
