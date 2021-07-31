package typings.natsHemera.mod

import typings.natsHemera.natsHemeraNumbers.`2000`
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var bloomrun: js.UndefOr[BloomrunConfig] = js.undefined
  
  var childLogger: js.UndefOr[Boolean] = js.undefined
  
  var errio: js.UndefOr[ErrioConfig] = js.undefined
  
  var load: js.UndefOr[LoadConfig] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var logger: js.UndefOr[Logger | Stream] = js.undefined
  
  var maxRecursion: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pluginTimeout: js.UndefOr[Double] = js.undefined
  
  var prettyLog: js.UndefOr[Boolean] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double | `2000`] = js.undefined
  
  var traceLog: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBloomrun(value: BloomrunConfig): Self = StObject.set(x, "bloomrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBloomrunUndefined: Self = StObject.set(x, "bloomrun", js.undefined)
    
    @scala.inline
    def setChildLogger(value: Boolean): Self = StObject.set(x, "childLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLoggerUndefined: Self = StObject.set(x, "childLogger", js.undefined)
    
    @scala.inline
    def setErrio(value: ErrioConfig): Self = StObject.set(x, "errio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrioUndefined: Self = StObject.set(x, "errio", js.undefined)
    
    @scala.inline
    def setLoad(value: LoadConfig): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger | Stream): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMaxRecursion(value: Double): Self = StObject.set(x, "maxRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecursionUndefined: Self = StObject.set(x, "maxRecursion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPluginTimeout(value: Double): Self = StObject.set(x, "pluginTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginTimeoutUndefined: Self = StObject.set(x, "pluginTimeout", js.undefined)
    
    @scala.inline
    def setPrettyLog(value: Boolean): Self = StObject.set(x, "prettyLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyLogUndefined: Self = StObject.set(x, "prettyLog", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | `2000`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTraceLog(value: Boolean): Self = StObject.set(x, "traceLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceLogUndefined: Self = StObject.set(x, "traceLog", js.undefined)
  }
}
