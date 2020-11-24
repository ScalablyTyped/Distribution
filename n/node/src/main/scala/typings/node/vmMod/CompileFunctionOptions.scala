package typings.node.vmMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileFunctionOptions extends BaseOptions {
  
  /**
    * Provides an optional data with V8's code cache data for the supplied source.
    */
  var cachedData: js.UndefOr[Buffer] = js.native
  
  /**
    * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
    */
  var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    * The sandbox/context in which the said function should be compiled in.
    */
  var parsingContext: js.UndefOr[Context] = js.native
  
  /**
    * Specifies whether to produce new cache data.
    * Default: `false`,
    */
  var produceCachedData: js.UndefOr[Boolean] = js.native
}
object CompileFunctionOptions {
  
  @scala.inline
  def apply(): CompileFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileFunctionOptions]
  }
  
  @scala.inline
  implicit class CompileFunctionOptionsOps[Self <: CompileFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setCachedData(value: Buffer): Self = this.set("cachedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedData: Self = this.set("cachedData", js.undefined)
    
    @scala.inline
    def setContextExtensionsVarargs(value: js.Object*): Self = this.set("contextExtensions", js.Array(value :_*))
    
    @scala.inline
    def setContextExtensions(value: js.Array[js.Object]): Self = this.set("contextExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextExtensions: Self = this.set("contextExtensions", js.undefined)
    
    @scala.inline
    def setParsingContext(value: Context): Self = this.set("parsingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsingContext: Self = this.set("parsingContext", js.undefined)
    
    @scala.inline
    def setProduceCachedData(value: Boolean): Self = this.set("produceCachedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduceCachedData: Self = this.set("produceCachedData", js.undefined)
  }
}
