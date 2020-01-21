package typings.nodal.mod

import typings.nodal.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "ModelArray")
@js.native
class ModelArray[T] protected () extends ItemArray[T] {
  def this(modelConstructor: TypeofClassModel) = this()
  var Model: TypeofClassModel = js.native
  /* private */ def __saveAll__(callback: js.Any): js.Any = js.native
  def destroyAll(callback: js.Function): Unit = js.native
  def destroyCascade(callback: js.Function): Unit = js.native
  def has(model: Model): Boolean = js.native
  def readAll(data: js.Object): Boolean = js.native
  def saveAll(callback: js.Function): js.UndefOr[js.Function] = js.native
  def setAll(field: String, value: String): Boolean = js.native
  def toObject(): js.Any = js.native
}

/* static members */
@JSImport("nodal", "ModelArray")
@js.native
object ModelArray extends js.Object {
  def from[T](arr: js.Array[Model]): ModelArray[T] = js.native
}

