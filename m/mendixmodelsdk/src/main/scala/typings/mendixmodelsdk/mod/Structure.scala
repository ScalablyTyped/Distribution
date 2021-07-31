package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Structure")
@js.native
abstract class Structure[TModel /* <: IAbstractModel */, TContainer /* <: IContainer | Null */] protected ()
  extends typings.mendixmodelsdk.internalMod.Structure[TModel, TContainer] {
  def this(
    _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Unit,
    container: IContainer
  ) = this()
}
