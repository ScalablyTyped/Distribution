package typings.natsHemera.mod

import typings.natsHemera.natsHemeraNumbers.`2000`
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var bloomrun: js.UndefOr[BloomrunConfig] = js.native
  
  var childLogger: js.UndefOr[Boolean] = js.native
  
  var errio: js.UndefOr[ErrioConfig] = js.native
  
  var load: js.UndefOr[LoadConfig] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  var logger: js.UndefOr[Logger | Stream] = js.native
  
  var maxRecursion: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pluginTimeout: js.UndefOr[Double] = js.native
  
  var prettyLog: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double | `2000`] = js.native
  
  var traceLog: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBloomrun(value: BloomrunConfig): Self = this.set("bloomrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBloomrun: Self = this.set("bloomrun", js.undefined)
    
    @scala.inline
    def setChildLogger(value: Boolean): Self = this.set("childLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLogger: Self = this.set("childLogger", js.undefined)
    
    @scala.inline
    def setErrio(value: ErrioConfig): Self = this.set("errio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrio: Self = this.set("errio", js.undefined)
    
    @scala.inline
    def setLoad(value: LoadConfig): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger | Stream): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxRecursion(value: Double): Self = this.set("maxRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecursion: Self = this.set("maxRecursion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPluginTimeout(value: Double): Self = this.set("pluginTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginTimeout: Self = this.set("pluginTimeout", js.undefined)
    
    @scala.inline
    def setPrettyLog(value: Boolean): Self = this.set("prettyLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyLog: Self = this.set("prettyLog", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | `2000`): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTraceLog(value: Boolean): Self = this.set("traceLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceLog: Self = this.set("traceLog", js.undefined)
  }
}
