package typings.pegjs.mod

import typings.pegjs.pegjsStrings.size
import typings.pegjs.pegjsStrings.speed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptionsBase extends js.Object {
  
  /** rules the parser will be allowed to start parsing from (default: the first rule in the grammar) */
  var allowedStartRules: js.UndefOr[js.Array[String]] = js.native
  
  /** if `true`, makes the parser cache results, avoiding exponential parsing time in pathological cases but making the parser slower (default: `false`) */
  var cache: js.UndefOr[Boolean] = js.native
  
  /** selects between optimizing the generated parser for parsing speed (`"speed"`) or code size (`"size"`) (default: `"speed"`) */
  var optimize: js.UndefOr[speed | size] = js.native
  
  /** plugins to use */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  
  /** makes the parser trace its progress (default: `false`) */
  var trace: js.UndefOr[Boolean] = js.native
}
object BuildOptionsBase {
  
  @scala.inline
  def apply(): BuildOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptionsBase]
  }
  
  @scala.inline
  implicit class BuildOptionsBaseOps[Self <: BuildOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setAllowedStartRulesVarargs(value: String*): Self = this.set("allowedStartRules", js.Array(value :_*))
    
    @scala.inline
    def setAllowedStartRules(value: js.Array[String]): Self = this.set("allowedStartRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedStartRules: Self = this.set("allowedStartRules", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setOptimize(value: speed | size): Self = this.set("optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimize: Self = this.set("optimize", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
}
