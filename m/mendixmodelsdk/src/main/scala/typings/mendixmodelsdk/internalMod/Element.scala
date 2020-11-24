package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element[TModel /* <: IAbstractModel */] protected ()
  extends typings.mendixmodelsdk.elementsMod.Element[TModel] {
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel],
    container: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]
  ) = this()
}
