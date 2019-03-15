package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsOrUrlAnonFalseJsonParseStream extends js.Object {
  def apply(
    optsOrUrl: (phinLib.phinMod.PhinNs.Options with (Anon_FalseJsonParseStream | Anon_FalseNoneParse | Anon_StreamTrue)) | phinLib.phinMod.PhinNs.Options
  ): js.Promise[phinLib.phinMod.PhinNs.BufferResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.PhinNs.StreamResponse] = js.native
}

