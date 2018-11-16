package typings
package mendixmodelsdkLib.distSdkInternalPropertiesStructuralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/structural", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit | mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit */] protected ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[T]] {
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String, value: js.Array[T]) = this()
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String, value: js.Array[T], targetRefType: java.lang.String) = this()
  def deepCopyInto(): scala.Unit = js.native
  def detachChild(child: T): scala.Unit = js.native
  def processChildAddition(index: scala.Double): scala.Unit = js.native
  def processChildRemoval(unit: T): scala.Unit = js.native
  def removeChild(child: T): scala.Boolean = js.native
}

