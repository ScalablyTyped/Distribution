package typings.phin

import typings.phin.phinMod.BufferResponse
import typings.phin.phinMod.Options
import typings.phin.phinMod.StreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptsOrUrlAnonFalse extends js.Object {
  def apply(optsOrUrl: (Options with (Anon_False | Anon_FalseJson | Anon_Stream)) | Options): js.Promise[StreamResponse] = js.native
  def apply(optsOrUrl: String): js.Promise[BufferResponse] = js.native
}

