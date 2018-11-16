package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", "PrimitiveProperty")
@js.native
class PrimitiveProperty[T] ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[T, mobxLib.libTypesObservablevalueMod.IObservableValue[T]] {
  var beforeChange: js.Any = js.native
  var defaultValue: T = js.native
  var primitiveType: js.Any = js.native
  def deepCopyInto(clone: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure): scala.Unit = js.native
  /* protected */ def getRawValue(value: T): js.Any = js.native
  def markCurrentValueAsDefault(): scala.Unit = js.native
  def set(newValue: T): scala.Unit = js.native
  def updateWithRawValue(value: T): scala.Unit = js.native
}

