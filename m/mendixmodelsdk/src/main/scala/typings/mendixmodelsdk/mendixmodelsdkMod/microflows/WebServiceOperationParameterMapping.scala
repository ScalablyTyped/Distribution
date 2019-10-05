package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.3.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationParameterMapping")
@js.native
abstract class WebServiceOperationParameterMapping protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.WebServiceOperationParameterMapping {
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
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationParameterMapping")
@js.native
object WebServiceOperationParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
}

