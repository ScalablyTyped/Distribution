package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distCommonMod.common.IPoint
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes, isRemote, remoteSourceDocument, remoteSourceDocumentQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
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
  val accessRules: IList[AccessRule] = js.native
  val attributes: IList[Attribute | IAttribute] = js.native
  val containerAsDomainModel: DomainModel | IDomainModel = js.native
  var dataStorageGuid: String = js.native
  var documentation: String = js.native
  val eventHandlers: IList[EventHandler] = js.native
  var generalization: GeneralizationBase | IGeneralizationBase = js.native
  var image: IImage | Null = js.native
  val imageQualifiedName: String | Null = js.native
  val indexes: IList[Index] = js.native
  /**
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  var isRemote: Boolean = js.native
  var location: IPoint = js.native
  @JSName("model")
  var model_Entity: IModel = js.native
  var name: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  var remoteSource: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.2.0: introduced
    */
  var remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  val remoteSourceDocumentQualifiedName: Null | String = js.native
  val validationRules: IList[ValidationRule] = js.native
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

