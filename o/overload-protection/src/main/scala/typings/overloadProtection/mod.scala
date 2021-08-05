package typings.overloadProtection

import typings.overloadProtection.overloadProtectionBooleans.`false`
import typings.overloadProtection.overloadProtectionStrings.koa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(framework: HttpFrameworkSelection): HttpProtectionInstance = ^.asInstanceOf[js.Dynamic].apply(framework.asInstanceOf[js.Any]).asInstanceOf[HttpProtectionInstance]
  inline def apply(framework: HttpFrameworkSelection, config: ProtectionConfig): HttpProtectionInstance = (^.asInstanceOf[js.Dynamic].apply(framework.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[HttpProtectionInstance]
  inline def apply(framework: KoaFrameworkSelection): KoaProtectionInstance = ^.asInstanceOf[js.Dynamic].apply(framework.asInstanceOf[js.Any]).asInstanceOf[KoaProtectionInstance]
  inline def apply(framework: KoaFrameworkSelection, config: ProtectionConfig): KoaProtectionInstance = (^.asInstanceOf[js.Dynamic].apply(framework.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[KoaProtectionInstance]
  
  @JSImport("overload-protection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.overloadProtection.overloadProtectionStrings.express
    - typings.overloadProtection.overloadProtectionStrings.http
    - typings.overloadProtection.overloadProtectionStrings.restify
  */
  trait HttpFrameworkSelection extends StObject
  object HttpFrameworkSelection {
    
    inline def express: typings.overloadProtection.overloadProtectionStrings.express = "express".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.express]
    
    inline def http: typings.overloadProtection.overloadProtectionStrings.http = "http".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.http]
    
    inline def restify: typings.overloadProtection.overloadProtectionStrings.restify = "restify".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.restify]
  }
  
  @js.native
  trait HttpProtectionInstance
    extends StObject
       with ProtectionInstance {
    
    def apply(req: js.Object, res: js.Object, next: js.Function0[js.Any]): js.Any = js.native
  }
  
  type KoaFrameworkSelection = koa
  
  @js.native
  trait KoaProtectionInstance
    extends StObject
       with ProtectionInstance {
    
    def apply(ctx: js.Object, next: js.Function0[js.Any]): js.Any = js.native
  }
  
  trait ProtectionConfig extends StObject {
    
    var clientRetrySecs: js.UndefOr[Double] = js.undefined
    
    var errorPropagationMode: js.UndefOr[Boolean] = js.undefined
    
    var logStatsOnReq: js.UndefOr[`false`] = js.undefined
    
    var logging: js.UndefOr[Boolean | String | (js.Function1[/* msg */ String, Unit])] = js.undefined
    
    var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
    
    var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
    
    var maxRssBytes: js.UndefOr[Double] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
    
    var sampleInterval: js.UndefOr[Double] = js.undefined
  }
  object ProtectionConfig {
    
    inline def apply(): ProtectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProtectionConfig]
    }
    
    extension [Self <: ProtectionConfig](x: Self) {
      
      inline def setClientRetrySecs(value: Double): Self = StObject.set(x, "clientRetrySecs", value.asInstanceOf[js.Any])
      
      inline def setClientRetrySecsUndefined: Self = StObject.set(x, "clientRetrySecs", js.undefined)
      
      inline def setErrorPropagationMode(value: Boolean): Self = StObject.set(x, "errorPropagationMode", value.asInstanceOf[js.Any])
      
      inline def setErrorPropagationModeUndefined: Self = StObject.set(x, "errorPropagationMode", js.undefined)
      
      inline def setLogStatsOnReq(value: `false`): Self = StObject.set(x, "logStatsOnReq", value.asInstanceOf[js.Any])
      
      inline def setLogStatsOnReqUndefined: Self = StObject.set(x, "logStatsOnReq", js.undefined)
      
      inline def setLogging(value: Boolean | String | (js.Function1[/* msg */ String, Unit])): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingFunction1(value: /* msg */ String => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction1(value))
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
      
      inline def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxHeapUsedBytesUndefined: Self = StObject.set(x, "maxHeapUsedBytes", js.undefined)
      
      inline def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxRssBytesUndefined: Self = StObject.set(x, "maxRssBytes", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      inline def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
    }
  }
  
  trait ProtectionInstance extends StObject {
    
    var eventLoopDelay: Double
    
    var eventLoopOverload: Boolean
    
    var heapUsedOverload: Boolean
    
    var maxEventLoopDelay: Double
    
    var maxHeapUsedBytes: Double
    
    var maxRssBytes: Double
    
    var overload: Boolean
    
    var rssOverload: Boolean
  }
  object ProtectionInstance {
    
    inline def apply(
      eventLoopDelay: Double,
      eventLoopOverload: Boolean,
      heapUsedOverload: Boolean,
      maxEventLoopDelay: Double,
      maxHeapUsedBytes: Double,
      maxRssBytes: Double,
      overload: Boolean,
      rssOverload: Boolean
    ): ProtectionInstance = {
      val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], eventLoopOverload = eventLoopOverload.asInstanceOf[js.Any], heapUsedOverload = heapUsedOverload.asInstanceOf[js.Any], maxEventLoopDelay = maxEventLoopDelay.asInstanceOf[js.Any], maxHeapUsedBytes = maxHeapUsedBytes.asInstanceOf[js.Any], maxRssBytes = maxRssBytes.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], rssOverload = rssOverload.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectionInstance]
    }
    
    extension [Self <: ProtectionInstance](x: Self) {
      
      inline def setEventLoopDelay(value: Double): Self = StObject.set(x, "eventLoopDelay", value.asInstanceOf[js.Any])
      
      inline def setEventLoopOverload(value: Boolean): Self = StObject.set(x, "eventLoopOverload", value.asInstanceOf[js.Any])
      
      inline def setHeapUsedOverload(value: Boolean): Self = StObject.set(x, "heapUsedOverload", value.asInstanceOf[js.Any])
      
      inline def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
      
      inline def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      inline def setRssOverload(value: Boolean): Self = StObject.set(x, "rssOverload", value.asInstanceOf[js.Any])
    }
  }
}
