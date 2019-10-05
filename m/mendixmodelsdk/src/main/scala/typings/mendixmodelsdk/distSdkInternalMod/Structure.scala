package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Structure")
@js.native
abstract class Structure protected ()
  extends typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure {
  def this(
    _model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    structureTypeName: String,
    id: String
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean
  ) = this()
  def this(
    _model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
}

