package typings.normalizr.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaArray[T]
  extends Array[Schema_[T]]
     with Schema_[T]

