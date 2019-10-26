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
  val containerAsDomainModel: DomainModel | IDomainModel = js.native
  var dataStorageGuid: String = js.native
  var deleteBehavior: AssociationDeleteBehavior = js.native
  var documentation: String = js.native
  @JSName("model")
  var model_AssociationBase: IModel = js.native
  var name: String = js.native
  var owner: AssociationOwner = js.native
  var parent: Entity | IEntity = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.3.0: introduced
    */
  var remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  val remoteSourceDocumentQualifiedName: Null | String = js.native
  var `type`: AssociationType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationBase")
@js.native
object AssociationBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

