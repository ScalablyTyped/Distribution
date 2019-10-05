package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/structural", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesStructuralMod extends js.Object {
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
  
  @js.native
  class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected () extends AbstractProperty[T | Null, IObservableValue[T | Null]] {
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T) = this()
    def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: T, targetRefType: String) = this()
    def this(
      declaredOn: IStructureClass,
      parent: StructuralUnit,
      name: String,
      value: Null,
      targetRefType: String
    ) = this()
    def deepCopyInto(): Unit = js.native
    def detachValue(): Unit = js.native
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
  }
  
}

