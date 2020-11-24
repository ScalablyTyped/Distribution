package typings.normalizr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("normalizr", "normalize")
@js.native
object normalize extends js.Object {
  
  def apply[T, E, R](data: js.Any, schema: Schema_[T]): NormalizedSchema[E, R] = js.native
}
