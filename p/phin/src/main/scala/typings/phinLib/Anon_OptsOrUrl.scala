package typings
package phinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_OptsOrUrl extends js.Object {
  def apply(
    optsOrUrl: (phinLib.phinMod.Options with (Anon_FalseJsonParse | Anon_FalseNone | Anon_Stream)) | phinLib.phinMod.Options
  ): js.Promise[phinLib.phinMod.StreamResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.JsonResponse] = js.native
}

