package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildListProperty")
@js.native
class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit,
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalUnitsMod.StructuralUnit,
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}

