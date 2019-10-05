package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}

