package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.AbstractElement {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
}

