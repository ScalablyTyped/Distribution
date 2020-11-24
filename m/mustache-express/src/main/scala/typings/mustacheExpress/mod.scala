package typings.mustacheExpress

import typings.std.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mustache-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): ExpessEngine = js.native
  def apply(partialsPath: js.UndefOr[scala.Nothing], partialsExt: String): ExpessEngine = js.native
  def apply(partialsPath: String): ExpessEngine = js.native
  def apply(partialsPath: String, partialsExt: String): ExpessEngine = js.native
  
  @js.native
  trait ExpessEngine extends js.Object {
    
    def apply(path: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var cache: TemplateCache = js.native
  }
  
  type TemplateCache = Cache
}
