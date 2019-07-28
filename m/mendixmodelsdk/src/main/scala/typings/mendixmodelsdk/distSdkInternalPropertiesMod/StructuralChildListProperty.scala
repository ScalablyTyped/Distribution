package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesStructuralMod.StructuralChildListProperty[T] {
  def this(declaredOn: IStructureClass, parent: StructuralUnit, name: String, value: js.Array[T]) = this()
  def this(
    declaredOn: IStructureClass,
    parent: StructuralUnit,
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}

