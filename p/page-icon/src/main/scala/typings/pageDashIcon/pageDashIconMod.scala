package typings.pageDashIcon

import typings.pageDashIcon.PageIcon.FetchOptions
import typings.pageDashIcon.PageIcon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("page-icon", JSImport.Namespace)
@js.native
object pageDashIconMod extends js.Object {
  def apply(url: String): js.Promise[Icon] = js.native
  def apply(url: String, opts: FetchOptions): js.Promise[Icon] = js.native
}

