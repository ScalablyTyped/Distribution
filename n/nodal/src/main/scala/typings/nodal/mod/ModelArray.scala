package typings.nodal.mod

import typings.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "ModelArray")
@js.native
class ModelArray[T] protected () extends ItemArray[T] {
  def this(modelConstructor: TypeofModel) = this()
  
  var Model: TypeofModel = js.native
  
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
object ModelArray {
  
  @JSImport("nodal", "ModelArray")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def from[T](arr: js.Array[Model]): ModelArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arr.asInstanceOf[js.Any]).asInstanceOf[ModelArray[T]]
}
