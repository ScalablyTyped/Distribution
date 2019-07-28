package typings.phin

import typings.phin.phinMod.BufferResponse
import typings.phin.phinMod.Options
import typings.phin.phinMod.StreamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptsOrUrlAnonFalseJsonParseStream extends js.Object {
  def apply(
    optsOrUrl: (Options with (Anon_FalseJsonParseStream | Anon_FalseNoneParse | Anon_StreamTrue)) | Options
  ): js.Promise[BufferResponse] = js.native
  def apply(optsOrUrl: String): js.Promise[StreamResponse] = js.native
}

