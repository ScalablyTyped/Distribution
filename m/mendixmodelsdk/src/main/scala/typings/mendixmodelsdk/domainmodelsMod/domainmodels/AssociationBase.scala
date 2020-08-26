package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, capabilities */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
abstract class AssociationBase protected ()
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
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.11.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FAssociationBase: IAssociationCapabilities = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_FAssociationBase: IDomainModel = js.native
  @JSName("model")
  var model_FAssociationBase: IModel = js.native
  @JSName("name")
  val name_FAssociationBase: String = js.native
  @JSName("owner")
  val owner_FAssociationBase: AssociationOwner = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("parent")
  val parent_FAssociationBase: IEntity = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FAssociationBase: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.10.0: deleted
    * In version 8.3.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FAssociationBase: IRemoteEntitySourceDocument | Null = js.native
  /**
    * In version 8.10.0: introduced
    */
  @JSName("source")
  val source_FAssociationBase: IAssociationSource | Null = js.native
  @JSName("type")
  val type_FAssociationBase: AssociationType = js.native
  /**
    * In version 8.11.0: introduced
    */
  def capabilities: AssociationCapabilities = js.native
  def capabilities_=(newValue: AssociationCapabilities): Unit = js.native
  def containerAsDomainModel: DomainModel = js.native
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  def deleteBehavior: AssociationDeleteBehavior = js.native
  def deleteBehavior_=(newValue: AssociationDeleteBehavior): Unit = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def owner: AssociationOwner = js.native
  def owner_=(newValue: AssociationOwner): Unit = js.native
  def parent: Entity = js.native
  def parent_=(newValue: Entity): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAssociationBase: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.10.0: deleted
    * In version 8.3.0: introduced
    */
  def remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  def remoteSourceDocumentQualifiedName: String | Null = js.native
  def remoteSourceDocument_=(newValue: IRemoteEntitySourceDocument | Null): Unit = js.native
  /**
    * In version 8.10.0: introduced
    */
  def source: AssociationSource | Null = js.native
  def source_=(newValue: AssociationSource | Null): Unit = js.native
  def `type`: AssociationType = js.native
  def type_=(newValue: AssociationType): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
object AssociationBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

