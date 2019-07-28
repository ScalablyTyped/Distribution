package typings.phin

import typings.phin.phinMod.AnyResponse
import typings.phin.phinMod.Options
import typings.phin.phinMod.StreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptsOrUrlAnonFalseJsonParseStream1840517126 extends js.Object {
  def apply(
    optsOrUrl: (Options with (Anon_FalseJsonParseStream_1840517126 | Anon_FalseNoneParse | Anon_Stream)) | Options
  ): js.Promise[StreamResponse] = js.native
  def apply(optsOrUrl: String): js.Promise[AnyResponse] = js.native
}

