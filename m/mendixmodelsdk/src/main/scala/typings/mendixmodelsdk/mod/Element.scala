package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk", "Element")
@js.native
open class Element[TModel /* <: IAbstractModel */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalMod.Element[TModel] {
  def this(
    model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel],
    container: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
  ) = this()
}
