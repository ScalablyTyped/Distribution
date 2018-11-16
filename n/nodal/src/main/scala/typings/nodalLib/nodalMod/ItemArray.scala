package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "ItemArray")
@js.native
class ItemArray[T] ()
  extends stdLib.Array[T] {
  var _meta: js.Any = js.native
  def setMeta(data: IArrayMetadata): IArrayMetadata = js.native
  def toObject(arrInterface: js.Array[java.lang.String]): js.Object = js.native
}

@JSImport("nodal", "ItemArray")
@js.native
object ItemArray extends js.Object {
  def from(arr: js.Array[js.Object]): nodalLib.nodalMod.ItemArray[js.Object] = js.native
}

