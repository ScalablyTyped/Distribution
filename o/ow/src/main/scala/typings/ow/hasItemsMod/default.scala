package typings.ow.hasItemsMod

import typings.ow.owBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow/dist/source/utils/has-items", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](source: CollectionLike[T], items: js.Array[T]): `true` | js.Array[T] = js.native
  def apply[T](source: CollectionLike[T], items: js.Array[T], maxValues: Double): `true` | js.Array[T] = js.native
}

