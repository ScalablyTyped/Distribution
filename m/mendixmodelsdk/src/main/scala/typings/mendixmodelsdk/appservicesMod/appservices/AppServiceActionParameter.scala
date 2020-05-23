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
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def canBeEmpty: Boolean = js.native
  def canBeEmpty(newValue: Boolean): js.Any = js.native
  def containerAsAppServiceAction: AppServiceAction = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  def parameterType(newValue: DataType): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAppServiceActionParameter: String | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def `type`(newValue: String): js.Any = js.native
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

