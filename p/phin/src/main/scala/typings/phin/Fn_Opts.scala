package typings.phin

import typings.phin.phinMod.JsonResponse
import typings.phin.phinMod.Options
import typings.phin.phinMod.StreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Opts extends js.Object {
  def apply(
    opts: (Options with (Anon_FalseJsonParseStream_1840517126 | Anon_FalseNoneParseStream | Anon_StreamTrue)) | Options
  ): js.Promise[JsonResponse] = js.native
  def apply(opts: String): js.Promise[StreamResponse] = js.native
}

