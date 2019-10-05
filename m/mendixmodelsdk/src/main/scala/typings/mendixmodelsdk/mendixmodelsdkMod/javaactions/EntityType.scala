package typings.mendixmodelsdk.mendixmodelsdkMod.javaactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk", "javaactions.EntityType")
@js.native
abstract class EntityType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions.EntityType {
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
@JSImport("mendixmodelsdk", "javaactions.EntityType")
@js.native
object EntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
}

