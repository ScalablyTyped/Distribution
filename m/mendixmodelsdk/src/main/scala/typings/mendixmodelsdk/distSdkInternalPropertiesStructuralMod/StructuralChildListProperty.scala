package typings.mendixmodelsdk.distSdkInternalPropertiesStructuralMod

import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/structural", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends AbstractProperty[js.Array[T], IList[T]] {
  def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: js.Array[T]) = this()
  def this(
    declaredOn: IStructureClass,
    parent: StructuralUnit,
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
  def deepCopyInto(): Unit = js.native
  def detachChild(child: T): Unit = js.native
  def processChildAddition(index: Double): Unit = js.native
  def processChildRemoval(unit: T): Unit = js.native
  def removeChild(child: T): Boolean = js.native
}

