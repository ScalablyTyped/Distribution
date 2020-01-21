package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IPoint
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes, isRemote, remoteSourceDocument, remoteSourceDocumentQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
@js.native
class Entity protected ()
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
  @JSName("attributes")
  val attributes_FEntity: IList[IAttribute] = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FEntity: IDomainModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FEntity: IGeneralizationBase = js.native
  /**
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  @JSName("isRemote")
  val isRemote_FEntity: Boolean = js.native
  @JSName("model")
  var model_FEntity: IModel = js.native
  @JSName("name")
  val name_FEntity: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FEntity: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.2.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FEntity: IRemoteEntitySourceDocument | Null = js.native
  def accessRules(): IList[AccessRule] = js.native
  def attributes(): IList[Attribute] = js.native
  def containerAsDomainModel(): DomainModel = js.native
  def dataStorageGuid(): String = js.native
  def dataStorageGuid(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def eventHandlers(): IList[EventHandler] = js.native
  def generalization(): GeneralizationBase = js.native
  def generalization(newValue: GeneralizationBase): js.Any = js.native
  def image(): js.Any = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName(): String | Null = js.native
  @JSName("image")
  def image_Union(): IImage | Null = js.native
  def indexes(): IList[Index] = js.native
  /**
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  def isRemote(): Boolean = js.native
  def isRemote(newValue: Boolean): js.Any = js.native
  def location(): IPoint = js.native
  def location(newValue: IPoint): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MEntity(): String | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  def remoteSource(): String = js.native
  def remoteSource(newValue: String): js.Any = js.native
  def remoteSourceDocument(): js.Any = js.native
  def remoteSourceDocument(newValue: IRemoteEntitySourceDocument): js.Any = js.native
  def remoteSourceDocumentQualifiedName(): String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.2.0: introduced
    */
  @JSName("remoteSourceDocument")
  def remoteSourceDocument_Union(): IRemoteEntitySourceDocument | Null = js.native
  def validationRules(): IList[ValidationRule] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
@js.native
object Entity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Entity = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): Entity = js.native
}

