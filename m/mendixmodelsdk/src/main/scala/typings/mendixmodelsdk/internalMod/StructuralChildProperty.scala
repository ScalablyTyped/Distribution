package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralChildProperty")
@js.native
class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
  def this(declaredOn: IStructureClass, parent: typings.mendixmodelsdk.unitsMod.StructuralUnit, name: String) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: T
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: T,
    targetRefType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit,
    name: String,
    value: Null,
    targetRefType: String
  ) = this()
}

