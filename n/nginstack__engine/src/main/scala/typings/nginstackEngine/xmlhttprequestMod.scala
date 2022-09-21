package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlhttprequestMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: XHRConfig): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with XMLHttpRequest {
    def this(options: XHRConfig) = this()
  }
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", "DONE")
  @js.native
  def DONE: Double = js.native
  inline def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", "HEADERS_RECEIVED")
  @js.native
  def HEADERS_RECEIVED: Double = js.native
  inline def HEADERS_RECEIVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS_RECEIVED")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", "LOADING")
  @js.native
  def LOADING: Double = js.native
  inline def LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", "OPENED")
  @js.native
  def OPENED: Double = js.native
  inline def OPENED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/net/XMLHttpRequest", "UNSENT")
  @js.native
  def UNSENT: Double = js.native
  inline def UNSENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSENT")(x.asInstanceOf[js.Any])
  
  trait XHRConfig extends StObject {
    
    var certPath: js.UndefOr[String] = js.undefined
    
    var decodeContentFromLatin1: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSslErrors: js.UndefOr[Boolean] = js.undefined
    
    var keyPath: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfxPath: js.UndefOr[String] = js.undefined
  }
  object XHRConfig {
    
    inline def apply(): XHRConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XHRConfig]
    }
    
    extension [Self <: XHRConfig](x: Self) {
      
      inline def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
      
      inline def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
      
      inline def setDecodeContentFromLatin1(value: Boolean): Self = StObject.set(x, "decodeContentFromLatin1", value.asInstanceOf[js.Any])
      
      inline def setDecodeContentFromLatin1Undefined: Self = StObject.set(x, "decodeContentFromLatin1", js.undefined)
      
      inline def setIgnoreSslErrors(value: Boolean): Self = StObject.set(x, "ignoreSslErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSslErrorsUndefined: Self = StObject.set(x, "ignoreSslErrors", js.undefined)
      
      inline def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfxPath(value: String): Self = StObject.set(x, "pfxPath", value.asInstanceOf[js.Any])
      
      inline def setPfxPathUndefined: Self = StObject.set(x, "pfxPath", js.undefined)
    }
  }
  
  @js.native
  trait XMLHttpRequest extends StObject {
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(header: String): String = js.native
    
    def getTimeout(): Double = js.native
    
    def open(method: String, url: String): Unit = js.native
    
    var readyState: Double = js.native
    
    var response: String | js.typedarray.ArrayBuffer | (Record[Any, Any]) = js.native
    
    var responseText: String = js.native
    
    var responseType: String = js.native
    
    def send(): Unit = js.native
    def send(data: String): Unit = js.native
    def send(data: js.typedarray.ArrayBuffer): Unit = js.native
    
    def setRequestHeader(header: String, value: String): Unit = js.native
    
    def setTimeout(value: Double): Unit = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
}
