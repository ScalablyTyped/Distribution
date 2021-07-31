package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildProperty")
@js.native
class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.StructuralChildProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T,
    targetRefType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.unitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: Null,
    targetRefType: String
  ) = this()
}
