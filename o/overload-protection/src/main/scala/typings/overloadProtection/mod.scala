package typings.overloadProtection

import typings.overloadProtection.overloadProtectionBooleans.`false`
import typings.overloadProtection.overloadProtectionStrings.koa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("overload-protection", JSImport.Namespace)
  @js.native
  def apply(framework: HttpFrameworkSelection): HttpProtectionInstance = js.native
  @JSImport("overload-protection", JSImport.Namespace)
  @js.native
  def apply(framework: HttpFrameworkSelection, config: ProtectionConfig): HttpProtectionInstance = js.native
  @JSImport("overload-protection", JSImport.Namespace)
  @js.native
  def apply(framework: KoaFrameworkSelection): KoaProtectionInstance = js.native
  @JSImport("overload-protection", JSImport.Namespace)
  @js.native
  def apply(framework: KoaFrameworkSelection, config: ProtectionConfig): KoaProtectionInstance = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.overloadProtection.overloadProtectionStrings.express
    - typings.overloadProtection.overloadProtectionStrings.http
    - typings.overloadProtection.overloadProtectionStrings.restify
  */
  trait HttpFrameworkSelection extends StObject
  object HttpFrameworkSelection {
    
    @scala.inline
    def express: typings.overloadProtection.overloadProtectionStrings.express = "express".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.express]
    
    @scala.inline
    def http: typings.overloadProtection.overloadProtectionStrings.http = "http".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.http]
    
    @scala.inline
    def restify: typings.overloadProtection.overloadProtectionStrings.restify = "restify".asInstanceOf[typings.overloadProtection.overloadProtectionStrings.restify]
  }
  
  @js.native
  trait HttpProtectionInstance extends ProtectionInstance {
    
    def apply(req: js.Object, res: js.Object, next: js.Function0[_]): js.Any = js.native
  }
  
  type KoaFrameworkSelection = koa
  
  @js.native
  trait KoaProtectionInstance extends ProtectionInstance {
    
    def apply(ctx: js.Object, next: js.Function0[_]): js.Any = js.native
  }
  
  @js.native
  trait ProtectionConfig extends StObject {
    
    var clientRetrySecs: js.UndefOr[Double] = js.native
    
    var errorPropagationMode: js.UndefOr[Boolean] = js.native
    
    var logStatsOnReq: js.UndefOr[`false`] = js.native
    
    var logging: js.UndefOr[Boolean | String | (js.Function1[/* msg */ String, Unit])] = js.native
    
    var maxEventLoopDelay: js.UndefOr[Double] = js.native
    
    var maxHeapUsedBytes: js.UndefOr[Double] = js.native
    
    var maxRssBytes: js.UndefOr[Double] = js.native
    
    var production: js.UndefOr[Boolean] = js.native
    
    var sampleInterval: js.UndefOr[Double] = js.native
  }
  object ProtectionConfig {
    
    @scala.inline
    def apply(): ProtectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProtectionConfig]
    }
    
    @scala.inline
    implicit class ProtectionConfigMutableBuilder[Self <: ProtectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientRetrySecs(value: Double): Self = StObject.set(x, "clientRetrySecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRetrySecsUndefined: Self = StObject.set(x, "clientRetrySecs", js.undefined)
      
      @scala.inline
      def setErrorPropagationMode(value: Boolean): Self = StObject.set(x, "errorPropagationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorPropagationModeUndefined: Self = StObject.set(x, "errorPropagationMode", js.undefined)
      
      @scala.inline
      def setLogStatsOnReq(value: `false`): Self = StObject.set(x, "logStatsOnReq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStatsOnReqUndefined: Self = StObject.set(x, "logStatsOnReq", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean | String | (js.Function1[/* msg */ String, Unit])): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingFunction1(value: /* msg */ String => Unit): Self = StObject.set(x, "logging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
      
      @scala.inline
      def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeapUsedBytesUndefined: Self = StObject.set(x, "maxHeapUsedBytes", js.undefined)
      
      @scala.inline
      def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRssBytesUndefined: Self = StObject.set(x, "maxRssBytes", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      @scala.inline
      def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
    }
  }
  
  @js.native
  trait ProtectionInstance extends StObject {
    
    var eventLoopDelay: Double = js.native
    
    var eventLoopOverload: Boolean = js.native
    
    var heapUsedOverload: Boolean = js.native
    
    var maxEventLoopDelay: Double = js.native
    
    var maxHeapUsedBytes: Double = js.native
    
    var maxRssBytes: Double = js.native
    
    var overload: Boolean = js.native
    
    var rssOverload: Boolean = js.native
  }
  object ProtectionInstance {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProtectionInstanceMutableBuilder[Self <: ProtectionInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventLoopDelay(value: Double): Self = StObject.set(x, "eventLoopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLoopOverload(value: Boolean): Self = StObject.set(x, "eventLoopOverload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeapUsedOverload(value: Boolean): Self = StObject.set(x, "heapUsedOverload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeapUsedBytes(value: Double): Self = StObject.set(x, "maxHeapUsedBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRssBytes(value: Double): Self = StObject.set(x, "maxRssBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverload(value: Boolean): Self = StObject.set(x, "overload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRssOverload(value: Boolean): Self = StObject.set(x, "rssOverload", value.asInstanceOf[js.Any])
    }
  }
}
