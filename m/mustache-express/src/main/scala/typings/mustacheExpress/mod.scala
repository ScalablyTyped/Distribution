package typings.mustacheExpress

import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ExpessEngine = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExpessEngine]
  @scala.inline
  def apply(partialsPath: String): ExpessEngine = ^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any]).asInstanceOf[ExpessEngine]
  @scala.inline
  def apply(partialsPath: String, partialsExt: String): ExpessEngine = (^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any], partialsExt.asInstanceOf[js.Any])).asInstanceOf[ExpessEngine]
  @scala.inline
  def apply(partialsPath: Unit, partialsExt: String): ExpessEngine = (^.asInstanceOf[js.Dynamic].apply(partialsPath.asInstanceOf[js.Any], partialsExt.asInstanceOf[js.Any])).asInstanceOf[ExpessEngine]
  
  @JSImport("mustache-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ExpessEngine extends StObject {
    
    def apply(path: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    
    var cache: TemplateCache = js.native
  }
  
  type TemplateCache = Cache
}
