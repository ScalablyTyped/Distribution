package typings.mendixmodelsdk.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Element")
@js.native
abstract class Element protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.Element {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
  ) = this()
}

