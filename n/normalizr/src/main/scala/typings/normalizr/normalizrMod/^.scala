package typings.normalizr.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalizr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def denormalize(input: js.Any, schema: Schema[_], entities: js.Any): js.Any = js.native
  def normalize[T, E, R](data: js.Any, schema: Schema[T]): NormalizedSchema[E, R] = js.native
}

