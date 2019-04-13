package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsOrUrlAnonFalseJsonParseStream extends js.Object {
  def apply(
    optsOrUrl: (phinLib.phinMod.Options with (Anon_FalseJsonParseStream | Anon_FalseNoneParse | Anon_StreamTrue)) | phinLib.phinMod.Options
  ): js.Promise[phinLib.phinMod.BufferResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.StreamResponse] = js.native
}

