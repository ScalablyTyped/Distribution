package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
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
  @JSName("model")
  var model_FAppServiceCallAction: IModel = js.native
  def appServiceAction(): js.Any = js.native
  def appServiceAction(newValue: IAppServiceAction): js.Any = js.native
  def appServiceActionQualifiedName(): String | Null = js.native
  @JSName("appServiceAction")
  def appServiceAction_Union(): IAppServiceAction | Null = js.native
  def outputVariableName(): String = js.native
  def outputVariableName(newValue: String): js.Any = js.native
  def parameterMappings(): IList[AppServiceCallParameterMapping] = js.native
  def useVariable(): Boolean = js.native
  def useVariable(newValue: Boolean): js.Any = js.native
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

