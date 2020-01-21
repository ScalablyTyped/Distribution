package typings.mendixmodelsdk.allModelClassesMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
class WebServiceOperationAdvancedParameterMapping protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationAdvancedParameterMapping {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
object WebServiceOperationAdvancedParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationAdvancedParameterMapping = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AdvancedRequestHandling element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.AdvancedRequestHandling): typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationAdvancedParameterMapping = js.native
}

