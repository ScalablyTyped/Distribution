package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", "PrimitiveListProperty")
@js.native
class PrimitiveListProperty[T] ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[T]] {
  var primitiveType: js.Any = js.native
  def deepCopyInto(clone: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure): scala.Unit = js.native
  def updateWithRawValue(value: js.Array[T]): scala.Unit = js.native
}

