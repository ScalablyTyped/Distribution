package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsOrUrl extends js.Object {
  def apply(
    optsOrUrl: (phinLib.phinMod.PhinNs.Options with (Anon_FalseJsonParse | Anon_FalseNone | Anon_Stream)) | phinLib.phinMod.PhinNs.Options
  ): js.Promise[phinLib.phinMod.PhinNs.StreamResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.PhinNs.JsonResponse] = js.native
}

