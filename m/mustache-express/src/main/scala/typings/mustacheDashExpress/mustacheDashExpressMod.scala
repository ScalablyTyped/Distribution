package typings.mustacheDashExpress

import typings.mustacheDashExpress.mustacheDashExpressMod.ExpessEngine
import typings.mustacheDashExpress.mustacheDashExpressMod.TemplateCache
import typings.std.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mustache-express", JSImport.Namespace)
@js.native
object mustacheDashExpressMod extends js.Object {
  @js.native
  trait ExpessEngine extends js.Object {
    var cache: TemplateCache = js.native
    def apply(path: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  }
  
  def apply(): ExpessEngine = js.native
  def apply(partialsPath: String): ExpessEngine = js.native
  def apply(partialsPath: String, partialsExt: String): ExpessEngine = js.native
  type TemplateCache = Cache
}

