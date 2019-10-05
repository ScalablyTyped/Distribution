package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AppServiceCallAction")
@js.native
class AppServiceCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var appServiceAction: IAppServiceAction | Null = js.native
  val appServiceActionQualifiedName: String | Null = js.native
  var outputVariableName: String = js.native
  val parameterMappings: IList[AppServiceCallParameterMapping] = js.native
  var useVariable: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AppServiceCallAction")
@js.native
object AppServiceCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AppServiceCallAction = js.native
  /**
    * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
    * The new AppServiceCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): AppServiceCallAction = js.native
}

