package typings.ono

import typings.ono.esmTypesMod.ErrorLike
import typings.ono.esmTypesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/normalize", JSImport.Namespace)
@js.native
object esmNormalizeMod extends js.Object {
  def normalizeArgs[E /* <: ErrorLike */, P /* <: js.Object */](args: js.Array[_], options: OnoOptions): Anon_Message[E, P] = js.native
  def normalizeOptions(): OnoOptions = js.native
  def normalizeOptions(options: OnoOptions): OnoOptions = js.native
}

