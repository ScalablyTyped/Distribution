package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.DocumentTemplateParameterMapping")
@js.native
class DocumentTemplateParameterMapping protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.DocumentTemplateParameterMapping")
@js.native
object DocumentTemplateParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * The new DocumentTemplateParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent GenerateDocumentAction element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.GenerateDocumentAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping = js.native
}

