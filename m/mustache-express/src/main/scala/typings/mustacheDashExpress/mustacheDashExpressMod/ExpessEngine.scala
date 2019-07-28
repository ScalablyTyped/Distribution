package typings.mustacheDashExpress.mustacheDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpessEngine extends js.Object {
  var cache: TemplateCache = js.native
  def apply(path: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

