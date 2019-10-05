package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Structure")
@js.native
abstract class Structure protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.Structure {
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

