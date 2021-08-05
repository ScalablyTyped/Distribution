package typings.node.tlsMod

import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonConnectionOptions extends StObject {
  
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var ALPNProtocols: js.UndefOr[(js.Array[String | Uint8Array]) | Uint8Array] = js.undefined
  
  /**
    * SNICallback(servername, cb) <Function> A function that will be
    * called if the client supports SNI TLS extension. Two arguments
    * will be passed when called: servername and cb. SNICallback should
    * invoke cb(null, ctx), where ctx is a SecureContext instance.
    * (tls.createSecureContext(...) can be used to get a proper
    * SecureContext.) If SNICallback wasn't provided the default callback
    * with high-level API will be used (see below).
    */
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ String, 
      /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    * @default false
    */
  var enableTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true.
    * @default true
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[SecureContext] = js.undefined
}
object CommonConnectionOptions {
  
  inline def apply(): CommonConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConnectionOptions]
  }
  
  extension [Self <: CommonConnectionOptions](x: Self) {
    
    inline def setALPNProtocols(value: (js.Array[String | Uint8Array]) | Uint8Array): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
    
    inline def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
    
    inline def setALPNProtocolsVarargs(value: (String | Uint8Array)*): Self = StObject.set(x, "ALPNProtocols", js.Array(value :_*))
    
    inline def setEnableTrace(value: Boolean): Self = StObject.set(x, "enableTrace", value.asInstanceOf[js.Any])
    
    inline def setEnableTraceUndefined: Self = StObject.set(x, "enableTrace", js.undefined)
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
    
    inline def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
    
    inline def setSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = StObject.set(x, "SNICallback", js.Any.fromFunction2(value))
    
    inline def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    
    inline def setSecureContext(value: SecureContext): Self = StObject.set(x, "secureContext", value.asInstanceOf[js.Any])
    
    inline def setSecureContextUndefined: Self = StObject.set(x, "secureContext", js.undefined)
  }
}
