package typings.mendixmodelsdk.mendixmodelsdkMod.codeactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.ParameterType")
@js.native
abstract class ParameterType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions.ParameterType {
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
@JSImport("mendixmodelsdk", "codeactions.ParameterType")
@js.native
object ParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo = js.native
}

