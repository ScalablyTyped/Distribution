package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk", "Structure")
@js.native
open class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalMod.Structure[TModel, TContainer] {
  def this(
    _model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Unit,
    container: IContainer
  ) = this()
}
