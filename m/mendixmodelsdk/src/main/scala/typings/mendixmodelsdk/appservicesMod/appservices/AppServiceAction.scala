package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
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
  def actionReturnType: DataType = js.native
  def actionReturnType(newValue: DataType): js.Any = js.native
  def caption: String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsConsumedAppService: ConsumedAppService = js.native
  def description: String = js.native
  def description(newValue: String): js.Any = js.native
  def image: String = js.native
  def image(newValue: String): js.Any = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName: String | Null = js.native
  @JSName("microflow")
  def microflow_Union: IMicroflow | Null = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  def parameters: IList[AppServiceActionParameter] = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAppServiceAction: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  def returnType(newValue: String): js.Any = js.native
  def returnTypeCanBeEmpty: Boolean = js.native
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

