package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ExportMappingJavaActionParameterValue")
@js.native
class ExportMappingJavaActionParameterValue protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ExportMappingJavaActionParameterValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ExportMappingJavaActionParameterValue")
@js.native
object ExportMappingJavaActionParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ExportMappingJavaActionParameterValue = js.native
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * The new ExportMappingJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.JavaActionParameterMapping): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ExportMappingJavaActionParameterValue = js.native
}

