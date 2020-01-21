package typings.needle.mod

import typings.needle.mod.core.NeedleReadonlyHttpVerbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
    */
  def apply(
    method: typings.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typings.needle.mod.core.BodyData
  ): js.Promise[typings.needle.mod.core.NeedleResponse] = js.native
  def apply(
    method: typings.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typings.needle.mod.core.BodyData,
    options: typings.needle.mod.core.NeedleOptions
  ): js.Promise[typings.needle.mod.core.NeedleResponse] = js.native
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typings.needle.mod.core.NeedleResponse] = js.native
  def apply(method: NeedleReadonlyHttpVerbs, url: String, options: typings.needle.mod.core.NeedleOptions): js.Promise[typings.needle.mod.core.NeedleResponse] = js.native
}

