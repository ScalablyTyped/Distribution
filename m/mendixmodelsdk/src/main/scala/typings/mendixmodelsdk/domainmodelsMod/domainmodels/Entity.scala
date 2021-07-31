package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/entities relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, generalization, attributes, isRemote, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, capabilities */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
@js.native
class Entity protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def accessRules: IList[AccessRule] = js.native
  
  def attributes: IList[Attribute] = js.native
  @JSName("attributes")
  val attributes_FEntity: IList[IAttribute] = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def capabilities: EntityCapabilities = js.native
  def capabilities_=(newValue: EntityCapabilities): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.12.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FEntity: IEntityCapabilities = js.native
  
  def containerAsDomainModel: DomainModel = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FEntity: IDomainModel = js.native
  
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def eventHandlers: IList[EventHandler] = js.native
  
  def generalization: GeneralizationBase = js.native
  def generalization_=(newValue: GeneralizationBase): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("generalization")
  val generalization_FEntity: IGeneralizationBase = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def indexes: IList[Index] = js.native
  
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  def isRemote: Boolean = js.native
  def isRemote_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.10.0: deleted
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  @JSName("isRemote")
  val isRemote_FEntity: Boolean = js.native
  
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
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
  @JSName("qualifiedName")
  def qualifiedName_MEntity: String | Null = js.native
  
  /**
    * In version 8.10.0: deleted
    * In version 7.17.0: introduced
    */
  def remoteSource: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  def remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  
  def remoteSourceDocumentQualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FEntity: String | Null = js.native
  
  def remoteSourceDocument_=(newValue: IRemoteEntitySourceDocument | Null): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.10.0: deleted
    * In version 8.2.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FEntity: IRemoteEntitySourceDocument | Null = js.native
  
  def remoteSource_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def source: EntitySource | Null = js.native
  def source_=(newValue: EntitySource | Null): Unit = js.native
  /**
    * In version 8.10.0: introduced
    */
  @JSName("source")
  val source_FEntity: IEntitySource | Null = js.native
  
  def validationRules: IList[ValidationRule] = js.native
}
object Entity {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Entity]
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: DomainModel): Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Entity]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Entity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
