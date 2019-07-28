package typings.phin

import typings.phin.phinMod.JsonResponse
import typings.phin.phinMod.Options
import typings.phin.phinMod.StreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptsOrUrl extends js.Object {
  def apply(optsOrUrl: (Options with (Anon_FalseJsonParse | Anon_FalseNone | Anon_Stream)) | Options): js.Promise[StreamResponse] = js.native
  def apply(optsOrUrl: String): js.Promise[JsonResponse] = js.native
}

