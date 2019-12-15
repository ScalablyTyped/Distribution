package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDomainModel, name, `type`, owner, parent, remoteSourceDocument, remoteSourceDocumentQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
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
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("remoteSourceDocumentQualifiedName")
  val remoteSourceDocumentQualifiedName_FAssociationBase: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  @JSName("remoteSourceDocument")
  val remoteSourceDocument_FAssociationBase: IRemoteEntitySourceDocument | Null = js.native
  @JSName("type")
  val type_FAssociationBase: AssociationType = js.native
  def containerAsDomainModel(): DomainModel = js.native
  def dataStorageGuid(): String = js.native
  def dataStorageGuid(newValue: String): js.Any = js.native
  def deleteBehavior(): AssociationDeleteBehavior = js.native
  def deleteBehavior(newValue: AssociationDeleteBehavior): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def owner(): AssociationOwner = js.native
  def owner(newValue: AssociationOwner): js.Any = js.native
  def parent(): Entity = js.native
  def parent(newValue: Entity): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAssociationBase(): String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  def remoteSourceDocument(): IRemoteEntitySourceDocument | Null = js.native
  def remoteSourceDocument(newValue: IRemoteEntitySourceDocument): js.Any = js.native
  def remoteSourceDocumentQualifiedName(): String | Null = js.native
  @JSName("remoteSourceDocument")
  def remoteSourceDocument_Any(): js.Any = js.native
  def `type`(): AssociationType = js.native
  def `type`(newValue: AssociationType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
object AssociationBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

