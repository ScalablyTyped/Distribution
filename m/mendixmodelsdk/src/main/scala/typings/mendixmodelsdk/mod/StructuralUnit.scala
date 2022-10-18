package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk", "StructuralUnit")
@js.native
open class StructuralUnit[TModel /* <: IAbstractModel */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalMod.StructuralUnit[TModel] {
  def this(
    model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}
