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
  
  @scala.inline
  def apply(): CommonConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConnectionOptions]
  }
  
  @scala.inline
  implicit class CommonConnectionOptionsMutableBuilder[Self <: CommonConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALPNProtocols(value: (js.Array[String | Uint8Array]) | Uint8Array): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
    
    @scala.inline
    def setALPNProtocolsVarargs(value: (String | Uint8Array)*): Self = StObject.set(x, "ALPNProtocols", js.Array(value :_*))
    
    @scala.inline
    def setEnableTrace(value: Boolean): Self = StObject.set(x, "enableTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTraceUndefined: Self = StObject.set(x, "enableTrace", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
    
    @scala.inline
    def setSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = StObject.set(x, "SNICallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
    
    @scala.inline
    def setSecureContext(value: SecureContext): Self = StObject.set(x, "secureContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureContextUndefined: Self = StObject.set(x, "secureContext", js.undefined)
  }
}
