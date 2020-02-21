package typings.normalizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SchemaValue[T] = typings.normalizr.mod.Schema_[T] | typings.normalizr.mod.SchemaValueFunction[T]
  type SchemaValueFunction[T] = js.Function1[/* t */ T, typings.normalizr.mod.Schema_[T]]
}
