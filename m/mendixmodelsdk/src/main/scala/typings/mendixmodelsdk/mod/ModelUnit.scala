package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "ModelUnit")
@js.native
abstract class ModelUnit[TModel /* <: IAbstractModel */] protected ()
  extends typings.mendixmodelsdk.internalMod.ModelUnit[TModel] {
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}
