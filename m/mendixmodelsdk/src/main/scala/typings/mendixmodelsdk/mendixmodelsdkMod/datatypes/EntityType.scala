package typings.mendixmodelsdk.mendixmodelsdkMod.datatypes

import typings.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "datatypes.EntityType")
@js.native
abstract class EntityType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datatypes.EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "datatypes.EntityType")
@js.native
object EntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

