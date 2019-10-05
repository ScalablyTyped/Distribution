package typings.normalizr.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalizr", "normalize")
@js.native
object normalize extends js.Object {
  def apply[T, E, R](data: js.Any, schema: Schema[T]): NormalizedSchema[E, R] = js.native
}

