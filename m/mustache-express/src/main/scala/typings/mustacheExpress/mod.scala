package typings.mustacheExpress

import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  def apply(): ExpessEngine = js.native
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  def apply(partialsPath: js.UndefOr[scala.Nothing], partialsExt: String): ExpessEngine = js.native
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  def apply(partialsPath: String): ExpessEngine = js.native
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  def apply(partialsPath: String, partialsExt: String): ExpessEngine = js.native
  
  @js.native
  trait ExpessEngine extends StObject {
    
    def apply(path: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var cache: TemplateCache = js.native
  }
  
  type TemplateCache = Cache
}
