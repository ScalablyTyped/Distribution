package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, name */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter")
@js.native
class AppServiceActionParameter protected ()
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
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FAppServiceActionParameter: IAppServiceAction = js.native
  @JSName("model")
  var model_FAppServiceActionParameter: IModel = js.native
  @JSName("name")
  val name_FAppServiceActionParameter: String = js.native
  def canBeEmpty: Boolean = js.native
  def canBeEmpty_=(newValue: Boolean): Unit = js.native
  def containerAsAppServiceAction: AppServiceAction = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAppServiceActionParameter: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter")
@js.native
object AppServiceActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AppServiceActionParameter = js.native
  /**
    * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
    * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
    * of the parent AppServiceAction element passed as argument.
    */
  def createIn(container: AppServiceAction): AppServiceActionParameter = js.native
}

