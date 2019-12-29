package typings.mendixmodelsdk.mendixmodelsdkMod.codeactions

import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.Type")
@js.native
abstract class Type protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions.Type {
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
@JSImport("mendixmodelsdk", "codeactions.Type")
@js.native
object Type extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

