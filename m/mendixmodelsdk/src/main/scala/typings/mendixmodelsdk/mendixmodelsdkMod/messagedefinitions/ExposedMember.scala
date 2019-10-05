package typings.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
@js.native
abstract class ExposedMember protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.ExposedMember {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
@js.native
object ExposedMember extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
}

