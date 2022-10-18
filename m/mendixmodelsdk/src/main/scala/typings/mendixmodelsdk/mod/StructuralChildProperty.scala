package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildProperty")
@js.native
open class StructuralChildProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: T,
    targetRefType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: Null,
    targetRefType: String
  ) = this()
}
