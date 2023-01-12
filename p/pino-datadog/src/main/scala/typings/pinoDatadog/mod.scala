package typings.pinoDatadog

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-datadog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWriteStream(options: Options): js.Promise[WritableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WritableStream]]
  
  inline def createWriteStreamSync(options: Options): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStreamSync")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  trait Options extends StObject {
    
    /**
      * The API key that can be found in your DataDog account (Integration > APIs).
      */
    var apiKey: String
    
    /**
      * Set a default source to all the logs sent to datadog
      */
    var ddsource: js.UndefOr[String] = js.undefined
    
    /**
      * Set a default list of tags for all the logs sent to datadog
      */
    var ddtags: js.UndefOr[String] = js.undefined
    
    /**
      * Use Datadog EU site
      */
    var eu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set a default hostname to all the logs sent to datadog
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * Keep the msg attribute in the log record. Used to allow a Datadog facet on the message.
      */
    var keepMsg: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set a default service to all the logs sent to datadog
      */
    var service: js.UndefOr[String] = js.undefined
    
    /**
      * The number of log messages to send as a single batch (defaults to 1).
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(apiKey: String): Options = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setDdsource(value: String): Self = StObject.set(x, "ddsource", value.asInstanceOf[js.Any])
      
      inline def setDdsourceUndefined: Self = StObject.set(x, "ddsource", js.undefined)
      
      inline def setDdtags(value: String): Self = StObject.set(x, "ddtags", value.asInstanceOf[js.Any])
      
      inline def setDdtagsUndefined: Self = StObject.set(x, "ddtags", js.undefined)
      
      inline def setEu(value: Boolean): Self = StObject.set(x, "eu", value.asInstanceOf[js.Any])
      
      inline def setEuUndefined: Self = StObject.set(x, "eu", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKeepMsg(value: Boolean): Self = StObject.set(x, "keepMsg", value.asInstanceOf[js.Any])
      
      inline def setKeepMsgUndefined: Self = StObject.set(x, "keepMsg", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
