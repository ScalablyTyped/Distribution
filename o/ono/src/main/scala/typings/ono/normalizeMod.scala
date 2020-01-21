package typings.ono

import typings.ono.typesMod.ErrorLike
import typings.ono.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalizeArgs[E /* <: ErrorLike */, P /* <: js.Object */](args: js.Array[_], options: OnoOptions): AnonMessage[E, P] = js.native
  def normalizeOptions(): OnoOptions = js.native
  def normalizeOptions(options: OnoOptions): OnoOptions = js.native
}

