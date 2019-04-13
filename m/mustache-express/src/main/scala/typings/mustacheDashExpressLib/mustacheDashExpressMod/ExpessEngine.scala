package typings
package mustacheDashExpressLib.mustacheDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpessEngine extends js.Object {
  var cache: TemplateCache = js.native
  def apply(path: java.lang.String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

