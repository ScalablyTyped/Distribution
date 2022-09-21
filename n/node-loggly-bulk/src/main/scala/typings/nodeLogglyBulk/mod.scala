package typings.nodeLogglyBulk

import org.scalablytyped.runtime.Instantiable1
import typings.loggly.mod.LogglyInstance
import typings.loggly.mod.LogglyOptions
import typings.nodeLogglyBulk.anon.RetriesInMilliSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-loggly-bulk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node-loggly-bulk", "Loggly")
  @js.native
  open class Loggly protected ()
    extends StObject
       with LogglyInstance {
    def this(options: LogglyBulkOptions) = this()
  }
  @JSImport("node-loggly-bulk", "Loggly")
  @js.native
  val Loggly: LogglyBulkConstructor = js.native
  
  inline def createClient(options: LogglyBulkOptions): LogglyInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[LogglyInstance]
  
  inline def serialize(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(obj: Any, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("node-loggly-bulk", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait LogglyBulkConstructor
    extends StObject
       with Instantiable1[/* options */ LogglyBulkOptions, LogglyInstance]
  
  trait LogglyBulkOptions
    extends StObject
       with LogglyOptions {
    
    var bufferOptions: js.UndefOr[RetriesInMilliSeconds] = js.undefined
    
    var isBulk: js.UndefOr[Boolean] = js.undefined
    
    var networkErrorsOnConsole: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Any] = js.undefined
    
    var useTagHeader: js.UndefOr[Boolean] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object LogglyBulkOptions {
    
    inline def apply(subdomain: String, token: String): LogglyBulkOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyBulkOptions]
    }
    
    extension [Self <: LogglyBulkOptions](x: Self) {
      
      inline def setBufferOptions(value: RetriesInMilliSeconds): Self = StObject.set(x, "bufferOptions", value.asInstanceOf[js.Any])
      
      inline def setBufferOptionsUndefined: Self = StObject.set(x, "bufferOptions", js.undefined)
      
      inline def setIsBulk(value: Boolean): Self = StObject.set(x, "isBulk", value.asInstanceOf[js.Any])
      
      inline def setIsBulkUndefined: Self = StObject.set(x, "isBulk", js.undefined)
      
      inline def setNetworkErrorsOnConsole(value: Boolean): Self = StObject.set(x, "networkErrorsOnConsole", value.asInstanceOf[js.Any])
      
      inline def setNetworkErrorsOnConsoleUndefined: Self = StObject.set(x, "networkErrorsOnConsole", js.undefined)
      
      inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setUseTagHeader(value: Boolean): Self = StObject.set(x, "useTagHeader", value.asInstanceOf[js.Any])
      
      inline def setUseTagHeaderUndefined: Self = StObject.set(x, "useTagHeader", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
