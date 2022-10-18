package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildListProperty")
@js.native
open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}
