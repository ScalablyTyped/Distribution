package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "ModelArray")
@js.native
class ModelArray[T] protected () extends ItemArray[T] {
  def this(modelConstructor: nodalLib.Anon_CalcField) = this()
  var Model: nodalLib.Anon_CalcField = js.native
  /* private */ def `__saveAll__`(callback: js.Any): js.Any = js.native
  def destroyAll(callback: js.Function): scala.Unit = js.native
  def destroyCascade(callback: js.Function): scala.Unit = js.native
  def has(model: Model): scala.Boolean = js.native
  def readAll(data: js.Object): scala.Boolean = js.native
  def saveAll(callback: js.Function): js.UndefOr[js.Function] = js.native
  def setAll(field: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def toObject(): js.Any = js.native
}

@JSImport("nodal", "ModelArray")
@js.native
object ModelArray extends js.Object {
  def from[T](arr: js.Array[nodalLib.nodalMod.Model]): nodalLib.nodalMod.ModelArray[T] = js.native
}

