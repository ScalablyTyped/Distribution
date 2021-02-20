package typings.nodeLogglyBulk

import org.scalablytyped.runtime.Instantiable1
import typings.loggly.mod.LogglyInstance
import typings.loggly.mod.LogglyOptions
import typings.nodeLogglyBulk.anon.RetriesInMilliSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node-loggly-bulk", "Loggly")
  @js.native
  class Loggly protected () extends LogglyInstance {
    def this(options: LogglyBulkOptions) = this()
  }
  @JSImport("node-loggly-bulk", "Loggly")
  @js.native
  val Loggly: LogglyBulkConstructor = js.native
  
  @JSImport("node-loggly-bulk", "createClient")
  @js.native
  def createClient(options: LogglyBulkOptions): LogglyInstance = js.native
  
  @JSImport("node-loggly-bulk", "serialize")
  @js.native
  def serialize(obj: js.Any): String = js.native
  @JSImport("node-loggly-bulk", "serialize")
  @js.native
  def serialize(obj: js.Any, key: String): String = js.native
  
  @JSImport("node-loggly-bulk", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait LogglyBulkConstructor extends Instantiable1[/* options */ LogglyBulkOptions, LogglyInstance]
  
  @js.native
  trait LogglyBulkOptions extends LogglyOptions {
    
    var bufferOptions: js.UndefOr[RetriesInMilliSeconds] = js.native
    
    var isBulk: js.UndefOr[Boolean] = js.native
    
    var networkErrorsOnConsole: js.UndefOr[Boolean] = js.native
    
    var proxy: js.UndefOr[js.Any] = js.native
    
    var useTagHeader: js.UndefOr[Boolean] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object LogglyBulkOptions {
    
    @scala.inline
    def apply(subdomain: String, token: String): LogglyBulkOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyBulkOptions]
    }
    
    @scala.inline
    implicit class LogglyBulkOptionsMutableBuilder[Self <: LogglyBulkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferOptions(value: RetriesInMilliSeconds): Self = StObject.set(x, "bufferOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferOptionsUndefined: Self = StObject.set(x, "bufferOptions", js.undefined)
      
      @scala.inline
      def setIsBulk(value: Boolean): Self = StObject.set(x, "isBulk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBulkUndefined: Self = StObject.set(x, "isBulk", js.undefined)
      
      @scala.inline
      def setNetworkErrorsOnConsole(value: Boolean): Self = StObject.set(x, "networkErrorsOnConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkErrorsOnConsoleUndefined: Self = StObject.set(x, "networkErrorsOnConsole", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setUseTagHeader(value: Boolean): Self = StObject.set(x, "useTagHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTagHeaderUndefined: Self = StObject.set(x, "useTagHeader", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
