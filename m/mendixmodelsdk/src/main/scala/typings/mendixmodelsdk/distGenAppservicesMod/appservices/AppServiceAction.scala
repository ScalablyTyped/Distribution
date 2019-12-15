package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
@js.native
class AppServiceAction protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsConsumedAppService")
  val containerAsConsumedAppService_FAppServiceAction: IConsumedAppService = js.native
  @JSName("model")
  var model_FAppServiceAction: IModel = js.native
  @JSName("name")
  val name_FAppServiceAction: String = js.native
  @JSName("parameters")
  val parameters_FAppServiceAction: IList[IAppServiceActionParameter] = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * In version 7.9.0: introduced
    */
  def actionReturnType(): DataType = js.native
  def actionReturnType(newValue: DataType): js.Any = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsConsumedAppService(): ConsumedAppService = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def image(): String = js.native
  def image(newValue: String): js.Any = js.native
  def microflow(): IMicroflow | Null = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Any(): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def parameters(): IList[AppServiceActionParameter] = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAppServiceAction(): String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType(): String = js.native
  def returnType(newValue: String): js.Any = js.native
  def returnTypeCanBeEmpty(): Boolean = js.native
  def returnTypeCanBeEmpty(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
@js.native
object AppServiceAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AppServiceAction = js.native
  /**
    * Creates and returns a new AppServiceAction instance in the SDK and on the server.
    * The new AppServiceAction will be automatically stored in the 'actions' property
    * of the parent ConsumedAppService element passed as argument.
    */
  def createIn(container: ConsumedAppService): AppServiceAction = js.native
}

