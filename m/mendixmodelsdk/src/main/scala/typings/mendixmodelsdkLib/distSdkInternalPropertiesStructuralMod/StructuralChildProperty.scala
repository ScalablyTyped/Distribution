package typings
package mendixmodelsdkLib.distSdkInternalPropertiesStructuralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/structural", "StructuralChildProperty")
@js.native
class StructuralChildProperty[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit | mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit */] protected ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[
      T | scala.Null, 
      mobxLib.libTypesObservablevalueMod.IObservableValue[T | scala.Null]
    ] {
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String) = this()
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String, value: T) = this()
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String, value: T, targetRefType: java.lang.String) = this()
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalUnitsMod.StructuralUnit, name: java.lang.String, value: scala.Null, targetRefType: java.lang.String) = this()
  def deepCopyInto(): scala.Unit = js.native
  def detachValue(): scala.Unit = js.native
  def set(): scala.Unit = js.native
  def set(value: T): scala.Unit = js.native
}

