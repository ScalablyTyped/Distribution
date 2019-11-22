package typings.mendixmodelsdk.distSdkInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element protected ()
  extends typings.mendixmodelsdk.distSdkInternalElementsMod.Element {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
  ) = this()
}

